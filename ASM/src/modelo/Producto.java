/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public final class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private double precioPublico;
    private String idProveedor;
    private int cantidadInventario;
    
    
    public Producto(String id,String nombre,String descripcion, double precioPublico,String idProveedor,int cantidadInventario){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.setPrecioPublico(precioPublico);
        this.setCantidadInventario(cantidadInventario);
        this.idProveedor = idProveedor;
    }

   
    public String getId() {
        return id;
    }

    public void setId(int id){
        
        if(id > 0)
            this.id = "Pd_"+id;   
        else
            System.out.println("Valor del ID invalido");
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
    public String getIdProveedor() {
        return idProveedor;
    }

    
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }
    public void setPrecioPublico(double precioPublico){
        this.precioPublico = precioPublico;
    }
    @Override
    public String toString() {
        return "id = "+id+"   nombre = "+nombre+"   descripcion = "+descripcion+"    precio_publico = "+precioPublico+ "   id_proveedor =" +idProveedor;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        if(cantidadInventario > 0)
            this.cantidadInventario = cantidadInventario;
        else 
            this.cantidadInventario = 1;
    }
    
}
