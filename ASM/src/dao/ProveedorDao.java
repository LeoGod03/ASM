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
import javax.swing.JOptionPane;
import modelo.Proveedor;

/**
 *
 * @author leopa
 */

public class ProveedorDao {
    private final Administrador administrador;
    private final DiasRepartoDao diasReparto;
     public ProveedorDao(){
        administrador = new Administrador();
        diasReparto = new DiasRepartoDao();
    }
    
    public ArrayList<Proveedor> pedirTabla(){
        Connection conexion = administrador.dameConexion();
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        Proveedor proveedor;
	String comandoSQL = "SELECT * FROM proveedor ORDER BY id_proveedor ASC";
	PreparedStatement comando;
        int contador = 0;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ArrayList<boolean[]> dias = diasReparto.pedirTabla(conexion);
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()){
                proveedor = new Proveedor(resultado.getString("id_proveedor"),
                                          resultado.getString("nombre_proveedor"),
                                          resultado.getString("telefono"),
                                          resultado.getString("correo"),
                                                dias.get(contador));
                                 
                
                proveedores.add(proveedor);
                contador++;   
            }
            comando.close();
	} catch (SQLException e) {
		System.out.println("el error esta aqui ProveedorDao");
	}
		
	administrador.cerrarConexion();
        
        return proveedores;
    } 
    
    public void insertar(Proveedor proveedor){
        Connection conexion = administrador.dameConexion();
        PreparedStatement comando;
        String comandoSQL;
	try {
            conexion.setAutoCommit(false);
            comandoSQL = "INSERT INTO proveedor VALUES(?,?,?,?)";
            comando = conexion.prepareStatement(comandoSQL);
            comando.setString(1,proveedor.getId());
            comando.setString(2, proveedor.getNombre());
            comando.setString(3, proveedor.getTelefono());
            comando.setString(4, proveedor.getCorreo());
            diasReparto.insertar(proveedor, conexion);
            comando.executeUpdate();
            conexion.commit();
            comando.close();
            
	} catch (SQLException e) {
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error en el registro del proveedor", "Error",JOptionPane.ERROR_MESSAGE);
	}
    }
    
    public void eliminarProveedor(Proveedor proveedor){
         Connection conexion = administrador.dameConexion();
        String comandoSQL;
        comandoSQL = "DELETE FROM proveedor WHERE id_proveedor like '"+proveedor.getId()+"';";
	PreparedStatement comando;
	try {
            diasReparto.eliminarDiasReparto(proveedor, conexion);
            comando = conexion.prepareStatement(comandoSQL);
            comando.executeUpdate();
            comando.close();
	} catch (SQLException e) {
            System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
    }
     
    public Proveedor buscarProveedor(Proveedor proveedor){
        Proveedor proveedorResultado = null;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT * FROM proveedor WHERE id_proveedor like '"+proveedor.getId()+"'";
	PreparedStatement comando;
	try {
            boolean[] dias = diasReparto.buscarDiasReparto(proveedor, conexion);
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){
                proveedorResultado = new Proveedor(resultado.getString("id_proveedor"),
                                  resultado.getString("nombre_proveedor"),
                                  resultado.getString("telefono"),
                                  resultado.getString("correo"),
                                  dias); 
            }
            comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return proveedorResultado;
    }
    
    public void actualizarProveedor(Proveedor proveedor){
        Connection conexion = administrador.dameConexion();
        String comandoSQL = "UPDATE proveedor "
                          + "SET nombre_proveedor = '"+proveedor.getNombre()+"', "
                          + "telefono = '"+proveedor.getTelefono()+"', "
                          + "correo = '"+proveedor.getCorreo()+"' "
                          + "WHERE id_proveedor = '"+proveedor.getId()+"';";
        PreparedStatement comando;
        try{
            diasReparto.actualizarDiasReparto(proveedor, conexion);
            comando = conexion.prepareStatement(comandoSQL);
            comando.executeUpdate();
            comando.close();
        }catch(SQLException sqle){
            
        }
        administrador.cerrarConexion();
    }
    
    public Proveedor buscarUltimoProveedor(){
        Proveedor proveedorResultado = null;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT id_proveedor " +
                            "FROM proveedor " +
                            "ORDER BY id_proveedor DESC "+
                            "LIMIT 1;";
                        
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next())
                proveedorResultado = new Proveedor(resultado.getString("id_proveedor"));
            
            comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return proveedorResultado;
    }
    
    public ArrayList<Proveedor> buscarPorNombre(String nombre){
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        Proveedor proveedor;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "   SELECT * FROM proveedor WHERE nombre_proveedor like '%" + nombre +"%'";
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()){
                proveedor = new Proveedor(resultado.getString("id_proveedor"),
                                          resultado.getString("nombre_proveedor"),
                                          resultado.getString("telefono"),
                                          resultado.getString("correo"),
                                    diasReparto.buscarDiasReparto(new Proveedor(resultado.getString("id_proveedor")), conexion));
                proveedores.add(proveedor);
            }
            comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return proveedores;
    }
     
 
}
