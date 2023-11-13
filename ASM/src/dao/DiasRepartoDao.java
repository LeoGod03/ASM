
package dao;
// importamos las librerias necesarias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Proveedor;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class DiasRepartoDao {
    // constructos
    
    public DiasRepartoDao(){
        
    }
    // metodo para insertar los días de reparto de un proveedor
    public void insertar (Proveedor proveedor, Connection conexion){
	PreparedStatement comando;
        String comandoSQL;
        boolean[] dias = proveedor.getDias(); // obtenemos el arreglo de los días
	try {
            comandoSQL = "INSERT INTO dias_reparto VALUES(?,?,?,?,?,?,?,?)"; // comando SQL
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            // insertamos los datos
            comando.setString(1,proveedor.getId());
            for(int i = 0; i < 7; i++)
                comando.setBoolean(i+2, dias[i]);
            comando.executeUpdate(); // ejecutamos el código
            comando.close(); // cerramos el comando
	} catch (SQLException e) {
            // mensjae de error del registro
            JOptionPane.showMessageDialog(null, "Error en el registro de los dias de reparto", "Error",JOptionPane.ERROR_MESSAGE);
	}
		
    }
    // metodo para buscar los días de reparto
    public boolean[] buscarDiasReparto(Proveedor proveedor, Connection conexion){
        boolean[] dias = new boolean[7];
        String comandoSQL = "SElECT * FROM dias_reparto WHERE id_proveedor like '"+proveedor.getId()+"';"; // comando SQL
        PreparedStatement comando;
        try{
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            ResultSet resultado = comando.executeQuery(); // ejecutamos y guardamos el resultado
            if(resultado.next()){
                // guardamos los datos obtenidos
                dias[0] = resultado.getBoolean("lunes");
                dias[1] = resultado.getBoolean("martes");
                dias[2] = resultado.getBoolean("miercoles");
                dias[3] = resultado.getBoolean("jueves");
                dias[4] = resultado.getBoolean("viernes");
                dias[5] = resultado.getBoolean("sabado");
                dias[6] = resultado.getBoolean("domingo");
            }
            comando.close(); // cerramos la conexión 
        }catch(SQLException sqle){
            //mensaje de error por si no se encuentra la busqueda
            JOptionPane.showMessageDialog(null, "Error en buscar días de reparto", "Error",JOptionPane.ERROR_MESSAGE);
        }
        return dias; // regresamos los días de reparto
    }
    
    // metodo para eliminar los días del reparto
    public void eliminarDiasReparto(Proveedor proveedor, Connection conexion){
        String comandoSQL = "DELETE FROM dias_reparto WHERE id_proveedor like '"+proveedor.getId()+"';"; // comando SQL para eliminar
        PreparedStatement comando;
        try{
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            comando.executeUpdate(); // lo ejecutamos
            comando.close(); // lo cerramos
        }catch(SQLException sqle){
            // mostramos mensaje por si algo sale mal
            JOptionPane.showMessageDialog(null, "Error en eliminar los días de reparto", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    // metodo para pedir todos los registros de la tabal
    public ArrayList<boolean[]> pedirTabla(Connection conexion){
        ArrayList<boolean[]> lista = new ArrayList<>();
        boolean[] dias;
	String comandoSQL = "SELECT * FROM dias_reparto ORDER BY id_proveedor ASC"; // comando SQL
	PreparedStatement comando;
	try {
            comando = conexion.prepareStatement(comandoSQL); // preparamos al comando
            ResultSet resultado = comando.executeQuery(); // ejecutamos y guardamos el resultado
            while(resultado.next()){
                // si hay resultados llenamos los días de reparto
                dias = new boolean[7];
                dias[0] = resultado.getBoolean("lunes");
                dias[1] = resultado.getBoolean("martes");
                dias[2] = resultado.getBoolean("miercoles");
                dias[3] = resultado.getBoolean("jueves");
                dias[4] = resultado.getBoolean("viernes");
                dias[5] = resultado.getBoolean("sabado");
                dias[6] = resultado.getBoolean("domingo");
                lista.add(dias);
            }
            comando.close();// cerramos el comando
	} catch (SQLException e) {
            // mensaje de error al pedir la tabla
            JOptionPane.showMessageDialog(null, "Error al pedir la tabla de días de reparto", "Error",JOptionPane.ERROR_MESSAGE);
        }
        return lista; // regresamos los registros
    } 
    // metodo para actualizar los días de reparto
    public void actualizarDiasReparto(Proveedor proveedor, Connection conexion){
        boolean[] dias = proveedor.getDias();
        String comandoSQL = "UPDATE dias_reparto "
                          + "SET lunes = "+ dias[0]+","
                          + "martes = " + dias[1]+","
                          + "miercoles = " + dias[2]+","
                          + "jueves = "+dias[3]+","
                          + "viernes = "+dias[4]+","
                          + "sabado = "+dias[5]+", "
                          + "domingo = "+dias[6]+" "
                          + "WHERE id_proveedor like '"+ proveedor.getId()+"';"; // comando sql
        PreparedStatement comando;
        try{
            comando = conexion.prepareStatement(comandoSQL); // preparamos el comando
            comando.executeUpdate(); // lo ejecutamos
            comando.close(); // lo cerramos y liberamos
        }catch(SQLException e){
            // mensaje de error por si algo sale mal
            JOptionPane.showMessageDialog(null, "Error al actualizar los días de reparto", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
