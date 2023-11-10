/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Proveedor;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author leopa
 */
public class DiasRepartoDao {
    
    
    public DiasRepartoDao(){
        
    }
    public void insertar (Proveedor proveedor, Connection conexion){
	PreparedStatement comando;
        String comandoSQL;
        boolean[] dias = proveedor.getDias();
	try {
            comandoSQL = "INSERT INTO dias_reparto VALUES(?,?,?,?,?,?,?,?)";
            comando = conexion.prepareStatement(comandoSQL);
            comando.setString(1,proveedor.getId());
            for(int i = 0; i < 7; i++)
                comando.setBoolean(i+2, dias[i]);
            comando.executeUpdate();
            comando.close();
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el registro de los dias de reparto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
    }
    public boolean[] buscarDiasReparto(Proveedor proveedor, Connection conexion){
        boolean[] dias = new boolean[7];
        String comandoSQL = "SElECT * FROM dias_reparto WHERE id_proveedor like '"+proveedor.getId()+"';";
        PreparedStatement comando;
        try{
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){
                dias[0] = resultado.getBoolean("lunes");
                dias[1] = resultado.getBoolean("martes");
                dias[2] = resultado.getBoolean("miercoles");
                dias[3] = resultado.getBoolean("jueves");
                dias[4] = resultado.getBoolean("viernes");
                dias[5] = resultado.getBoolean("sabado");
                dias[6] = resultado.getBoolean("domingo");
            }
            comando.close();
        }catch(SQLException sqle){
            
        }
        return dias;
    }
    
    public void eliminarDiasReparto(Proveedor proveedor, Connection conexion){
        String comandoSQL = "DELETE FROM dias_reparto WHERE id_proveedor like '"+proveedor.getId()+"';";
        PreparedStatement comando;
        try{
            comando = conexion.prepareStatement(comandoSQL);
            comando.executeUpdate();
            comando.close();
        }catch(SQLException sqle){
            
        }
    }
    
    public ArrayList<boolean[]> pedirTabla(Connection conexion){
        ArrayList<boolean[]> lista = new ArrayList<>();
        boolean[] dias;
	String comandoSQL = "SELECT * FROM dias_reparto ORDER BY id_proveedor ASC";
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()){
                dias = new boolean[7];
                dias[0] = resultado.getBoolean("lunes");
                dias[1] = resultado.getBoolean("martes");
                dias[2] = resultado.getBoolean("miercoles");
                dias[3] = resultado.getBoolean("jueves");
                dias[4] = resultado.getBoolean("viernes");
                dias[5] = resultado.getBoolean("sabado");
                dias[6] = resultado.getBoolean("domingo");
                lista.add(dias);
            }
            comando.close();
	} catch (SQLException e) {
		System.out.println("el error esta aqui");
        }
        return lista;
    } 
    
    public void actualizarDiasReparto(Proveedor proveedor, Connection conexion){
        boolean[] dias = proveedor.getDias();
        String comandoSQL = "UPDATE dias_reparto "
                          + "SET lunes = "+ dias[0]+","
                          + "martes = " + dias[1]+","
                          + "miercoles = " + dias[2]+","
                          + "jueves = "+dias[3]+","
                          + "viernes = "+dias[4]+","
                          + "sabado = "+dias[5]+", "
                          + "domingo = "+dias[6]+" "
                          + "WHERE id_proveedor like '"+ proveedor.getId()+"';";
        PreparedStatement comando;
        try{
            comando = conexion.prepareStatement(comandoSQL);
            comando.executeUpdate();
            comando.close();
        }catch(SQLException e){
            
        }
        
    }
}
