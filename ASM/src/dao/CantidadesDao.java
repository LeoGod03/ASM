
package dao;

// importación de paqueterias tanto sql como otras para mandar mensajes ETC
import modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class CantidadesDao {
    private final Administrador administrador;
    // constructor vacio
    public CantidadesDao(){
       administrador = new Administrador();
    }
    // clase para hacer el insert al momento de agregar un nuevo producto
    public void InsertarProducto(Producto producto, Connection conexion){ //recibimos la conexión porque es una transaccion y si algo sale mal podemos 
        PreparedStatement comando; // objeto que hace la interacción con la base de datos
        String comandoSQL;
	try {
            comandoSQL = "INSERT INTO control_cantidades VALUES(?,?,?)"; // aqui esta el código SQL para el insert en la tabla
            comando = conexion.prepareStatement(comandoSQL); // creamos el PreparedStatement
            // hacemos el insert con los paramentros recibidos por el producto
            comando.setInt(1,producto.getId());
            comando.setInt(2, producto.getCantidadMinima());
            comando.setInt(3, producto.getCantidadPedido());
            comando.executeUpdate(); // ejecutamos el codigo sql
            comando.close(); // cerramos y liberamos el comando
	} catch (SQLException e) {
            // mensaje por si el insert salío mal
            JOptionPane.showMessageDialog(null, "Error en el registro del producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
    }
    // metodo para eliminar un producto de la tabla de control cantidades
    public void eliminar(Producto producto, Connection conexion){ // recibe el producto y la conexión
        String comandoSQL;
        comandoSQL = "DELETE FROM control_cantidades WHERE id_producto = "+producto.getId()+";"; // comando para hacer el delete
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            comando.executeUpdate(); // ejecutamos el comando
            comando.close(); // cerramos y liberamos el comando
	} catch (SQLException e) {
            // mensaje de error por si no se pudo ejecutar correctamente el código
            JOptionPane.showMessageDialog(null, "Error la eliminación del producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
    }
    // metodo para buscar un producto en base a su ID
    public Producto buscarProducto(Producto producto){
        Producto productoResultado = null;
        Connection conexion = administrador.dameConexion(); // le pedimos conexion al administrador
	String comandoSQL = "SELECT * FROM  control_cantidades WHERE id_producto = "+producto.getId()+";"; // comando SQL para la busqueda
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL);
            ResultSet resultado = comando.executeQuery();
            if(resultado.next()){ // verificamos si la consulta si tiene resulatdo
                productoResultado = new Producto(resultado.getInt("id_producto"),"","",0,0,0,0,
                                            resultado.getInt("cantidad_minima"),
                                            resultado.getInt("cantidad_pedido")); // creamos el producto resultado
            }
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            // error por si la consulta no se ejecuta correctamente
            JOptionPane.showMessageDialog(null, "Error buscar producto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
	administrador.cerrarConexion(); // cerramos la conexión 
        
        return productoResultado; // regresamos el producto resultado
    }
    
}
