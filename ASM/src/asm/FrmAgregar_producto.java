/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm;

import dao.ProductoDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Producto;

/**
 *
 * @author leopa
 */
public class FrmAgregar_producto extends javax.swing.JFrame {

    /**
     * Creates new form FrmAgregar_producto
     */
    private ProductoDao productoDao = new ProductoDao();
    private String nuevoID;
    private FrmInventario inventario;
    public FrmAgregar_producto(FrmInventario inventario) {
        int ultimoRegistro = DevolverUltimoID();
        nuevoID = "Pd_"+(ultimoRegistro+1); 
        this.inventario = inventario;
        
        
        initComponents();
        lblId.setText("ID del nuevo producto: " + nuevoID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecio_Publico = new javax.swing.JLabel();
        lblId_Proveedor = new javax.swing.JLabel();
        lblCantidad_inventario = new javax.swing.JLabel();
        lblCantidad_minima = new javax.swing.JLabel();
        lblCantidad_pedido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtCantidadInventario = new javax.swing.JTextField();
        txtCantidadminima = new javax.swing.JTextField();
        txtCantidadpedido = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioProveedor = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblId.setText("Id");

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("nombre");

        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescripcion.setText("descripcion");

        lblPrecio_Publico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrecio_Publico.setText("precio publico:");

        lblId_Proveedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblId_Proveedor.setText("proveedor: Pr_");

        lblCantidad_inventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCantidad_inventario.setText("inventario");

        lblCantidad_minima.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCantidad_minima.setText("cantidad minima");

        lblCantidad_pedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCantidad_pedido.setText("cantidad pedido");

        btAgregar.setText("Agregar");
        btAgregar.setAutoscrolls(true);
        btAgregar.setBorder(null);
        btAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarMouseClicked(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.setAutoscrolls(true);
        btCancelar.setBorder(null);
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("precio proveedor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(txtNombre))
                        .addGap(66, 185, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioProveedor))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCantidad_pedido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCantidadpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCantidad_minima, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidadminima, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblCantidad_inventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblId_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                        .addComponent(lblPrecio_Publico, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCantidadInventario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPrecioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio_Publico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId_Proveedor)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidad_inventario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad_minima)
                            .addComponent(txtCantidadminima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad_pedido)
                            .addComponent(txtCantidadpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarMouseClicked
        boolean formLleno = true;
        JTextField[] campos = {txtNombre,txtDescripcion,txtPrecioProveedor,txtPrecio,txtCantidadInventario,txtProveedor,
                              txtCantidadminima,txtCantidadpedido};
        for(JTextField campo : campos){
            if(campo.getText().equals("")){
                formLleno = false;
                break;
            }
        }
        
        if(formLleno){
            Double precio,precioProveedor;
            int cantidadInventario, cantidadMinima,cantidadPedido;
            int idProveedor;
            try{ 
               idProveedor = Integer.parseInt(txtProveedor.getText());
               precioProveedor = Double.valueOf(txtPrecioProveedor.getText());
               precio = Double.valueOf(txtPrecio.getText());
               cantidadInventario = Integer.parseInt(txtCantidadInventario.getText());
               cantidadMinima = Integer.parseInt(txtCantidadminima.getText());
               cantidadPedido = Integer.parseInt(txtCantidadpedido.getText());
               Producto producto = new Producto(nuevoID,txtNombre.getText(),txtDescripcion.getText(),precioProveedor,precio,"Pr_"+idProveedor,
                                                cantidadInventario,cantidadMinima,cantidadPedido);
               
               productoDao.insertar(producto);
               JOptionPane.showMessageDialog(null,"Producto agregado con exito","En hora buena", JOptionPane.INFORMATION_MESSAGE);
               setVisible(false); 
               inventario.limpiarTabla();
               inventario.lista = productoDao.pedirTabla();
               inventario.llenarTabla(inventario.lista);
            }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null,"Algun dato es invalido revisa por favor","Error a actualizar", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"No se pudo guardar el producto en la bases de datos","Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
        
        }else
             JOptionPane.showMessageDialog(null,"Datos incompletos, favor de llenar bien los campos","Error a actualizar", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btAgregarMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        inventario.lista = productoDao.pedirTabla();
        inventario.llenarTabla(inventario.lista);
    }//GEN-LAST:event_formWindowClosed
    private int DevolverUltimoID(){
        int id = 0;
        String[] partesId;
        Producto producto = productoDao.buscarUltimoProducto();
        System.out.println(producto);
        if(producto != null){
            partesId = producto.getId().split("_");
            id = Integer.parseInt(partesId[1]);
            System.out.println(id);
        }
        return id;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmAgregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregar_producto(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCantidad_inventario;
    private javax.swing.JLabel lblCantidad_minima;
    private javax.swing.JLabel lblCantidad_pedido;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId_Proveedor;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio_Publico;
    private javax.swing.JTextField txtCantidadInventario;
    private javax.swing.JTextField txtCantidadminima;
    private javax.swing.JTextField txtCantidadpedido;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioProveedor;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
