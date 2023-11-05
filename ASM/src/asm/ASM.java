/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm;

import dao.ProductoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        
    }
    
}