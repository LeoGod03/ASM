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
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Producto;

public class ProductoDao {
    private Administrador administrador;
    CantidadesDao cantidades;
    
    public ProductoDao(){
        administrador = new Administrador();
        cantidades = new CantidadesDao();
    }
    
    public void insertar (Producto producto) throws SQLException {
        cantidades = new CantidadesDao();
	Connection conexion = administrador.dameConexion();
	PreparedStatement comando;
        String comandoSQL;
	try {
            conexion.setAutoCommit(false);
            comandoSQL = "INSERT INTO inventario VALUES(?,?,?,?,?,?,?)";
            comando = conexion.prepareStatement(comandoSQL);
            comando.setString(1, producto.getId());
            comando.setString(2,producto.getNombre());
            comando.setString(3, producto.getDescripcion());
            comando.setDouble(4, producto.getPrecioPublico());
            comando.setString(5, producto.getIdProveedor());
            comando.setInt(6, producto.getCantidadInventario()); 
            comando.setDouble(7, producto.getPrecioProveedor());
            comando.executeUpdate();
            conexion.commit();
            comando.close();
            cantidades.InsertarProducto(producto, conexion);
	} catch (SQLException e) {
           try {
                conexion.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(CantidadesDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Error en el registro del producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion();
		
    }
    
    public ArrayList<Producto> pedirTabla(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Producto producto;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT * FROM inventario INNER JOIN  control_cantidades ON inventario.id_producto = control_cantidades.id_producto"
                            + " ORDER BY inventario.id_producto ASC";
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()){
                producto = new Producto(resultado.getString("id_producto"),
                                     resultado.getString("nombre_producto"),
                                  resultado.getString("descripcion"),
                                    resultado.getDouble("precio_proveedor"),
                                resultado.getDouble("precio_publico"),
                                     resultado.getString("id_proveedor"),
                                    resultado.getInt("cantidad_en_inventario"),
                                    resultado.getInt("cantidad_minima"),
                                    resultado.getInt("cantidad_pedido"));
                
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
	String comandoSQL = "SELECT * FROM inventario WHERE id_producto like '"+producto.getId()+"'";
	PreparedStatement comando;
	try {
            Producto productoCant = cantidades.buscarProducto(producto);
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){
                productoResultado = new Producto(resultado.getString("id_producto"),
                                            resultado.getString("nombre_producto"),
                                            resultado.getString("descripcion"),
                                            resultado.getDouble("precio_proveedor"),
                                            resultado.getDouble("precio_publico"),
                                            resultado.getString("id_proveedor"),
                                            resultado.getInt("cantidad_en_inventario"),
                                            productoCant.getCantidadMinima(),
                                            productoCant.getCantidadPedido());
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
                "precio_proveedor = "+producto.getPrecioProveedor()+","+
                "precio_publico = " + producto.getPrecioPublico()+","+
                "id_proveedor = '" + producto.getIdProveedor()+"',"+
                "cantidad_en_inventario = "+producto.getCantidadInventario()+" "+
                "where id_producto like '" + producto.getId()+"'; "+
                "UPDATE control_cantidades "+
                "SET cantidad_minima  = "+producto.getCantidadMinima()+","+
                "cantidad_pedido = "+producto.getCantidadPedido()+" "
                +"where id_producto like '"+producto.getId()+"';";
                
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
    
    public Producto buscarUltimoProducto(){
        Producto productoResultado = null;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT inv.*, cont.cantidad_minima, cont.cantidad_pedido " +
                            "FROM inventario AS inv " +
                            "JOIN control_cantidades AS cont ON inv.id_producto = cont.id_producto " +
                            "ORDER BY inv.id_producto DESC "+
                            "LIMIT 1;";
                        
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){
                productoResultado = new Producto(resultado.getString("id_producto"),
                                  resultado.getString("nombre_producto"),
                               resultado.getString("descripcion"),
                               resultado.getDouble("precio_proveedor"),
                             resultado.getDouble("precio_publico"),
                               resultado.getString("id_proveedor"),
                         resultado.getInt("cantidad_en_inventario"),
                            resultado.getInt("cantidad_minima"),
                            resultado.getInt("cantidad_pedido"));
            }
            comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return productoResultado;
    }
    
    public void eliminarProducto(Producto producto){
        CantidadesDao cantidades = new CantidadesDao();
        Connection conexion = administrador.dameConexion();
	String comandoSQL;
        comandoSQL = "DELETE FROM inventario WHERE id_producto like '"+producto.getId()+"';";
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            comando.executeUpdate();
            comando.close();
            cantidades.Eliminar(producto, conexion);
                
	} catch (SQLException e) {
            System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
    }
    
    public ArrayList<Producto> buscarPorNombre(String nombre){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Producto producto;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT inv.*,cont.cantidad_minima,cont.cantidad_pedido FROM inventario AS inv, control_cantidades AS cont WHERE inv.nombre_producto like '%"+nombre+"%'"
                             + " AND inv.id_producto like cont.id_producto";
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()){
                producto = new Producto(resultado.getString("id_producto"),
                                  resultado.getString("nombre_producto"),
                               resultado.getString("descripcion"),
                               resultado.getDouble("precio_proveedor"),
                             resultado.getDouble("precio_publico"),
                                resultado.getString("id_proveedor"),
                                resultado.getInt("cantidad_en_inventario"),
                                resultado.getInt("cantidad_minima"),
                                 resultado.getInt("cantidad_pedido"));
                productos.add(producto);
            }
            comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return productos;
    }
    
}
