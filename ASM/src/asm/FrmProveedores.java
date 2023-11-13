package asm;
// importamos las librerias necesarias
import dao.ProveedorDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedor;



public final class FrmProveedores extends javax.swing.JFrame {
    // atributos del form
    public ArrayList<Proveedor> lista;
    private final DefaultTableModel modelo;
    ProveedorDao proveedorDao;
    // constructor
    public FrmProveedores() {
        // se inicializan los componentes y se obtienen los registros de la base de datos
        initComponents();
        proveedorDao = new ProveedorDao();
        modelo = (DefaultTableModel) tblProveedores.getModel();
        lista = proveedorDao.pedirTabla();
        llenarTabla(lista); // se llena la tabla
        
        
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

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
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

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/+.png"))); // NOI18N
        btnAgregar.setAutoscrolls(true);
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setAutoscrolls(true);
        btnModificar.setBorder(null);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setAutoscrolls(true);
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnMostrarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar.png"))); // NOI18N
        btnMostrarLista.setAutoscrolls(true);
        btnMostrarLista.setBorder(null);
        btnMostrarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarLista.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMostrarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarListaMouseClicked(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
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
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLista)
                    .addComponent(lblProveedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // metodo al hacer clic en el botón eliminar
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(tblProveedores.getSelectedRow() != -1){ // verificamos que haya seleccionado un proveeedor
            Object proveedorObjeto = new Object();
            proveedorObjeto  = modelo.getValueAt(tblProveedores.getSelectedRow(),0);
            Proveedor proveedor = proveedorDao.buscarProveedor(new Proveedor((String)proveedorObjeto)); // buscamos al proveedor en la base de datos
            // preguntamos si esta seguro de eliminar al proveedor
            int opcion = JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar el proveedor: " + proveedor.getId()+"?","Confirmacion",JOptionPane.YES_NO_OPTION);
            // si la opcion es afirmativa se elimina de la base y se muestra un mensaje de eliminado con exito
            if(opcion == 0){
                 proveedorDao.eliminarProveedor(proveedor);
                modelo.removeRow(tblProveedores.getSelectedRow()); 
                JOptionPane.showMessageDialog(null,"Proveedor eliminado con exito","Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked
    // metodo de mostrar inventario, pide los registros de toda la tabla y la llena
    private void btnMostrarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarListaMouseClicked
        limpiarTabla();
        lista = proveedorDao.pedirTabla();
        llenarTabla(lista);
    }//GEN-LAST:event_btnMostrarListaMouseClicked
    // metodo que crea una ventana para poder agregar un nuevo proveedor
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        FrmDatosProveedor agregar = new FrmDatosProveedor(null,this); // se pasa nulo porque será nuevo proveedor y la referencia a la ventana actual
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarMouseClicked
    // metodo para modificar a un proveedor
    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
       if(tblProveedores.getSelectedRow() != -1){ // verificamos que se haya seleccionado un proveedor a modificar
            // buscamos el producto seleccionado y lo almacenamos en una instancia de producto
           Object productoObjeto = new Object();
           productoObjeto = modelo.getValueAt(tblProveedores.getSelectedRow(),0);
           Proveedor proveedor = proveedorDao.buscarProveedor(new Proveedor((String)productoObjeto));
            // creamos una ventana con el proveedor seleccionado para mostrar la informacion dada
            FrmDatosProveedor actualizar = new FrmDatosProveedor(proveedor,this);
            actualizar.setVisible(true);
       }
    }//GEN-LAST:event_btnModificarMouseClicked
    // metodo que hace la busqueda
    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
         Object[] proveedorObjeto = new Object[5];
        if(!txtBuscarID.getText().equals("")){ // si el id no esta vacio la busqueda será por id directamente
            try{
               int numeroID = Integer.parseInt(txtBuscarID.getText());
               Proveedor proveedor = proveedorDao.buscarProveedor(new Proveedor("Pr_"+numeroID)); // buscamos al proveedor
                if(proveedor != null){ // si si se encuentra llenamos la tabla con el registro encontrado
                    limpiarTabla();
                    proveedorObjeto[0] = proveedor.getId();
                    proveedorObjeto[1] = proveedor.getNombre();
                    proveedorObjeto[2] = proveedor.getTelefono();
                    proveedorObjeto[3] = proveedor.getCorreo();
                    proveedorObjeto[4] = proveedor.escribirDias();
                    modelo.addRow(proveedorObjeto);
                    lblProveedores.setText("Productos en inventario: 1");
                }else{
                    // se limpia la tabla y se muestra un mensaje de error en caso de no encontrar el proveedor
                    lblProveedores.setText("No hay productos");
                    limpiarTabla();
                    JOptionPane.showMessageDialog(null,"Proveedor no encontrado","busqueda vacia", JOptionPane.ERROR_MESSAGE);
                } 
            }catch(NumberFormatException nfe){
                // mensaje de error por si los datos no son numeros
                 JOptionPane.showMessageDialog(null,"Ingrese valores enteros","Error al buscar", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if(!txtBuscarNombre.getText().equals("")){// si el id esta vacio pero el nombre no la busqueda será por nombre
            ArrayList listaTemp = proveedorDao.buscarPorNombre(txtBuscarNombre.getText()); // se buscan los registros con las coincidencias
            limpiarTabla(); 
            // se llena la tabla con los registros
            llenarTabla(listaTemp);
            if(listaTemp.isEmpty()) // si la lista es vacia se muestra un mensaje de proveedores no encontrados
                 JOptionPane.showMessageDialog(null,"Proveedor(es) no encontrado","busqueda vacia", JOptionPane.ERROR_MESSAGE);
           
        }
        txtBuscarID.setText("");
        txtBuscarNombre.setText("");
    }//GEN-LAST:event_btnBuscarMouseClicked
    // metodo que crea la ventana menu y se elimina la actual
    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
       FrmMenuPrincipal menu =  new FrmMenuPrincipal();
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked
    // metodo que limpia la tabla componente
    void limpiarTabla(){
        for(int i = 0; i < tblProveedores.getRowCount();i++)
        {
            modelo.removeRow(i);
            i--;
        }
    }
    // metodo que llena la tabla con los registros de la lisra
    public void llenarTabla(ArrayList<Proveedor> lista){
        int i;
        Object[] proveedor = new Object[5]; 
        // se recorre toda la lista y se llena la tabla
        for(i = 0; i < lista.size(); i++){
            proveedor[0] = lista.get(i).getId();
            proveedor[1] = lista.get(i).getNombre();
            proveedor[2] = lista.get(i).getTelefono();
            proveedor[3] = lista.get(i).getCorreo();
            proveedor[4] = lista.get(i).escribirDias();
           
            modelo.addRow(proveedor); // se agrega la nueva fila
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
