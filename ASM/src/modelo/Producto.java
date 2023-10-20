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
    private String idControlCantidades;
    private String idProveedor;
    
    public Producto(String id,String nombre,String descripcion, double precioPublico,
            String idControlCantidades,String idProveedor){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioPublico = precioPublico;
        this.idControlCantidades = idControlCantidades;
        this.idProveedor = idProveedor;
    }

   
    public String getId() {
        return id;
    }

    //metodo compare no sea menor a cero y pd_'id consecutivo'
    public void setId(String id){
        
        this.id = id;
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

    
    public String getIdControlCantidades() {
        return idControlCantidades;
    }

    
    public void setIdControlCantidades(String idControlCantidades) {
        this.idControlCantidades = idControlCantidades;
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
    
    
}
