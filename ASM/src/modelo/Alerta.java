
package modelo;

public final class Alerta {
    // atributos de la clase
    private int id;
    private int idProducto;
    private int idProveedor;
    private int cantidadPedido;
    private String correo;
    private String telefono;
    
    // constrcutor de nuestra clase con todos los parametros para los insert o updates en la BD
    public Alerta(int id, int idProducto, int idProveedor, int cantidadPedido, String correo, String telefono){
        setId(id);  
        setIdProducto(idProducto);
        setIdProveedor(idProveedor);
        setCantidadPedido(cantidadPedido);
        setCorreo(correo);
        setTelefono(telefono);
    }
        // constructor que solo recibe el ID para hacer mas rapido la busqueda en las clases DAO
     public Alerta(int id){
        setId(id);  
        setIdProducto(0);
        setIdProveedor(0);
        setCantidadPedido(0);
        setCorreo("");
        setTelefono("");
    }
     
    // metodos get y set de los atributos de nuestra clase
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        if(id > 0)
            this.id = id;
        else
            this.id = 1;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        if(idProducto > 0)
            this.idProducto = idProducto;
        else
            this.idProducto = 1;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        if(idProveedor > 0)
            this.idProveedor = idProveedor;
        this.idProveedor = 1;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        if(cantidadPedido > 0)
            this.cantidadPedido = cantidadPedido;
        else
            this.cantidadPedido = 1;
    }

    public String getCorreo() {
        return correo;
    }

    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
