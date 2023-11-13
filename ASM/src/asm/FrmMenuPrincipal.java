
package asm;

import dao.AlertaDao;

public class FrmMenuPrincipal extends javax.swing.JFrame {
    private final AlertaDao alertaDao;
    // constructor
    public FrmMenuPrincipal() {
        initComponents();
        alertaDao = new AlertaDao();
        
        btnAlertas.setText("Alertas("+alertaDao.pedirTabla().size()+")");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVenta = new javax.swing.JButton();
        btInventario = new javax.swing.JButton();
        btProveedores = new javax.swing.JButton();
        btCorteCaja = new javax.swing.JButton();
        lbBienvenido = new javax.swing.JLabel();
        lbVentas = new javax.swing.JLabel();
        lbInventario = new javax.swing.JLabel();
        lbProveedores = new javax.swing.JLabel();
        lbCorteCaja = new javax.swing.JLabel();
        btnAlertas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal");
        setResizable(false);

        btVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta-1.png"))); // NOI18N
        btVenta.setBorder(null);
        btVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVentaMouseClicked(evt);
            }
        });

        btInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario-1.png"))); // NOI18N
        btInventario.setBorder(null);
        btInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btInventarioMouseClicked(evt);
            }
        });

        btProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedores-1.png"))); // NOI18N
        btProveedores.setBorder(null);
        btProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btProveedoresMouseClicked(evt);
            }
        });

        btCorteCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corte de caja.png"))); // NOI18N
        btCorteCaja.setBorder(null);
        btCorteCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCorteCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCorteCajaMouseClicked(evt);
            }
        });

        lbBienvenido.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBienvenido.setText("Bienvenido");

        lbVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVentas.setText("venta");
        lbVentas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInventario.setText("Inventario");
        lbInventario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProveedores.setText("Proveedores");
        lbProveedores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbCorteCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCorteCaja.setText("CorteCaja");
        lbCorteCaja.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnAlertas.setText("Alertas");
        btnAlertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlertasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btCorteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(lbInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(lbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCorteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAlertas)
                        .addGap(370, 370, 370))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbBienvenido)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCorteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVentas)
                    .addComponent(lbInventario)
                    .addComponent(lbProveedores)
                    .addComponent(lbCorteCaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnAlertas)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // metodo para crear el inventario
    private void btInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInventarioMouseClicked
        // creamos el objeto inventario y después se auto destruye el menu 
        FrmInventario inventario = new FrmInventario();
        inventario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btInventarioMouseClicked
    // metodo que crea el punto de venta y destruye el form del menú
    private void btVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVentaMouseClicked
       FrmPuntoVenta venta = new FrmPuntoVenta();
       venta.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btVentaMouseClicked
    // metodo que crea el form de proveedores y destruye el form del menú
    private void btProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProveedoresMouseClicked
        FrmProveedores proveedores = new FrmProveedores();
        proveedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btProveedoresMouseClicked
    // metodo que crea el form de corte de caja y destruye el form del menú
    private void btCorteCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCorteCajaMouseClicked
        FrmCorteCaja corte = new FrmCorteCaja();
        corte.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btCorteCajaMouseClicked

    private void btnAlertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlertasMouseClicked
        FrmAlertas alertas = new FrmAlertas();
        alertas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAlertasMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCorteCaja;
    private javax.swing.JButton btInventario;
    private javax.swing.JButton btProveedores;
    private javax.swing.JButton btVenta;
    private javax.swing.JButton btnAlertas;
    private javax.swing.JLabel lbBienvenido;
    private javax.swing.JLabel lbCorteCaja;
    private javax.swing.JLabel lbInventario;
    private javax.swing.JLabel lbProveedores;
    private javax.swing.JLabel lbVentas;
    // End of variables declaration//GEN-END:variables
}
