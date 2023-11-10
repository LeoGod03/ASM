package asm;

import dao.ProveedorDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedor;



public final class FrmProveedores extends javax.swing.JFrame {

    public ArrayList<Proveedor> lista;
    private final DefaultTableModel modelo;
    ProveedorDao proveedorDao;
    public FrmProveedores() {
        initComponents();
        proveedorDao = new ProveedorDao();
        modelo = (DefaultTableModel) tblProveedores.getModel();
        lista = proveedorDao.pedirTabla();
        llenarTabla(lista);
        
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarID = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblLista = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrarLista = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedores");

        lblBuscar.setText("Buscar");

        jLabel1.setText("por ID:");

        lblNombre.setText("por nombre");

        btnBuscar.setText("Buscar");
        btnBuscar.setAutoscrolls(true);
        btnBuscar.setBorder(null);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        lblLista.setText("Lista");

        lblProveedores.setText("Proveedores");

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id proveedor", "Nombre proveedor", "Telefono", "Correo", "Dias de reparto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProveedores);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAgregar.setAutoscrolls(true);
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setAutoscrolls(true);
        btnModificar.setBorder(null);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setAutoscrolls(true);
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnMostrarLista.setText("Mostrar lista completa");
        btnMostrarLista.setAutoscrolls(true);
        btnMostrarLista.setBorder(null);
        btnMostrarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarLista.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMostrarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarListaMouseClicked(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBuscar)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblLista))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProveedores)
                            .addComponent(btnBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLista)
                    .addComponent(lblProveedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(tblProveedores.getSelectedRow() != -1){
            Object[] proveedorObjeto = new Object[1];
            proveedorObjeto[0] = modelo.getValueAt(tblProveedores.getSelectedRow(),0);
            Proveedor proveedor = proveedorDao.buscarProveedor(new Proveedor((String)proveedorObjeto[0]));
            int opcion = JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar el proveedor: " + proveedor.getId()+"?","Confirmacion",JOptionPane.YES_NO_OPTION);
            if(opcion == 0){
                 proveedorDao.eliminarProveedor(proveedor);
                modelo.removeRow(tblProveedores.getSelectedRow()); 
                JOptionPane.showMessageDialog(null,"Proveedor Eliminado con exito","Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnMostrarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarListaMouseClicked
        limpiarTabla();
        lista = proveedorDao.pedirTabla();
        llenarTabla(lista);
    }//GEN-LAST:event_btnMostrarListaMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        FrmDatosProveedor agregar = new FrmDatosProveedor(null,this);
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
       Object[] proveedorObjeto = new Object[1];
       proveedorObjeto[0] = modelo.getValueAt(tblProveedores.getSelectedRow(),0);
       Proveedor proveedor = proveedorDao.buscarProveedor(new Proveedor((String)proveedorObjeto[0]));
       FrmDatosProveedor actualizar = new FrmDatosProveedor(proveedor,this);
       actualizar.setVisible(true);
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
         Object[] proveedorObjeto = new Object[5];
        if(!txtBuscarID.getText().equals("")){
            try{
               int numeroID = Integer.parseInt(txtBuscarID.getText());
               Proveedor proveedor = proveedorDao.buscarProveedor(new Proveedor("Pr_"+numeroID));
                if(proveedor != null){
                    limpiarTabla();
                    proveedorObjeto[0] = proveedor.getId();
                    proveedorObjeto[1] = proveedor.getNombre();
                    proveedorObjeto[2] = proveedor.getTelefono();
                    proveedorObjeto[3] = proveedor.getCorreo();
                    proveedorObjeto[4] = proveedor.escribirDias();
                    modelo.addRow(proveedorObjeto);
                    lblProveedores.setText("Productos en inventario: 1");
                }else{
                    lblProveedores.setText("No hay productos");
                    limpiarTabla();
                    JOptionPane.showMessageDialog(null,"Proveedor no encontrado","busqueda vacia", JOptionPane.ERROR_MESSAGE);
                } 
            }catch(NumberFormatException nfe){
                 JOptionPane.showMessageDialog(null,"Ingrese valores enteros","Error al buscar", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if(!txtBuscarNombre.getText().equals("")){
            ArrayList listaTemp = proveedorDao.buscarPorNombre(txtBuscarNombre.getText());
            limpiarTabla();
            llenarTabla(listaTemp);
            if(listaTemp.isEmpty())
                 JOptionPane.showMessageDialog(null,"Proveedor(es) no encontrado","busqueda vacia", JOptionPane.ERROR_MESSAGE);
           
        }
        txtBuscarID.setText("");
        txtBuscarNombre.setText("");
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
       FrmMenuPrincipal menu =  new FrmMenuPrincipal();
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked
    
    void limpiarTabla(){
        for(int i = 0; i < tblProveedores.getRowCount();i++)
        {
            modelo.removeRow(i);
            i--;
        }
    }
    
    public void llenarTabla(ArrayList<Proveedor> lista){
        int i;
        Object[] proveedor = new Object[5];
        for(i = 0; i < lista.size(); i++){
            proveedor[0] = lista.get(i).getId();
            proveedor[1] = lista.get(i).getNombre();
            proveedor[2] = lista.get(i).getTelefono();
            proveedor[3] = lista.get(i).getCorreo();
            proveedor[4] = lista.get(i).escribirDias();
           
            modelo.addRow(proveedor);
        }
        tblProveedores.setModel(modelo);
        if(i != 0)
            lblProveedores.setText("Proveedores: " + tblProveedores.getRowCount());
        else
            lblProveedores.setText("No hay proveedores");
            
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
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProveedores().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtBuscarNombre;
    // End of variables declaration//GEN-END:variables
}
