
package dao;
// importamos las librerias que necesitamos
import java.util.ArrayList;
import java.util.Date;
import modelo.Venta;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class VentaDao {
   // atributo de la clase
   private final Administrador administrador; 
   
   // constructor
   public VentaDao(){
       administrador = new Administrador(); // creamos al administrador
   }
   // metodo para pedir los registros de la tabla de ventas
   public ArrayList<Venta> dameTabla(){
       ArrayList<Venta> ventas = new ArrayList<>(); // creamos lista de venras
       Connection conexion = administrador.dameConexion(); // pedimos una conexión
       String comandoSQL = "SELECT * FROM ventas ORDER BY id_venta ASC;"; // comando sql
       PreparedStatement comando;
       ResultSet resultado;
       try{
           comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
           resultado = comando.executeQuery(); // lo ejecutamos y guardamos el resultado
           while(resultado.next()){ // mientras existan registros entrará al while
               // llenamos la venta conforme al resultado
               Venta venta = new Venta(resultado.getString("id_venta"),
                                       resultado.getDate("fecha"),
                                   resultado.getDouble("total_venta"));
               ventas.add(venta); // agregamos la venta a la lista de ventas
           }
           comando.close(); // cerramos el comando
       }catch(SQLException e){
           // mensaje de error
           JOptionPane.showMessageDialog(null, "Error en el registro del producto", "Error",JOptionPane.ERROR_MESSAGE);
       }

       administrador.cerrarConexion(); // cerramos la conexión
       return ventas; // retornamos la lista de ventas
   }
   
   // metodo para obtener registros entre intervalo de fechas
   public ArrayList<Venta> corteCajaIntervalo(Date fechaInicio,Date fechaFinal){
       ArrayList<Venta> ventas = new ArrayList<>(); // creamos la lista de ventas
       Connection conexion = administrador.dameConexion(); // le pedimos una conexión al administrador
       String comandoSQL = "SELECT * FROM ventas WHERE fecha between '"+fechaInicio+"' AND '"+fechaFinal+"';"; // comando sql
       PreparedStatement comando;
       ResultSet resultado;
       try{
           comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
           resultado = comando.executeQuery(); // ejecutamos el comando y guardamos el resultado 
           while(resultado.next()){ // mientras exista resultados entrará el while
               // creamos la venta conforme a los resultados
               Venta venta = new Venta(resultado.getString("id_venta"),
                                       resultado.getDate("fecha"),
                                   resultado.getDouble("total_venta"));
               ventas.add(venta); //agregamos la venta a la lista de ventas
           }
           comando.close(); // cerramos el comando
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error corte de caja por intervalo", "Error",JOptionPane.ERROR_MESSAGE);
       }

       administrador.cerrarConexion(); //cerramos la conexión
       return ventas; // retornamos la lista de ventas
   }
   
   // metodo para eliminar una venta
   public void eliminarVenta(Venta venta){
       Connection conexion = administrador.dameConexion(); // creamos una conexión 
       String comandoSQL = "DELETE FROM ventas WHERE id_venta like '"+venta.getId()+"';"; // comando sql
       PreparedStatement comando;
       try{
           comando = conexion.prepareStatement(comandoSQL); //preparamos el comando
           comando.executeUpdate(); // ejecutamos el comando
           comando.close(); // cerramos el comando
       }catch(SQLException e){
           // mensaje de error
           JOptionPane.showMessageDialog(null, "Error al eliminar la venta", "Error",JOptionPane.ERROR_MESSAGE);
       }
       administrador.cerrarConexion(); // cerramos la conexión
   }
   
   // metodo de corte de caja por día
   public ArrayList<Venta> corteCajaDia(Date fecha){
       ArrayList<Venta> ventas = new ArrayList<>(); // creamos una lista de ventas
       Connection conexion = administrador.dameConexion(); // pedimos la conexión al administrador
       String comandoSQL = "SELECT * FROM ventas WHERE fecha ='"+ fecha+"';"; // comando sql
       PreparedStatement comando;
       ResultSet resultado;
       try{
           comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
           resultado = comando.executeQuery(); // ejecutamos el comando y lo guardamos en resultado
           while(resultado.next()){ // mientras existan registros entrará al while
               // creamos la venta conforme los resultados
               Venta venta = new Venta(resultado.getString("id_venta"),
                                       resultado.getDate("fecha"),
                                   resultado.getDouble("total_venta"));
               ventas.add(venta); // agregamos la venta a la lista de ventas
           }
           comando.close();// cerramos el comando
       }catch(SQLException e){
           // mensaje de error
           JOptionPane.showMessageDialog(null, "Error corte de caja por dia", "Error",JOptionPane.ERROR_MESSAGE);
       }

       administrador.cerrarConexion(); // cerramos la conexión
       return ventas; // retornamos la lista de ventas
   }
   // metodo para insertar
   public void insertar(Venta venta){
       Connection conexion = administrador.dameConexion(); // le pedimos una conexión al administrador
       String comandoSQL = "INSERT INTO ventas VALUES(?,?,?)"; // comando sql
       PreparedStatement comando;
       try{
           comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
           // insertamos en la tabla conforme los datos de la venta
           comando.setString(1, venta.getId());
           comando.setDate(2, (java.sql.Date) venta.getFecha());
           comando.setDouble(3, venta.getTotalVenta());
           comando.executeUpdate(); // ejecutamos el comando
           comando.close(); // cerramos el comando
       }catch(SQLException e){
           // mensaje de error
           JOptionPane.showMessageDialog(null, "Error al insertar la venta", "Error",JOptionPane.ERROR_MESSAGE);
       }
       administrador.cerrarConexion(); // cerramos la conexión
   }
   
   // buscar la ultima venta registrada
   public Venta buscarUltimaVenta(){
        Venta ventaResultado = null; // inicializamos la venta resultado en nulo
        Connection conexion = administrador.dameConexion(); // le pedimos una conexión al administrador
	String comandoSQL = "SELECT id_venta " +
                            "FROM ventas " +
                            "ORDER BY id_venta DESC "+
                            "LIMIT 1;"; // comando sql que regresa el ultimo registro
                        
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            ResultSet resultado = comando.executeQuery(); // ejecutamos el comando y lo guardamos en resultado
            if(resultado.next()) // si el resultado tiene el registro entonces sera la venta resulatdo
                ventaResultado = new Venta(resultado.getString("id_venta"));
            comando.close(); // cerramos el comando 
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda de la ultima venta", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return ventaResultado; // regresamos la venta resultado
    }
}
