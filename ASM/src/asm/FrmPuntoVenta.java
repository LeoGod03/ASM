/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm;

import dao.ProductoDao;
import dao.VentaDao;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.Venta;

/**
 *
 * @author leopa
 */
public class FrmPuntoVenta extends javax.swing.JFrame {

    private final DefaultTableModel modelo;
    private ProductoDao productoDao;
    private VentaDao ventaDao;
    public double sumaTotal;
    public FrmPuntoVenta() {
        sumaTotal = 0;
        initComponents();
        modelo = (DefaultTableModel) tblProductosVenta.getModel();
        productoDao = new ProductoDao();
        ventaDao = new VentaDao();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdProducto = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductosVenta = new javax.swing.JTable();
        lblPrecioTexto = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venta");

        lblIdProducto.setText("Id producto:");

        txtIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdProductoKeyPressed(evt);
            }
        });

        lblCantidad.setText("Cantidad:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });

        tblProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_producto", "Nombre_producto", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductosVenta.getTableHeader().setReorderingAllowed(false);
        tblProductosVenta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblProductosVentaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductosVenta);

        lblPrecioTexto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPrecioTexto.setText("Precio total");

        lblPrecioTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPrecioTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioTotal.setText("$0.0");

        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);

        btnEliminar.setText("Eliminar de la lista");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnMenu.setText("Menú principal");
        btnMenu.setBorder(null);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdProducto)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnAgregar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblPrecioTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecioTexto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdProducto)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblPrecioTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecioTotal)
                        .addGap(31, 31, 31)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        int cantidad,idProducto;
        Producto producto;
        Object[] objetoProducto = new Object[4];
        
        if(!txtIdProducto.getText().isEmpty() && !txtCantidad.getText().isEmpty()){
            try{
                cantidad = Integer.parseInt(txtCantidad.getText());
                idProducto = Integer.parseInt(txtIdProducto.getText());
                if(!buscarProducto("Pd_"+idProducto)){
                    producto = productoDao.buscarProducto(new Producto("Pd_"+idProducto));
                    System.out.print(producto);
                    if(producto != null){

                        txtIdProducto.setText("");
                        txtCantidad.setText("");
                        sumaTotal += cantidad * producto.getPrecioPublico();
                        objetoProducto[0] = producto.getId();
                        objetoProducto[1] = producto.getNombre();
                        objetoProducto[2] = producto.getPrecioPublico();
                        objetoProducto[3] = cantidad;
                        modelo.addRow(objetoProducto);
                        tblProductosVenta.setModel(modelo);
                        lblPrecioTotal.setText("$"+sumaTotal);
                        if(producto.getCantidadInventario() >= cantidad){

                        }else{
                            JOptionPane.showMessageDialog(null,"""
                                                                        La cantidad de inventario del producto es menor a la 
                                                                        cantidad a vender.Si es el caso contario favor de 
                                                                        actualizar el inventario
                                                                           ""","Incoherencia", JOptionPane.ERROR_MESSAGE);
                        }
                    }else
                         JOptionPane.showMessageDialog(null,"Producto no encontrado","Error al buscar", JOptionPane.ERROR_MESSAGE);
                }else{
                    txtIdProducto.setText("");
                    txtCantidad.setText("");
                    JOptionPane.showMessageDialog(null,"Producto ya en lista, solo actualiza la cantidad","Error al buscar", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException nfe){
               JOptionPane.showMessageDialog(null,"Ingresa numeros enteros en ID y cantidad","Error al agregar", JOptionPane.ERROR_MESSAGE); 
            }
        }else
             JOptionPane.showMessageDialog(null,"Datos incompletos, favor de llenar bien los campos","Error al agregar", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void tblProductosVentaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblProductosVentaPropertyChange
        sumaTabla();
    }//GEN-LAST:event_tblProductosVentaPropertyChange

    private void txtIdProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProductoKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
           btnAgregarMouseClicked(null);
    }//GEN-LAST:event_txtIdProductoKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
           btnAgregarMouseClicked(null);
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
       if(tblProductosVenta.getRowCount() > 0){
           Object[] producto = new Object[2];
           for(int i = 0; i < tblProductosVenta.getRowCount(); i++){
               producto[0] = tblProductosVenta.getValueAt(i, 0);
               producto[1]= tblProductosVenta.getValueAt(i,3);
               productoDao.actualizarCantidad(new Producto((String)producto[0]),(int) producto[1]);
           }
           java.sql.Date fecha = new java.sql.Date(new java.util.Date().getTime());
           int ultimoRegistro = DevolverUltimoID();
           String id = "Vta_"+(ultimoRegistro+1);  
           Venta venta = new Venta(id,fecha,sumaTotal);
           ventaDao.insertar(venta);
           limpiarTabla();
           lblPrecioTotal.setText("$0.0");
           JOptionPane.showMessageDialog(null,"Venta agregada con exito","En hora buena", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(tblProductosVenta.getSelectedRow() != -1){
            modelo.removeRow(tblProductosVenta.getSelectedRow());
            tblProductosVenta.setModel(modelo);
            sumaTabla();
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        FrmMenuPrincipal menu =  new FrmMenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

    private int DevolverUltimoID(){
        int id = 0;
        String[] partesId;
        Venta venta = ventaDao.buscarUltimaVenta();
        if(venta != null){
            partesId = venta.getId().split("_");
            id = Integer.parseInt(partesId[1]);
            System.out.println(id);
        }
        return id;
    }
    
    void limpiarTabla(){
        for(int i = 0; i < tblProductosVenta.getRowCount();i++)
        {
            modelo.removeRow(i);
            i--;
        }
    }
    
    private void sumaTabla(){
        
        Producto iteracion;
        Boolean incoherencia = false;
        sumaTotal = 0;
        Object[] objeto = new Object[3];
        for(int i = 0; i < tblProductosVenta.getRowCount(); i++){
            objeto[0] = modelo.getValueAt(i, 3);
            objeto[1] = modelo.getValueAt(i, 2);
            objeto[2] = modelo.getValueAt(i,0);
            
            iteracion = productoDao.buscarProducto(new Producto((String)objeto[2]));
            sumaTotal += (Double) objeto[1] * (int) objeto[0];
           if(iteracion.getCantidadInventario() < (int)objeto[0] && !incoherencia)
                incoherencia = true;
                
        }
        if(incoherencia){
            JOptionPane.showMessageDialog(null,"""
                                                                    La cantidad de inventario de algún producto es menor a la 
                                                                    cantidad a vender.Si es el caso contario favor de 
                                                                    actualizar el inventario
                                                                       ""","Incoherencia", JOptionPane.ERROR_MESSAGE);
        }
            
        lblPrecioTotal.setText("$"+sumaTotal);
    }
    
    private boolean buscarProducto(String id){
        boolean esta = false;
        for(int i = 0; i < tblProductosVenta.getRowCount(); i++){
            if(id.equals(tblProductosVenta.getValueAt(i, 0))){
                esta = true;
                break;
            }
        }
        return esta;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPuntoVenta().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblPrecioTexto;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JTable tblProductosVenta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdProducto;
    // End of variables declaration//GEN-END:variables
}
