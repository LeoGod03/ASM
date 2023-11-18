
package dao;

// paqueterias clave para hacer la conexión con JDBC
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Administrador { // clase que obtiene la conexion con la base de datos
        
    private Connection conexion;
    private final String url;
    private final String usuarioBD;
    private final String contrasenaBD;
    
    // constructor del adiministrador
    public Administrador() {
        url = "jdbc:postgresql://127.0.0.1:5432/AMS"; // URL de la base local
	usuarioBD = "TlapaAdmin"; // usuario
	contrasenaBD = "Tlapa"; // contraseña
    }
    
    // metodo para crear la conexión 
    public  Connection dameConexion() {	
        try {
            Class.forName("org.postgresql.Driver"); // pedimos el driver de postgres
            conexion = DriverManager.getConnection(url,usuarioBD,contrasenaBD); // le pedimos la conexion con URL,Usuario y Contraseña
	}catch(SQLException sql){
            // mensaje de exepcion para error del SQL
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e) {
            System.out.println(e.getMessage());
	}
        return conexion; // regresamos la conexión
    }
    // metodo para cerrar la conexión
    public void cerrarConexion() {
        try {
            conexion.close(); // cerramos la conexión
        }catch(SQLException sql){
            // mensaje por si no puede cerrar la conexión
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexión", "Error al cerrar", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
