
package asm;
// importamos las librerias necesarias
import dao.ProductoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;


public final class FrmInventario extends javax.swing.JFrame {
    // atributos de la clase 
    public ArrayList<Producto> lista;
    private final DefaultTableModel modelo;
    ProductoDao productoDao ;
    // constructor
    public FrmInventario() {
        productoDao = new ProductoDao(); 
        initComponents();
        // obtenemos los registros del inventario y llenamos la tabla
        modelo = (DefaultTableModel) tblProductos.getModel();
        lista = productoDao.pedirTabla();
        llenarTabla(lista);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInventario = new javax.swing.JLabel();
        lblCantidadProductos = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblBuscar = new javax.swing.JLabel();
        txtBuscarID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblInventario.setText("Inventario");

        lblCantidadProductos.setText("Productos:");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/+.png"))); // NOI18N
        btnAgregar.setAutoscrolls(true);
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setAutoscrolls(true);
        btnModificar.setBorder(null);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setAutoscrolls(true);
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setAutoscrolls(true);
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_producto", "Nombre_producto", "Descrpicion", "Precio_proveedor", "Precio_publico", "Id_proveedor", "Cantidad_inventario", "Cantidad_minima", "Cantidad_pedido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        lblBuscar.setText("Buscar:");

        txtBuscarID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("por ID:");

        jLabel2.setText("por nombre: ");

        txtBuscarNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar.png"))); // NOI18N
        btnMostrar.setAutoscrolls(true);
        btnMostrar.setBorder(null);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
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
                .addContainerGap()
                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(txtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 145, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCantidadProductos)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // metodo de hacer clicl al botón de eliminar
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
      if(tblProductos.getSelectedRow() != -1){ // verificamos que se haya seleccionado un producto
            // se obtiene el id del porducto seleccionado por el usuario desde la tabla
            Object productoObjeto = new Object();
            productoObjeto = modelo.getValueAt(tblProductos.getSelectedRow(),0);
            Producto producto = productoDao.buscarProducto(new Producto((int)productoObjeto)); // buscamos el producot en la base
            // preguntamos si esta seguro de eliminar el producto
            int opcion = JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar el producto: " + producto.getId()+"?","Confirmacion",JOptionPane.YES_NO_OPTION);
            // en caso afirmativo se elimina de la base de datos y de la tabla
            if(opcion == 0)
            {
              productoDao.eliminarProducto(producto);
              modelo.removeRow(tblProductos.getSelectedRow()); 
              // se muestra mensaje de eliminado con exito
              JOptionPane.showMessageDialog(null,"Producto eliminado con exito","Exito", JOptionPane.INFORMATION_MESSAGE);
            }

      }
      
    }//GEN-LAST:event_btnEliminarMouseClicked
    // metodo de hacer clic en el botón de modificar
    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
      if(tblProductos.getSelectedRow() != -1){ // verificamos que haya seleccionado el producto a modificar
            // buscamos el producto seleccionado y lo almacenamos en una instancia de producto
           Object productoObjeto = new Object();
           productoObjeto = modelo.getValueAt(tblProductos.getSelectedRow(),0);
           Producto producto = productoDao.buscarProducto(new Producto((int)productoObjeto));
           // creamos una ventana de datos de producto y le pasamos la referencia a dicha ventana
           FrmDatosProducto actualizar = new FrmDatosProducto(producto,this); // le pasamos como parametro el producto y la refrencia a la ventana inventario
           actualizar.setVisible(true);
      }
    }//GEN-LAST:event_btnModificarMouseClicked
    // metodo de agregar que crea una ventana de datos producto sin el mismo como parametro
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        FrmDatosProducto agregar = new FrmDatosProducto(null,this); // el producto es nulo porque será nuevo y una referencia a la ventana de inventario
        agregar.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarMouseClicked
    // metodo de hacer clic al botón buscar
    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        Object[] productoObjeto = new Object[9];
        // si el id a buscar no es vacio tendrá preferencia y su busqueda será por id
        if(!txtBuscarID.getText().equals("")){
            try{
               int numeroID = Integer.parseInt(txtBuscarID.getText()); // obtenemos el id
               Producto producto = productoDao.buscarProducto(new Producto(numeroID)); // buscamos dicho producto
                if(producto != null){ // si existe entonces actualizamos la tabla con un unico registro
                    limpiarTabla();
                    productoObjeto[0] = producto.getId();
                    productoObjeto[1] = producto.getNombre();
                    productoObjeto[2] = producto.getDescripcion();
                    productoObjeto[3] = producto.getPrecioProveedor();
                    productoObjeto[4] = producto.getPrecioPublico();
                    productoObjeto[5] = producto.getIdProveedor();
                    productoObjeto[6] = producto.getCantidadInventario();
                    productoObjeto[7] = producto.getCantidadMinima();
                    productoObjeto[8] = producto.getCantidadPedido();
                    modelo.addRow(productoObjeto);
                    lblCantidadProductos.setText("Productos en inventario: 1");
                }else{
                    // en caso de no encontrar producto se muestra un mensaje de que no existe y se limpia la tabla
                    lblCantidadProductos.setText("No hay productos");
                    limpiarTabla();
                    JOptionPane.showMessageDialog(null,"Producto no encontrado","busqueda vacia", JOptionPane.ERROR_MESSAGE);
                } 
            }catch(NumberFormatException nfe){
                // mensaje de error por si lo puesto por el usuario es de tipo incorrecto
                 JOptionPane.showMessageDialog(null,"Ingrese valores enteros","Error al buscar", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if(!txtBuscarNombre.getText().equals("")){
            // en caso de que el id es vacio se hará busqueda por nombre
            // creamos una lista de productos y le pedimos las coincidencias a la base de datos con el nombre
            ArrayList listaTemp = productoDao.buscarPorNombre(txtBuscarNombre.getText());
            // limpiamos y actualizamos la tabla con los registros encontrados
            limpiarTabla();
            llenarTabla(listaTemp);
            if(listaTemp.isEmpty()) // si dicha lista es vacio se mostrará un mensaje de error
                JOptionPane.showMessageDialog(null,"Producto(s) no encontrado","busqueda vacia", JOptionPane.ERROR_MESSAGE);
                
           
                 
        }
        txtBuscarID.setText("");
        txtBuscarNombre.setText("");

    }//GEN-LAST:event_btnBuscarMouseClicked
    // metodo de hacer clic al boton de mostrar inventario que lo que hace es obtener todos los registros de la base y llenar la tabla
    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked
        limpiarTabla();
        lista = productoDao.pedirTabla(); // obtenemos los registros de la tabla
        llenarTabla(lista); 
    }//GEN-LAST:event_btnMostrarMouseClicked
    //se elimina la ventana actual
    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // se crea una instancia del menu 
        FrmMenuPrincipal menu =  new FrmMenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

   
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
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInventario().setVisible(true);
                
            }
        });
    }
    // metodo que elimina todos los registros de la tabla componente
    void limpiarTabla(){
        for(int i = 0; i < tblProductos.getRowCount();i++)
        {
            modelo.removeRow(i);
            i--;
        }
    }
    // metodo que busca un producto de manera especifica y llena la tabla
    public void BuscarProducto(Producto productoBuscar){
        Producto producto = productoDao.buscarProducto(productoBuscar); // busva el producto
        limpiarTabla();
        if(producto != null){ // llena los registros si el producto si se encuentra
            lblCantidadProductos.setText("Cantidad Productos: 1");
            Object[] productoTabla = new Object[9];
            productoTabla[0] = producto.getId();
            productoTabla[1] = producto.getNombre();
            productoTabla[2] = producto.getDescripcion();
            productoTabla[3] = producto.getPrecioProveedor();
            productoTabla[4] = producto.getPrecioPublico();
            productoTabla[5] = producto.getIdProveedor();
            productoTabla[6] = producto.getCantidadInventario();
            productoTabla[7] = producto.getCantidadMinima();
            productoTabla[8] = producto.getCantidadPedido();
            modelo.addRow(productoTabla);
            tblProductos.setModel(modelo);
        }else{
            lblCantidadProductos.setText("No hay productos");
            JOptionPane.showMessageDialog(null,"Producto no encontrado","Error al buscar", JOptionPane.ERROR_MESSAGE);
        }
    }
    // metodo que llena la tabla con una lista
    public void llenarTabla(ArrayList<Producto> lista){
        int i;
        Object[] producto = new Object[9];
        // lena la tabla con los datos de los productos
        for(i = 0; i < lista.size(); i++){
            producto[0] = lista.get(i).getId();
            producto[1] = lista.get(i).getNombre();
            producto[2] = lista.get(i).getDescripcion();
            producto[3] = lista.get(i).getPrecioProveedor();
            producto[4] = lista.get(i).getPrecioPublico();
            producto[5] = lista.get(i).getIdProveedor();
            producto[6] = lista.get(i).getCantidadInventario();
            producto[7] = lista.get(i).getCantidadMinima();
            producto[8] = lista.get(i).getCantidadPedido();
            modelo.addRow(producto);
        }
        tblProductos.setModel(modelo);
        if(i != 0)
            lblCantidadProductos.setText("Productos en inventario: " + tblProductos.getRowCount());
        else
            lblCantidadProductos.setText("No hay productos");
            
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCantidadProductos;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtBuscarNombre;
    // End of variables declaration//GEN-END:variables
}
