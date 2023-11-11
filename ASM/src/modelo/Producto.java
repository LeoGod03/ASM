
package modelo;




public final class Producto {
    // atributos de la clase producto
    private String id;
    private String nombre;
    private String descripcion;
    private double precioProveedor;
    private double precioPublico;
    private String idProveedor;
    private int cantidadInventario;
    private int cantidadMinima;
    private int cantidadPedido;
    
    // este constructor es con todos los atributos como parametro para hacer las insercciones y modificaciones en las tablas
    public Producto(String id,String nombre,String descripcion,double precioProveedor, double precioPublico,String idProveedor,
                    int cantidadInventario, int cantidadMinima, int cantidadPedido){
        this.id = id;
        this.nombre = nombre;
        setDescripcion(descripcion);
        setPrecioPublico(precioPublico);
        setCantidadInventario(cantidadInventario);
        setPrecioProveedor(precioProveedor);
        setIdProveedor(idProveedor);
        setCantidadMinima(cantidadMinima);
        setCantidadPedido(cantidadPedido);
    }
    // este constructor solo pide el ID para hacer busquedas o eliminaciones
    public Producto (String id){
        this.id  = id;
        setNombre("");
        setDescripcion("");
        setPrecioPublico(0);
        setCantidadInventario(0);
        setPrecioProveedor(0);
        setIdProveedor("");
        setCantidadMinima(0);
        setCantidadPedido(0);
        
    }

   
   // los metodos get y set de los atributos
    
    public void setId(String id){
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }
    // metodos set donde abrá numeros en si
    public void setCantidadInventario(int cantidadInventario) {
        if(cantidadInventario > 0) // se cuida que no haya negativos por si el sistema llega a fallar
            this.cantidadInventario = cantidadInventario;
        else 
            this.cantidadInventario = 1;
    }
    // este metodo tendrá numeros y se replica lo de el set anterior
     public void setCantidadPedido(int cantidadPedido) {
         if(cantidadPedido > 0)
             this.cantidadPedido = cantidadPedido;
         else
             this.cantidadPedido = 1;
    }
     // este metodo tendrá numeros y se replica lo de el set anterior
    public int setCantidadMinima(int cantidadMinima) {
         
        if(cantidadMinima > 0)
            this.cantidadMinima = cantidadMinima;
        else
            this.cantidadMinima = 1;
        return cantidadMinima;
    }

    // este metodo tendrá numeros y se replica lo de el set anterior
    public void setPrecioPublico(double precioPublico){
        if(precioPublico > 0)
            this.precioPublico = precioPublico; 
        else
            this.precioPublico = 1;
    }
    // este metodo tendrá numeros y se replica lo de el set anterior
    public void setPrecioProveedor(double precioProveedor){
        if(precioProveedor > 0)
            this.precioProveedor = precioProveedor;
        else
            this.precioProveedor = 1;
    }
    
    public int getCantidadInventario() {
        return cantidadInventario;
    }
    
    public int getCantidadMinima() {
        return cantidadMinima;
    }
    
    public int getCantidadPedido() {
        return cantidadPedido;
    }
    
    public double getPrecioPublico() {
        return precioPublico;
    }
    
    public double getPrecioProveedor(){
        return precioProveedor;
    }
    
     public String getDescripcion() {
        return descripcion;
    }

    public String getIdProveedor() {
        return idProveedor;
    }
    
    public String getNombre() {
        return nombre;
    }
    
     public String getId() {
        return id;
    }
     // metodo string para las pruebas en consola
    @Override
    public String toString() {
        String cadena = "id = "+id+" nombre = "+nombre+" descripcion = "+descripcion+" precio_proveedor = "+precioProveedor +" precio_publico = "+precioPublico
                      + " id_proveedor =" +idProveedor +" cantidad_inventario: "+cantidadInventario+"Cantidad_minima: "+cantidadMinima
                        +"Cantidad_pedido: " + cantidadPedido;
        return cadena;
    }

    
    
}
