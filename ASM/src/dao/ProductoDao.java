/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author leopa
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Producto;

public class ProductoDao {
    private Administrador administrador;
    
    public ProductoDao(){
        administrador = new Administrador();
    }
    
    public void insertar (Producto producto) throws SQLException {
		
	Connection conexion = administrador.dameConexion();
	PreparedStatement comando;
        String comandoSQL;
	try {
            conexion.setAutoCommit(false);
            comandoSQL = "INSERT INTO inventario VALUES(?,?,?,?,?,?)";
            comando = conexion.prepareStatement(comandoSQL);
            comando.setString(1, producto.getId());
            comando.setString(2,producto.getNombre());
            comando.setString(3, producto.getDescripcion());
            comando.setDouble(4, producto.getPrecioPublico());
            comando.setString(5, producto.getIdProveedor());
            comando.setInt(6, producto.getCantidadInventario());
            //comandoSQL = "INSERT INTO control_cantidades VALUES(?,?,?)";
            //comando = conexion.prepareStatement(comandoSQL);
            //------------>falta la cantidad minima y la cantidad de pedido, en la clase normal
            //------------>despues para esta clase
            
            comando.executeUpdate();
            conexion.commit();
            comando.close();
	} catch (SQLException e) {
            conexion.rollback();
            JOptionPane.showMessageDialog(null, "Error en el registro del producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion();
		
    }
    
    public ArrayList<Producto> pedirTabla(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Producto producto;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT * FROM inventario ORDER BY id_producto ASC";
	PreparedStatement comando;
	try {
                            comando = conexion.prepareStatement(comandoSQL);
                            ResultSet resultado = comando.executeQuery();
                            while(resultado.next()){
                            producto = new Producto(resultado.getString("id_producto"),
                                                resultado.getString("nombre_producto"),
                                            resultado.getString("descripcion"),
                                          resultado.getDouble("precio_publico"),
                                            resultado.getString("id_proveedor"),
                                    resultado.getInt("cantidad_en_inventario"));
                           productos.add(producto);
                }
                comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return productos;
    }
    
    public Producto buscarProducto(Producto producto){
        Producto productoResultado = null;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT * FROM inventario WHERE id_producto  like '" + producto.getId()+"';";
	PreparedStatement comando;
	try {
                          comando = conexion.prepareStatement(comandoSQL);
                           ResultSet resultado = comando.executeQuery();
                            if(resultado.next()){
                                productoResultado = new Producto(resultado.getString("id_producto"),
                                                resultado.getString("nombre_producto"),
                                            resultado.getString("descripcion"),
                                          resultado.getDouble("precio_publico"),
                                            resultado.getString("id_proveedor"),
                                    resultado.getInt("cantidad_en_inventario"));
                }
                comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return productoResultado;
    }
     
    public void actualizarProducto(Producto producto){
        Connection conexion = administrador.dameConexion();
	String comandoSQL;
        comandoSQL = "UPDATE inventario "+
                "SET nombre_producto = '" + producto.getNombre()+"',"+
                "descripcion = '" + producto.getDescripcion()+"',"+
                "precio_publico = " + producto.getPrecioPublico()+","+
                "id_proveedor = '" + producto.getIdProveedor()+"'"+
                "where id_producto like '" + producto.getId()+"';";
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
    
    
    public void eliminarProducto(Producto producto){
        Connection conexion = administrador.dameConexion();
	String comandoSQL;
        comandoSQL = "DELETE FROM inventario WHERE id_producto like '"+producto.getId()+"';";
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
        
}
