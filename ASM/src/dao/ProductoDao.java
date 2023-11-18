
package dao;


// importamos las librerias necesarias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Producto;

public class ProductoDao {
    // atributos de la clase
    private final Administrador administrador;
    private final CantidadesDao cantidades; 
    
    // constructor de la clase
    public ProductoDao(){
        administrador = new Administrador(); // creamos al administrador
        cantidades = new CantidadesDao(); // creamos el DAO de cantidades
    }
     // metodo para insertar producto
    public void insertar (Producto producto) {
	Connection conexion = administrador.dameConexion(); // pedimos la conexión
	PreparedStatement comando;
        String comandoSQL;
	try {
            conexion.setAutoCommit(false); // quitamos el autocommit
            comandoSQL = "INSERT INTO inventario VALUES(?,?,?,?,?,?,?)"; // código SQL para insertar el producto
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            // insertamos con los atributos del producto dado
            comando.setInt(1, producto.getId());
            comando.setString(2,producto.getNombre());
            comando.setString(3, producto.getDescripcion());
            comando.setDouble(4, producto.getPrecioPublico());
            comando.setInt(5, producto.getIdProveedor());
            comando.setInt(6, producto.getCantidadInventario()); 
            comando.setDouble(7, producto.getPrecioProveedor());
            cantidades.InsertarProducto(producto, conexion); // ejecutamos el insert de cantidades DAO
            comando.executeUpdate(); // ejecutamos el comando
            conexion.commit(); // hacemos el commit
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            try {
                conexion.rollback(); // hacemos un rollback por si algo sale mal
            } catch (SQLException ex) {
                System.out.print(ex);
            }
           //mensaje de error al registrar producto
            JOptionPane.showMessageDialog(null, "Error en el registro del producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
		
    }
    // metodo para pedir toda la tabla de productos
    public ArrayList<Producto> pedirTabla(){
        ArrayList<Producto> productos = new ArrayList<>(); // creamos una lista de productos
        Producto producto;
        Connection conexion = administrador.dameConexion(); // pedimos la conexión al administrador
	String comandoSQL = "SELECT * FROM inventario INNER JOIN  control_cantidades ON inventario.id_producto = control_cantidades.id_producto ORDER BY inventario.id_producto ASC"; // comando SQL para la obtención de todos los registros de la tabla inventario y cantidades
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            ResultSet resultado = comando.executeQuery(); // lo ejecutamos y lo guardamos en el objeto resultado
            while(resultado.next()){ // el while se ejecutará siempre y cuando tenga registros el resultado
                // llenamos el producto con lo que tenga el resultado
                producto = new Producto(resultado.getInt("id_producto"),
                                     resultado.getString("nombre_producto"),
                                  resultado.getString("descripcion"),
                                    resultado.getDouble("precio_proveedor"),
                                resultado.getDouble("precio_publico"),
                                     resultado.getInt("id_proveedor"),
                                    resultado.getInt("cantidad_en_inventario"),
                                    resultado.getInt("cantidad_minima"),
                                    resultado.getInt("cantidad_pedido"));
                
                productos.add(producto); // agregamos el producto a la lista de productos
            }
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            // mensaje de error por si sale algo mal con el comandoSQL
            JOptionPane.showMessageDialog(null, "Error al obtener registros", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return productos; // retornamos la lista de productos
    }
    
    // metodo para buscar un producto
    public Producto buscarProducto(Producto producto){
        Producto productoResultado = null; // creamos un producto y lo inicializamos en nulo
        Connection conexion = administrador.dameConexion(); // pedimos la conexón 
	String comandoSQL = "SELECT * FROM inventario WHERE id_producto = "+producto.getId()+";"; // comando SQL para la busqueda
	PreparedStatement comando;
	try {
            Producto productoCant = cantidades.buscarProducto(producto); // buscamos el producto en la tabla cantidades
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){ // verificamos que si exista un registro
                // llenamos el producto resultado
                productoResultado = new Producto(resultado.getInt("id_producto"),
                                            resultado.getString("nombre_producto"),
                                            resultado.getString("descripcion"),
                                            resultado.getDouble("precio_proveedor"),
                                            resultado.getDouble("precio_publico"),
                                            resultado.getInt("id_proveedor"),
                                            resultado.getInt("cantidad_en_inventario"),
                                            productoCant.getCantidadMinima(),
                                            productoCant.getCantidadPedido());
            }
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            // mensaje por si la busqueda sale mal
            JOptionPane.showMessageDialog(null, "Error al buscar producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return productoResultado; // regresamos el producto resultado
    }
    // metodo para actualizar un producto
    public void actualizarProducto(Producto producto){
        Connection conexion = administrador.dameConexion(); // le pedimos al administrador una conexión
	String comandoSQL;
        // comando para hacer el UPDATE en el producto en especifico
        comandoSQL = "UPDATE inventario "+
                "SET nombre_producto = '" + producto.getNombre()+"',"+
                "descripcion = '" + producto.getDescripcion()+"',"+
                "precio_proveedor = "+producto.getPrecioProveedor()+","+
                "precio_publico = " + producto.getPrecioPublico()+","+
                "id_proveedor = " + producto.getIdProveedor()+","+
                "cantidad_en_inventario = "+producto.getCantidadInventario()+" "+
                "where id_producto  = " + producto.getId()+"; "+
                "UPDATE control_cantidades "+
                "SET cantidad_minima  = "+producto.getCantidadMinima()+","+
                "cantidad_pedido = "+producto.getCantidadPedido()+" "
                +"WHERE id_producto = "+producto.getId()+";";
                
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            comando.executeUpdate(); // lo ejecutamos
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            // mensaje de error al actualizar el producto
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
    }
    
    public Producto buscarUltimoProducto(){
        Producto productoResultado = null;
        Connection conexion = administrador.dameConexion(); // pedimos la conexión al administrador
	String comandoSQL = "SELECT id_producto " +
                            "FROM inventario ORDER BY id_producto DESC LIMIT 1"; // comando para obtener el ultimo registro
                        
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            ResultSet resultado = comando.executeQuery(); // lo ejecutamos y guardamos los resultados de la consulta
            if(resultado.next())
                productoResultado = new Producto(resultado.getInt("id_producto")); // llenamos el producto con el resultado
            
            comando.close(); // cerramos con el comando
	} catch (SQLException e) {
            // mensaje de error
            JOptionPane.showMessageDialog(null, "Error en la busqueda del ultimo producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return productoResultado; // regresamos el producto resultado
    }
    
    // metodo para eliminar un producto
    public void eliminarProducto(Producto producto){
        Connection conexion = administrador.dameConexion(); // pedimos al administrador una conexión
	String comandoSQL;
        comandoSQL = "DELETE FROM inventario WHERE id_producto = "+producto.getId()+";"; // comando para eliminar un producto
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            comando.executeUpdate(); // ejeciutamos el comando
            comando.close(); // cerramos el comando
            cantidades.eliminar(producto, conexion); // eliminamos el producto
                
	} catch (SQLException e) {
            // mensaje de error
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerrar la conexión
    }
    
    // metodo para buscar por nombre
    public ArrayList<Producto> buscarPorNombre(String nombre){
        ArrayList<Producto> productos = new ArrayList<>(); // ceramos la lista de productos
        Producto producto;
        Connection conexion = administrador.dameConexion(); // le pedimos una conexión al administrador
	String comandoSQL = "SELECT inv.*,cont.cantidad_minima,cont.cantidad_pedido FROM inventario AS inv, control_cantidades AS cont WHERE inv.nombre_producto like '%"+nombre+"%'"
                             + " AND inv.id_producto = cont.id_producto"; // comando para buscar coincidencias de nombre
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando SQL
            ResultSet resultado = comando.executeQuery(); // guardamos los resultados de la ejecuación del comando
            while(resultado.next()){ // mientras existan registros
                // creamos un producto con lo que mande el resultado
                producto = new Producto(resultado.getInt("id_producto"),
                                  resultado.getString("nombre_producto"),
                               resultado.getString("descripcion"),
                               resultado.getDouble("precio_proveedor"),
                             resultado.getDouble("precio_publico"),
                                resultado.getInt("id_proveedor"),
                                resultado.getInt("cantidad_en_inventario"),
                                resultado.getInt("cantidad_minima"),
                                 resultado.getInt("cantidad_pedido"));
                productos.add(producto); // lo añadimos a la lista de porductos
            }
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar por nombre", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión
        
        return productos; // regresamos los productos
    }
    
    // metodo para actualizar la cantidad en inventario
    public void actualizarCantidad(Producto producto, int cantidad){
        Connection conexion = administrador.dameConexion(); // pedimos la conexión
        String comandoSQL = "UPDATE inventario "
                           + "SET cantidad_en_inventario = " +cantidad+" "
                           + "WHERE id_producto = "+producto.getId()+";"; // comando para actualizar la cantidad
        PreparedStatement comando;
        try{
            comando = conexion.prepareStatement(comandoSQL); //preparamos el comando
            comando.executeUpdate(); // lo ejecutamos
            comando.close(); // ceramos el comando
        }catch(SQLException e){
            // mensaje de error
            JOptionPane.showMessageDialog(null, "Error al actualizar la cantidad", "Error",JOptionPane.ERROR_MESSAGE);
        }
        administrador.cerrarConexion(); // cerramos la conexión
    }
    
}
