
package dao;

import java.util.ArrayList;
import java.util.Date;
import modelo.Venta;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class VentaDao {
   private Administrador administrador; 
   
   public VentaDao(){
       administrador = new Administrador();
   }
   
   public ArrayList<Venta> dameTabla(){
       ArrayList<Venta> ventas = new ArrayList<>();
       Connection conexion = administrador.dameConexion();
       String comandoSQL = "SELECT * FROM ventas ORDER BY id_venta ASC;";
       PreparedStatement comando;
       ResultSet resultado;
       try{
           comando = conexion.prepareStatement(comandoSQL);
           resultado = comando.executeQuery();
           while(resultado.next()){
               Venta venta = new Venta(resultado.getString("id_venta"),
                                       resultado.getDate("fecha"),
                                   resultado.getDouble("total_venta"));
               ventas.add(venta);
           }
           comando.close();
           conexion.close();
       }catch(SQLException e){
           
       }

       administrador.cerrarConexion();
       return ventas;
   }
   
   public ArrayList<Venta> corteCajaIntervalo(Date fechaInicio,Date fechaFinal){
       ArrayList<Venta> ventas = new ArrayList<>();
       Connection conexion = administrador.dameConexion();
       String comandoSQL = "SELECT * FROM ventas WHERE fecha between '"+fechaInicio+"' AND '"+fechaFinal+"';";
       PreparedStatement comando;
       ResultSet resultado;
       try{
           comando = conexion.prepareStatement(comandoSQL);
           resultado = comando.executeQuery();
           while(resultado.next()){
               Venta venta = new Venta(resultado.getString("id_venta"),
                                       resultado.getDate("fecha"),
                                   resultado.getDouble("total_venta"));
               ventas.add(venta);
           }
           comando.close();
           conexion.close();
       }catch(SQLException e){
           
       }

       administrador.cerrarConexion();
       return ventas;
   }
   
   public void eliminarVenta(Venta venta){
       Connection conexion = administrador.dameConexion();
       String comandoSQL = "DELETE FROM ventas WHERE id_venta like '"+venta.getId()+"';";
       PreparedStatement comando;
       try{
           comando = conexion.prepareStatement(comandoSQL);
           comando.executeUpdate();
           comando.close();
           conexion.close();
       }catch(SQLException e){
           
       }
       administrador.cerrarConexion();
   }
   public ArrayList<Venta> corteCajaDia(Date fecha){
       ArrayList<Venta> ventas = new ArrayList<>();
       Connection conexion = administrador.dameConexion();
       String comandoSQL = "SELECT * FROM ventas WHERE fecha ='"+ fecha+"';";
       PreparedStatement comando;
       ResultSet resultado;
       try{
           comando = conexion.prepareStatement(comandoSQL);
           resultado = comando.executeQuery();
           while(resultado.next()){
               Venta venta = new Venta(resultado.getString("id_venta"),
                                       resultado.getDate("fecha"),
                                   resultado.getDouble("total_venta"));
               ventas.add(venta);
           }
           comando.close();
           conexion.close();
       }catch(SQLException e){
           
       }

       administrador.cerrarConexion();
       return ventas;
   }
   public void insertar(Venta venta){
       Connection conexion = administrador.dameConexion();
       String comandoSQL = "INSERT INTO ventas VALUES(?,?,?)";
       PreparedStatement comando;
       try{
           comando = conexion.prepareStatement(comandoSQL);
           comando.setString(1, venta.getId());
           comando.setDate(2, (java.sql.Date) venta.getFecha());
           comando.setDouble(3, venta.getTotalVenta());
           comando.executeUpdate();
           comando.close();
       }catch(SQLException e){
           
       }
       administrador.cerrarConexion();
   }
   
   public Venta buscarUltimaVenta(){
        Venta ventaResultado = null;
        Connection conexion = administrador.dameConexion();
	String comandoSQL = "SELECT id_venta " +
                            "FROM ventas " +
                            "ORDER BY id_venta DESC "+
                            "LIMIT 1;";
                        
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next())
                ventaResultado = new Venta(resultado.getString("id_venta"));
            conexion.close();
            comando.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		
	administrador.cerrarConexion();
        
        return ventaResultado;
    }
}
