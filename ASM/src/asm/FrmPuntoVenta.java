/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm;

import dao.ProductoDao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author leopa
 */
public class FrmPuntoVenta extends javax.swing.JFrame {

    private final DefaultTableModel modelo;
    private ProductoDao productoDao;
    public double sumaTotal;
    public FrmPuntoVenta() {
        sumaTotal = 0;
        initComponents();
        modelo = (DefaultTableModel) tblProductosVenta.getModel();
        productoDao = new ProductoDao();
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

        lblIdProducto.setText("Id del producto:");

        lblCantidad.setText("Cantidad:");

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

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnAgregar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblPrecioTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPrecioTexto)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblPrecioTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecioTotal)
                        .addGap(40, 40, 40)
                        .addComponent(btnAceptar)))
                .addContainerGap(30, Short.MAX_VALUE))
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
                producto = productoDao.buscarProducto(new Producto("Pd_"+idProducto));
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
            }catch(NumberFormatException nfe){
                
            }
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void tblProductosVentaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblProductosVentaPropertyChange
        sumaTabla();
    }//GEN-LAST:event_tblProductosVentaPropertyChange
    
    private void sumaTabla(){
        Producto iteracion;
        Boolean incoherencia = false;
        sumaTotal = 0;
        Object[] objeto = new Object[3];
        for(int i = 0; i < tblProductosVenta.getRowCount(); i++){
            objeto[0] = modelo.getValueAt(i, 3);
            objeto[1] = modelo.getValueAt(i, 2);
            objeto[2] = modelo.getValueAt(i,0);
            System.out.print(objeto[0]);
            System.out.print(objeto[1]);
            iteracion = productoDao.buscarProducto(new Producto("Pd_"+(String)objeto[2]));
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
