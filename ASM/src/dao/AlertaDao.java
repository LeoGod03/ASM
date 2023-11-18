
package dao;
// paqueterias necesarias 
import modelo.Alerta;
import modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Proveedor;
public class AlertaDao {
   // atributos de la clase
   private final Administrador administrador;
   private final ProveedorDao proveedorDao;
   private final CantidadesDao cantidadesDao;
   
   // constructor de la clase donde creamos los parametros DAO
   public AlertaDao(){
       administrador = new Administrador();
       proveedorDao = new ProveedorDao();
       cantidadesDao = new CantidadesDao();
   }
   
   public void insertar(Producto producto){
       if(!alertaExistente(producto)){ // verificamos que no haya una alerta para el articulo en especial
           int cantidadPedido = cantidadesDao.buscarProducto(producto).getCantidadPedido(); // obtenemos la cantidad de pedido
           Proveedor proveedor = proveedorDao.buscarProveedor(new Proveedor(producto.getIdProveedor())); // obtenemos los datos del proveedor
           Connection conexion = administrador.dameConexion(); // pedimos una conexión
           String comandoSQL = "INSERT INTO alertas_pedidos VALUES(?,?,?,?,?,?);"; // comando SQL
           PreparedStatement comando;
           try{
               comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
               // insertamos los valores
               comando.setInt(1,(buscarUltimoId()+1));
               comando.setInt(2, producto.getId());
               comando.setInt(3, cantidadPedido);
               comando.setInt(4, proveedor.getId());
               comando.setString(5, proveedor.getCorreo());
               comando.setString(6, proveedor.getTelefono());
               comando.executeUpdate();
               comando.close(); // cerramos el comando
           }catch(SQLException e){
               // mensaje de error
               System.out.println(e.getMessage());
               JOptionPane.showMessageDialog(null, "Error en insertar la alerta", "Error",JOptionPane.ERROR_MESSAGE);
           }
           administrador.cerrarConexion(); // cerramos conexión
       }
   }
   
   public boolean alertaExistente(Producto producto){
       Connection conexion= administrador.dameConexion(); // pedimos la conexión 
       boolean encontrada = false;
       String comandoSQL = "SELECT * FROM alertas_pedidos ORDER BY id_alerta ASC"; // comando SQL
       PreparedStatement comando;
       try{
           comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
           ResultSet resultado = comando.executeQuery(); // lo ejecutamos y guardamos los resultados
           while(resultado.next()){
               // por cada registro verificamos si ya esta el id del prodcucto
               if(resultado.getInt("id_producto")== producto.getId()){
                   encontrada = true;
                   break;
               }
           }
           comando.close(); // cerramos el comando
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la busqueda de alerta existente", "Error",JOptionPane.ERROR_MESSAGE);
       }
       administrador.cerrarConexion(); // cerramos conexión
       return encontrada; // retornamos respuesta
   }
   
   public ArrayList<Alerta> pedirTabla(){
       Connection conexion = administrador.dameConexion(); // le pedimos una conexión al administrador
       ArrayList<Alerta> alertas = new ArrayList<>(); // creamos la lista resultado
       String comandoSQL = "SELECT * FROM alertas_pedidos ORDER BY id_alerta ASC"; // comando SQL
       PreparedStatement comando;
       Alerta alerta;
       try{
           comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
           ResultSet resultado = comando.executeQuery(); // ejecutamos y guardamos el resultado
           while(resultado.next()){ // mientras existan registros llenamos la lista de alertas
               alerta = new Alerta(resultado.getInt("id_alerta"),resultado.getInt("id_producto"),
                                   resultado.getInt("id_proveedor"),resultado.getInt("cantidad_pedido"),
                                   resultado.getString("correo"),resultado.getString("telefono"));
               alertas.add(alerta);
           }
           comando.close(); // cerramos el comando
       }catch(SQLException e){
           // mensaje de error por si algo sale mal
           System.out.println(e.getMessage());
           JOptionPane.showMessageDialog(null, "Error en obtener los registros de la tabla de alertas", "Error",JOptionPane.ERROR_MESSAGE);
       }
       administrador.cerrarConexion(); // cerramos la conexión 
       return alertas; //retornamos la lista de alertas
   }
   
   public void eliminarAlerta(Alerta alerta){
       Connection conexion = administrador.dameConexion(); // le pedimos una conexión al administrador
       String comandoSQL = "DELETE FROM alertas_pedidos WHERE id_alerta = "+alerta.getId()+";"; // comando SQL
       PreparedStatement comando;
       try{
           comando = conexion.prepareStatement(comandoSQL);
           comando.executeUpdate();
           comando.close();
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en eliminar la alerta", "Error",JOptionPane.ERROR_MESSAGE);
       }
       administrador.cerrarConexion();
   }
   // buscar la ultima alerta registrada
   public int buscarUltimoId(){
        Connection conexion = administrador.dameConexion(); // le pedimos una conexión al administrador
	String comandoSQL = "SELECT id_alerta " +
                            "FROM alertas_pedidos " +
                            "ORDER BY id_alerta DESC "+
                            "LIMIT 1;"; // comando sql que regresa el ultimo registro
        int ultimo = 0;
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            ResultSet resultado = comando.executeQuery(); // ejecutamos el comando y lo guardamos en resultado
            if(resultado.next()) // si el resultado tiene el registro entonces sera la alerta resultado   
                ultimo = resultado.getInt("id_alerta");
            
            comando.close(); // cerramos el comando 
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda de la ultima alerta", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return ultimo; // regresamos la venta resultado
    }
}
