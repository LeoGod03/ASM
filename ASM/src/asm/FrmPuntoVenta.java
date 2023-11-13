
package asm;
// importamos las librerias que necesitamos
import dao.AlertaDao;
import dao.ProductoDao;
import dao.VentaDao;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.Venta;


public class FrmPuntoVenta extends javax.swing.JFrame {
    // atributos del form
    private final DefaultTableModel modelo;
    private final ProductoDao productoDao;
    private final VentaDao ventaDao;
    private final AlertaDao alertaDao;
    public double sumaTotal;
    // constructor;
    public FrmPuntoVenta() {
        // se incializan componentes y la variable del control de la suma de la venta
        sumaTotal = 0;
        initComponents();
        modelo = (DefaultTableModel) tblProductosVenta.getModel();
        productoDao = new ProductoDao();
        ventaDao = new VentaDao();
        alertaDao = new AlertaDao();
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

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palomita.png"))); // NOI18N
        btnAceptar.setBorder(null);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/+.png"))); // NOI18N
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        btnCancelar.setBorder(null);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
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
                .addGap(27, 27, 27)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblPrecioTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecioTexto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblPrecioTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecioTotal)
                        .addGap(26, 26, 26)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // metodo de hacer clic al boton agregar
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        int cantidad,idProducto;
        Producto producto;
        Object[] objetoProducto = new Object[4];
        // si tiene el id y la cantidad de producto entonces lo buscará en la base y obtendra el precio
        if(!txtIdProducto.getText().isEmpty() && !txtCantidad.getText().isEmpty()){
            try{
                cantidad = Integer.parseInt(txtCantidad.getText());
                idProducto = Integer.parseInt(txtIdProducto.getText());
                if(!buscarProducto("Pd_"+idProducto)){ // busca el producto por si ya esta en la lista de venta 
                    producto = productoDao.buscarProducto(new Producto("Pd_"+idProducto)); // buscamos el producto en la base
                    if(producto != null){

                        txtIdProducto.setText("");
                        txtCantidad.setText("");
                        sumaTotal += cantidad * producto.getPrecioPublico(); // se obtiene el precio, se multiplica por la cantidad y se le almacena en la suma
                        objetoProducto[0] = producto.getId();
                        objetoProducto[1] = producto.getNombre();
                        objetoProducto[2] = producto.getPrecioPublico();
                        objetoProducto[3] = cantidad;
                        modelo.addRow(objetoProducto);
                        tblProductosVenta.setModel(modelo);
                        lblPrecioTotal.setText("$"+sumaTotal);
                        if(producto.getCantidadInventario() < cantidad){ // si la cantidad pedida es menos que la del inventario se mandará una advertencia
                            JOptionPane.showMessageDialog(null,"""
                                                                        La cantidad de inventario del producto es menor a la 
                                                                        cantidad a vender.Si es el caso contario favor de 
                                                                        actualizar el inventario
                                                                           ""","Incoherencia", JOptionPane.ERROR_MESSAGE);
                        }
                    }else //mensaje por si no se encontro el producto en la base de datos
                         JOptionPane.showMessageDialog(null,"Producto no encontrado","Error al buscar", JOptionPane.ERROR_MESSAGE);
                }else{
                    txtIdProducto.setText("");
                    txtCantidad.setText("");
                    // mensaje por si el producto ya esta en la lista del pedido
                    JOptionPane.showMessageDialog(null,"Producto ya en lista, solo actualiza la cantidad","Error al buscar", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException nfe){
                // mensaje por si los datos no son numeros
               JOptionPane.showMessageDialog(null,"Ingresa numeros enteros en ID y cantidad","Error al agregar", JOptionPane.ERROR_MESSAGE); 
            }
        }else // mensaje por si los campos necesarios no estan llenos
             JOptionPane.showMessageDialog(null,"Datos incompletos, favor de llenar bien los campos","Error al agregar", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAgregarMouseClicked
    // al actualizar la tabla se actuliza la suma con este metodo 
    private void tblProductosVentaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblProductosVentaPropertyChange
        sumaTabla();
    }//GEN-LAST:event_tblProductosVentaPropertyChange
    // por si al darle enter y esta en alguno de los campos de busqueda la ejecute
    private void txtIdProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProductoKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
           btnAgregarMouseClicked(null);
    }//GEN-LAST:event_txtIdProductoKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
           btnAgregarMouseClicked(null);
    }//GEN-LAST:event_txtCantidadKeyPressed
    // metodo que calcula el precio y guarda la venta
    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
       if(tblProductosVenta.getRowCount() > 0){
           Object[] producto = new Object[2];
           Producto productoIteracion;
           int cantidad;
           // recorre la tabla y va actualizando la cantidad de inventario en la base de datos
           for(int i = 0; i < tblProductosVenta.getRowCount(); i++){
               producto[0] = tblProductosVenta.getValueAt(i, 0);
               producto[1]= tblProductosVenta.getValueAt(i,3);
               productoIteracion = productoDao.buscarProducto(new Producto((String)producto[0]));
               cantidad = Math.max(0, productoIteracion.getCantidadInventario() - (int)producto[1]);
               productoDao.actualizarCantidad(new Producto((String)producto[0]),cantidad);
               if(cantidad <= productoIteracion.getCantidadMinima())
                    alertaDao.insertar(productoIteracion);
           }
           java.sql.Date fecha = new java.sql.Date(new Date().getTime());
           int ultimoRegistro = DevolverUltimoID(); // asignamos id a la venta
           String id = "Vta_"+(ultimoRegistro+1);  
           Venta venta = new Venta(id, (java.sql.Date) fecha,sumaTotal); // creamos la venta
           ventaDao.insertar(venta); // la insertamos en la base
           limpiarTabla();
           lblPrecioTotal.setText("$0.0");
           // mensaje de exito
           JOptionPane.showMessageDialog(null,"Venta agregada con exito","En hora buena", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnAceptarMouseClicked
    // metodo que elimina un registro de la tabla y actualiza el monto de la venta
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(tblProductosVenta.getSelectedRow() != -1){
            modelo.removeRow(tblProductosVenta.getSelectedRow());
            tblProductosVenta.setModel(modelo);
            sumaTabla();
        }
    }//GEN-LAST:event_btnEliminarMouseClicked
    // metodo que crea el menu y se destruye la venta al hacer clic en menu principal
    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        FrmMenuPrincipal menu =  new FrmMenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked
    //metodo que devuelve el utlimo id de venta registrado
    private int DevolverUltimoID(){
        int id = 0;
        String[] partesId;
        Venta venta = ventaDao.buscarUltimaVenta(); // busca la venta en la base
        if(venta != null){
            partesId = venta.getId().split("_");
            id = Integer.parseInt(partesId[1]);
            System.out.println(id);
        }
        return id; // regresa el id
    }
    // metodo que limpia la tabla 
    void limpiarTabla(){
        for(int i = 0; i < tblProductosVenta.getRowCount();i++)
        {
            modelo.removeRow(i);
            i--;
        }
    }
    // metodo que recorre la tabla y hace la suma
    private void sumaTabla(){
        
        Producto iteracion;
        Boolean incoherencia = false;
        sumaTotal = 0;
        Object[] objeto = new Object[3];
        // recorre la tabla
        for(int i = 0; i < tblProductosVenta.getRowCount(); i++){
            objeto[0] = modelo.getValueAt(i, 3);
            objeto[1] = modelo.getValueAt(i, 2);
            objeto[2] = modelo.getValueAt(i,0);
            
            iteracion = productoDao.buscarProducto(new Producto((String)objeto[2]));
            sumaTotal += (Double) objeto[1] * (int) objeto[0]; // almacenamos la suma
           if(iteracion.getCantidadInventario() < (int)objeto[0] && !incoherencia) // buscamos alguna incoherencia con las cantidades pedidas y de inventario
                incoherencia = true;
                
        }
        if(incoherencia){ // en caso de incoherencia manda mensaje de advertencia
            JOptionPane.showMessageDialog(null,"""
                                                                    La cantidad de inventario de algún producto es menor a la 
                                                                    cantidad a vender.Si es el caso contario favor de 
                                                                    actualizar el inventario
                                                                       ""","Incoherencia", JOptionPane.ERROR_MESSAGE);
        }
            
        lblPrecioTotal.setText("$"+sumaTotal);
    }
    // busca un producto existente en la tabla de pedidos en la venta
    private boolean buscarProducto(String id){
        boolean esta = false;
        for(int i = 0; i < tblProductosVenta.getRowCount(); i++){
            if(id.equals(tblProductosVenta.getValueAt(i, 0))){
                esta = true; // si lo encuentra se establece en true y se corta el ciclo
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
