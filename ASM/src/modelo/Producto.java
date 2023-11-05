/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;
import java.util.Scanner;


public final class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private double precioProveedor;
    private double precioPublico;
    private String idProveedor;
    private int cantidadInventario;
    private int cantidadMinima;
    private int cantidadPedido;
    
    
    public Producto(String id,String nombre,String descripcion,double precioProveedor, double precioPublico,String idProveedor,
                    int cantidadInventario, int cantidadMinima, int cantidadPedido){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.setPrecioPublico(precioPublico);
        this.setCantidadInventario(cantidadInventario);
        this.setPrecioProveedor(precioProveedor);
        this.idProveedor = idProveedor;
        this.setCantidadMinima(cantidadMinima);
        this.setCantidadPedido(cantidadPedido);
    }

   
   

    public void setId(int id){
        
        if(id > 0)
            this.id = "Pd_"+id;   
        else
            System.out.println("Valor del ID invalido");
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
    
    public void setCantidadInventario(int cantidadInventario) {
        if(cantidadInventario > 0)
            this.cantidadInventario = cantidadInventario;
        else 
            this.cantidadInventario = 1;
    }
    
     public void setCantidadPedido(int cantidadPedido) {
         if(cantidadPedido > 0)
             this.cantidadPedido = cantidadPedido;
         else
             this.cantidadPedido = 1;
    }
     
     public int setCantidadMinima(int cantidadMinima) {
         
        if(cantidadMinima > 0)
            this.cantidadMinima = cantidadMinima;
        else
            this.cantidadMinima = 1;
        return cantidadMinima;
    }

    
    public void setPrecioPublico(double precioPublico){
        if(precioPublico > 0)
            this.precioPublico = precioPublico; 
        else
            this.precioPublico = 1;
    }
    
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

    @Override
    public String toString() {
        String cadena = "id = "+id+" nombre = "+nombre+" descripcion = "+descripcion+" precio_proveedor = "+precioProveedor +" precio_publico = "+precioPublico
                      + " id_proveedor =" +idProveedor +" cantidad_inventario: "+cantidadInventario+"Cantidad_minima: "+cantidadMinima
                        +"Cantidad_pedido: " + cantidadPedido;
        return cadena;
    }

    
    
}
