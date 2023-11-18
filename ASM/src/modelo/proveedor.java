
package modelo;
public final class Proveedor {
    // atributos de la clase
    private int id;
    private String nombre;
    private String telefono;
    private String correo;
    private boolean[] dias;
    
    // constructor para busquedas, solo recibe el ID como parametro
    public Proveedor(int id){
        this.id=id;
        setNombre("");
        setTelefono("");
        setCorreo("");
        setDias(null);
    }
    // constructor para hacer los insert o updates en las tablas de la base de datos
    public Proveedor(int id, String nombre, String telefono, String correo,boolean[] dias) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.dias = dias;
    }
    
    // los metodos get y set de los atributos de la clase
    public int getId() {
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
            this.id = id;
        else
            this.id = 1;
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
   
    public boolean[] getDias() {
        return dias;
    }
    public void setDias(boolean[] dias) {
        this.dias = dias;
    }
    // este metodo es para regresar una cadena en forma de lista estilo lunes,martes.....,domingo
    public String escribirDias(){
        String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        String diasTexto = "";
        for(int i = 0; i < 7; i++){
            if(dias[i]){ // si es verdadero que el proveedor reparte en esos dias se agrega a la cadena de texto
                diasTexto += semana[i];
                diasTexto += ",";
            }
            
        }
        
        return diasTexto.substring(0, diasTexto.length()-1); // se regresa en subcadena para quitarle la "," que tiene de mas
    }
    // sobreescribimos el metodo string para pruebas en consola
    @Override
    public String toString() {
        return "proveedor [id=" + id + ", nombre=" + nombre + ", numero=" + telefono + "correo = "+correo+" dias de reparto = "+escribirDias()+"]";
    }
    
    // metodo estatico de la clase para verificar que sea un telefono común valido
    public static boolean telefonoValido(String telefono){
       return (telefono != null && telefono.matches("[0-9]+") && telefono.length() == 10);
    }
    
    // metodo estatico de la clase para verificar mediante expresión regular si el correo es valido
    public static boolean correoValido(String correo){
        return (correo != null && correo.matches("^[_A-Za-z0-9-\\.+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")); 
    }
}
