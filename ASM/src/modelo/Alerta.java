
package modelo;

public final class Alerta {
    // atributos de la clase
    private String id;
    private String idProducto;
    private String idProveedor;
    private int cantidadPedido;
    private String correo;
    private String telefono;
    
    // constrcutor de nuestra clase
    public Alerta(String id, String idProducto, String idProveedor, int cantidadPedido, String correo, String telefono){
        setId(id);  
        setIdProducto(idProducto);
        setIdProveedor(idProveedor);
        setCantidadPedido(cantidadPedido);
        setCorreo(correo);
        setTelefono(telefono);
    }
    
     public Alerta(String id){
        setId(id);  
        setIdProducto("");
        setIdProveedor("");
        setCantidadPedido(0);
        setCorreo("");
        setTelefono("");
    }
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
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
