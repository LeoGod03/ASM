
package dao;
// importamos las paqueterias necesarias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Proveedor;


public class ProveedorDao {
    // atributos
    private final Administrador administrador;
    private final DiasRepartoDao diasReparto;
     public ProveedorDao(){
        // creamos el administrados y dias de reparto
        administrador = new Administrador(); 
        diasReparto = new DiasRepartoDao();
    }
    // metodo para pedir la tabla de proveedores
    public ArrayList<Proveedor> pedirTabla(){
        Connection conexion = administrador.dameConexion(); // pedimos la conexión
        ArrayList<Proveedor> proveedores = new ArrayList<>(); // creamos la lista de proveedores
        Proveedor proveedor;
	String comandoSQL = "SELECT * FROM proveedor ORDER BY id_proveedor ASC"; // comando para extraer los datos de la tabla de proveedor
	PreparedStatement comando;
        int contador = 0;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            ArrayList<boolean[]> dias = diasReparto.pedirTabla(conexion); // pedimos los días de los repartidores
            ResultSet resultado = comando.executeQuery(); // ejecitamos y almacenamos resultados
            while(resultado.next()){ // mientras haya resultados se ejecutara el while
                // llenamos el proveedor con lo obtenido
                proveedor = new Proveedor(resultado.getString("id_proveedor"),
                                          resultado.getString("nombre_proveedor"),
                                          resultado.getString("telefono"),
                                          resultado.getString("correo"),
                                                dias.get(contador)); // obtenemos los dias de la lista
                                 
                
                proveedores.add(proveedor); //lo metemos a la lista de proveedores
                contador++;   // aumentamos el contador
            }
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            // mensaje de error
            JOptionPane.showMessageDialog(null, "Error en obtener la tabla de proveedores", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return proveedores; // regresamos la lista de proveedores
    } 
    
    //metodo para insertar producto
    public void insertar(Proveedor proveedor){
        Connection conexion = administrador.dameConexion(); // pedimos la conexión al administrador
        PreparedStatement comando;
        String comandoSQL;
	try {
            conexion.setAutoCommit(false); // quitamos el commit automatico
            comandoSQL = "INSERT INTO proveedor VALUES(?,?,?,?)"; // comando sql para insertar
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            //llenamos el insert con los datos obtenidos de proveedor
            comando.setString(1,proveedor.getId());
            comando.setString(2, proveedor.getNombre());
            comando.setString(3, proveedor.getTelefono());
            comando.setString(4, proveedor.getCorreo());
            diasReparto.insertar(proveedor, conexion); // insertamos los dias de reparto
            comando.executeUpdate(); // ejecutamos el comando 
            conexion.commit(); // hacemos el commit
            comando.close(); // cerramos el comando
            
	} catch (SQLException e) {
            try {
                conexion.rollback(); // hacemos un rollback en caso de que algo salga mal
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            // mensjae de error
            JOptionPane.showMessageDialog(null, "Error en el registro del proveedor", "Error",JOptionPane.ERROR_MESSAGE);
	}
    }
    
    // metodo para eliminar un proveedor
    public void eliminarProveedor(Proveedor proveedor){
         Connection conexion = administrador.dameConexion(); // pedimos la conexión 
        String comandoSQL;
        comandoSQL = "DELETE FROM proveedor WHERE id_proveedor like '"+proveedor.getId()+"';"; // comando sql
	PreparedStatement comando;
	try {
            diasReparto.eliminarDiasReparto(proveedor, conexion); // eliminamos el registro en días reparto
            comando = conexion.prepareStatement(comandoSQL); //preparamos el comando
            comando.executeUpdate(); // ejecutamos el código
            comando.close(); //cerramos el comando
	} catch (SQLException e) {
            // mensaje de error
            JOptionPane.showMessageDialog(null, "Error al eliminar el proveedor", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
    }
    
    // metodo para buscar el proveedor
    public Proveedor buscarProveedor(Proveedor proveedor){
        Proveedor proveedorResultado = null; // inicializamos el proveedor resultado en nulo
        Connection conexion = administrador.dameConexion(); // pedimos la conexión
	String comandoSQL = "SELECT * FROM proveedor WHERE id_proveedor like '"+proveedor.getId()+"'"; //comando sql
	PreparedStatement comando;
	try {
            boolean[] dias = diasReparto.buscarDiasReparto(proveedor, conexion); // pedimos los dias de reparto del proveedor
            comando = conexion.prepareStatement(comandoSQL); //preparamos el comando
            ResultSet resultado = comando.executeQuery(); // ejecutamos y guardamos el resultado
            if(resultado.next()){ // verificamos que exista un resultado
                // gaurdamos el proveedor resultado
                proveedorResultado = new Proveedor(resultado.getString("id_proveedor"),
                                  resultado.getString("nombre_proveedor"),
                                  resultado.getString("telefono"),
                                  resultado.getString("correo"),
                                  dias); 
            }
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar al proveedor", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); //cerrar la conexión
        
        return proveedorResultado; //retornamos el proveedor resultado
    }
    
    // metodo para actualizar al proveedor
    public void actualizarProveedor(Proveedor proveedor){
        Connection conexion = administrador.dameConexion(); // pedimos la conexión al administrador
        String comandoSQL = "UPDATE proveedor "
                          + "SET nombre_proveedor = '"+proveedor.getNombre()+"', "
                          + "telefono = '"+proveedor.getTelefono()+"', "
                          + "correo = '"+proveedor.getCorreo()+"' "
                          + "WHERE id_proveedor = '"+proveedor.getId()+"';"; // comando sql 
        PreparedStatement comando;
        try{
            diasReparto.actualizarDiasReparto(proveedor, conexion); // actualizamos los dias de reparto
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando sql
            comando.executeUpdate(); // ejecutamos el comando
            comando.close(); // cerrar el comando
        }catch(SQLException sqle){
            //mensaje de error
            JOptionPane.showMessageDialog(null, "Error actualizar el proveedor", "Error",JOptionPane.ERROR_MESSAGE);
        }
        administrador.cerrarConexion(); //cerramos la conexión
    }
    // metodo para bsucar el ultimo proveedor agregado
    public Proveedor buscarUltimoProveedor(){
        Proveedor proveedorResultado = null; // inicializamos el proveedor resultado en nulo
        Connection conexion = administrador.dameConexion(); // pedimos la conexión
	String comandoSQL = "SELECT id_proveedor " +
                            "FROM proveedor " +
                            "ORDER BY id_proveedor DESC "+
                            "LIMIT 1;"; // codigo SQL
                        
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            ResultSet resultado = comando.executeQuery(); //ejecutamos el comando y guardamos el resultado
            if(resultado.next())
                proveedorResultado = new Proveedor(resultado.getString("id_proveedor")); // guardamos el proveedor resultado
            
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar al ultimo proveedor", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return proveedorResultado; //regresamos el proveedor
    }
    
    // metodo para buscar por nombre
    public ArrayList<Proveedor> buscarPorNombre(String nombre){
        ArrayList<Proveedor> proveedores = new ArrayList<>(); // creamos una lista de proveedores
        Proveedor proveedor;
        Connection conexion = administrador.dameConexion(); // pedimos una conexión al administrador
	String comandoSQL = "   SELECT * FROM proveedor WHERE nombre_proveedor like '%" + nombre +"%'"; // comando para buscar coincidencias
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos la conexión
            ResultSet resultado = comando.executeQuery(); // ejecutamos y guardamos el resultado
            while(resultado.next()){ // mientras existan registros se ejecutará el while
                // llenamos el provedor del resultado
                proveedor = new Proveedor(resultado.getString("id_proveedor"),
                                          resultado.getString("nombre_proveedor"),
                                          resultado.getString("telefono"),
                                          resultado.getString("correo"),
                                    diasReparto.buscarDiasReparto(new Proveedor(resultado.getString("id_proveedor")), conexion));
                proveedores.add(proveedor); // agregamos el proveedor a la lista
            }
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda por nombres", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return proveedores; // regresamos la lista de proveedores
    }
     
 
}
