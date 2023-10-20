/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm;

import dao.ProductoDao;
import modelo.Producto;

/**
 *
 * @author leopa
 */
public class ASM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto;
        ProductoDao productoDao = new ProductoDao();
        producto = productoDao.buscarProducto(new Producto("Pd_1","","",0,"",""));
        System.out.println("Nombre " + producto.getNombre() + " Descripcion " + producto.getDescripcion());
        
    }
    
}
