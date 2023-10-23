/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private double precioPublico;
    private String idProveedor;
    
    
    public Producto(String id,String nombre,String descripcion, double precioPublico,String idProveedor){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioPublico = precioPublico;
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
    
}
