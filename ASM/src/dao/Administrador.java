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
import java.sql.DriverManager;
import java.sql.SQLException;

public class Administrador {
    	private Connection conexion;
	private String url;
	private String usuarioBD;
	private String contrasenaBD;
	
	public Administrador() {
		url = "jdbc:postgresql://127.0.0.1:5432/AMS";
		usuarioBD = "TlapaAdmin";
		contrasenaBD = "Tlapa";
	}
	
	public  Connection dameConexion() {
		
		try {
			Class.forName("org.postgresql.Driver");
			conexion = DriverManager.getConnection(url,usuarioBD,contrasenaBD);
		}catch(SQLException sql){
                    System.out.println(sql.getMessage());
                }catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return conexion;
	}
	
	public void cerrarConexion() {
		try {
			conexion.close();
		}catch(SQLException sql){
                    System.out.println(sql.getMessage());
                }catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
