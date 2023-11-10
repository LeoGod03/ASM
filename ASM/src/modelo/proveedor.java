/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author arral
 */
public class Proveedor {

   
   
    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private boolean[] dias;
    
    public Proveedor(String id){
        this.id=id;
    }
    public Proveedor(String id, String nombre, String telefono, String correo,boolean[] dias) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.dias = dias;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

   

       public void setId(int id) {
       if(id > 0)
           this.id ="Pr_" + id;
       else
           System.out.println("Valor ID invalido");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }    
    public static boolean telefonoValido(String telefono){
       return (telefono != null && telefono.matches("[0-9]+") && telefono.length() == 10);
    }
    public static boolean correoValido(String correo){
        return (correo != null && correo.matches("^[_A-Za-z0-9-\\.+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")); 
    }
    public boolean[] getDias() {
        return dias;
    }
    public void setDias(boolean[] dias) {
        this.dias = dias;
    }
    
    public String escribirDias(){
        String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        String diasTexto = "";
        for(int i = 0; i < 7; i++){
            if(dias[i]){
                diasTexto += semana[i];
                diasTexto += ",";
            }
            
        }
        
        return diasTexto.substring(0, diasTexto.length()-1);
    }
    
    @Override
    public String toString() {
        return "proveedor [id=" + id + ", nombre=" + nombre + ", numero=" + telefono + "]";
    }
}
