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
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Producto;

public class ProductoDao {
    private Administrador administrador;
    
    public ProductoDao(){
        administrador = new Administrador();
    }
    
    public void insertar (Producto producto) {
		
		Connection conexion = administrador.dameConexion();
		String comandoSQL = "INSERT INTO inventario VALUES(?,?,?,?,?,?)";
		PreparedStatement comando;
		try {
			comando = conexion.prepareStatement(comandoSQL);
			comando.setString(1, producto.getId());
                        comando.setString(2,producto.getNombre());
                        comando.setString(3, producto.getDescripcion());
                        comando.setDouble(4, producto.getPrecioPublico());
                        comando.setString(5, producto.getIdProveedor());
                        comando.setString(6, producto.getIdControlCantidades());
			comando.executeUpdate();
                        comando.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		administrador.cerrarConexion();
		//comando.executeUpdate(comando);
		
	}
}
