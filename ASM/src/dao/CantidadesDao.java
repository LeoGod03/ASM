/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class CantidadesDao {
    private final Administrador administrador;
    public CantidadesDao(){
        administrador = new Administrador();
    }
    
    public void InsertarProducto(Producto producto, Connection conexion){
        PreparedStatement comando;
        String comandoSQL;
	try {
            comandoSQL = "INSERT INTO control_cantidades VALUES(?,?,?)";
            comando = conexion.prepareStatement(comandoSQL);
            comando.setString(1,producto.getId());
            comando.setInt(2, producto.getCantidadMinima());
            comando.setInt(3, producto.getCantidadPedido());
            comando.executeUpdate();
            comando.close();
	} catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error en el registro del producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
    }
    public void Eliminar(Producto producto, Connection conexion){
        String comandoSQL;
        comandoSQL = "DELETE FROM control_cantidades WHERE id_producto like '"+producto.getId()+"';";
	PreparedStatement comando;
	try {
		comando = conexion.prepareStatement(comandoSQL);
                comando.executeUpdate();
                comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
    }
    public Producto buscarProducto(Producto producto){
        Producto productoResultado = null;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT * FROM  control_cantidades WHERE id_producto like '"+producto.getId()+"'";
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){
                productoResultado = new Producto(resultado.getString("id_producto"),"","",0,0,"",0,
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
    
}
