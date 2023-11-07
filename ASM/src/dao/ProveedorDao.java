/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.Proveedor;

/**
 *
 * @author leopa
 */

public class ProveedorDao {
    private Administrador administrador;
     public ProveedorDao(){
        administrador = new Administrador();
    }
    
    public ArrayList<Proveedor> pedirTabla(){
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        Proveedor proveedor;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT * FROM proveedor ORDER BY id_proveedor ASC";
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()){
                proveedor = new Proveedor(resultado.getString("id_proveedor"),
                                          resultado.getString("nombre_proveedor"),
                                          resultado.getString("telefono"),
                                          resultado.getString("correo"),
                                     resultado.getString("id_dias_reparto"));
                                                    
                
                proveedores.add(proveedor);
            }
            comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return proveedores;
    } 
    public void InsertarProveedor(Proveedor proveedor){
        Connection conexion = administrador.dameConexion();
        PreparedStatement comando;
        String comandoSQL;
	try {
            conexion.setAutoCommit(false);
            comandoSQL = "INSERT INTO proveedores VALUES(?,?,?,?,?)";
            comando = conexion.prepareStatement(comandoSQL);
            comando.setString(1,proveedor.getId());
            comando.setString(2, proveedor.getNombre());
            comando.setString(3, proveedor.getNumero());
            comando.setString(3, proveedor.getCorreo());
            comando.setString(3, proveedor.getIdDiaeReparto());
            comando.executeUpdate();
            conexion.commit();
            comando.close();
	} catch (SQLException e) {
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CantidadesDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Error en el registro del proveedor", "Error",JOptionPane.ERROR_MESSAGE);
	}
    }
    
    public void Eliminar(Proveedor proveedor){
         Connection conexion = administrador.dameConexion();
        String comandoSQL;
        comandoSQL = "DELETE FROM proveedor WHERE id_producto like '"+proveedor.getId()+"';";
	PreparedStatement comando;
	try {
		comando = conexion.prepareStatement(comandoSQL);
                comando.executeUpdate();
                comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
    }
     
    public Proveedor buscarProducto(Proveedor proveedor){
        Proveedor proveedorResultado = null;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT * FROM proveedor WHERE id_producto like '"+proveedor.getId()+"'";
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){
                proveedorResultado = new Proveedor(resultado.getString("id_proveedor"),
                                  resultado.getString("nombre_proveedor"),
                                  resultado.getString("numero"),
                                  resultado.getString("correo"),
                             resultado.getString("idDiaeReparto"));
            }
            comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return proveedorResultado;
    }
}
