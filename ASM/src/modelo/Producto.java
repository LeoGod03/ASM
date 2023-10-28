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
    private double precioPublico;
    private String idProveedor;
    private int cantidadInventario;
    private int cantidadMinima;
    private int cantidadPedido;
    
    
    public Producto(String id,String nombre,String descripcion, double precioPublico,String idProveedor,int cantidadInventario, int cantidadMinima, int cantidadPedido){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.setPrecioPublico(precioPublico);
        this.setCantidadInventario(cantidadInventario);
        this.idProveedor = idProveedor;
        this.cantidadMinima = cantidadMinima;
        this.cantidadPedido = cantidadPedido;
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
    
    public void setCantidadInventario(int cantidadInventario) {
        if(cantidadInventario > 0)
            this.cantidadInventario = cantidadInventario;
        else 
            this.cantidadInventario = 1;
    }
    
     public int setCantidadPedido() {
        return cantidadPedido;
    }
     
     public int setCantidadMinima(int cantidadMinima) {
         
        if (cantidadMinima < 0)
        {
         JOptionPane.showMessageDialog(null,"Cantidad minima no valida","Error a actualizar", JOptionPane.ERROR_MESSAGE);
        } else{
            this.cantidadMinima = 1;
        }
        return cantidadMinima;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }
    public void setPrecioPublico(double precioPublico){
        this.precioPublico = precioPublico; 
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
    
    @Override
    public String toString() {
        return "id = "+id+"   nombre = "+nombre+"   descripcion = "+descripcion+"    precio_publico = "+precioPublico+ "   id_proveedor =" +idProveedor;
    }

    
    
}
