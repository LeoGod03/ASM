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
        ProductoDao productoDao = new ProductoDao();
        
        productoDao.insertar(new Producto("Pd_2","Mata ratas","Extermina las ratas de tu hogar :D",345,"Pr_3"));
        productoDao.insertar(new Producto("Pd_3","Martillo","Construccion",216,"Pr_5"));
        productoDao.insertar(new Producto("Pd_4","Pintura","Estetica",800,"Pr_6"));
        productoDao.insertar(new Producto("Pd_5","Aerosol","Estetica",245,"Pr_7"));
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        
    }
    
}