
package asm;

import dao.ProductoDao;
import dao.ProveedorDao;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Producto;
import modelo.Proveedor;


public class FrmDatosProducto extends javax.swing.JFrame {
    // atributos de el form
    private final int id;
    private final FrmInventario inventario;
    private final ProductoDao productoDao;
    private final String accion;
    public FrmDatosProducto(Producto producto, FrmInventario inventario) {
        productoDao = new ProductoDao();
        initComponents(); // inicializamos los componentes
        int idProveedor;
        // si el producto no es nulo quiere decir que será para modificar por lo tanto llenamos los campos con la información del mismo
        if(producto != null){
            id = producto.getId();
            txtNombre.setText(producto.getNombre());
            txtaDescripcion.setText(producto.getDescripcion());
            txtPrecioProveedor.setText(String.valueOf(producto.getPrecioProveedor()));
            txtCantidadInventario.setText(String.valueOf(producto.getCantidadInventario()));
            txtPrecio.setText(String.valueOf( producto.getPrecioPublico()));
            txtProveedor.setText(String.valueOf(producto.getIdProveedor()));
            txtCantidadMinima.setText(String.valueOf(producto.getCantidadMinima()));
            txtCantidadPedido.setText(String.valueOf(producto.getCantidadPedido()));
            accion = "actualizado";
        }
        else{
            // caso contrario, se agrerará un nuevo producto y le creamos un id en automatico
            id = productoDao.buscarUltimoProducto().getId() + 1;
            accion = "agregado";
            
        }
        lblId.setText("Id producto: " + id);
        this.inventario = inventario;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecioPublico = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        btnAgregarActualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        lblCantidadInventario = new javax.swing.JLabel();
        txtCantidadInventario = new javax.swing.JTextField();
        lblCantidadMinima = new javax.swing.JLabel();
        txtCantidadMinima = new javax.swing.JTextField();
        lblCantidadPedido = new javax.swing.JLabel();
        txtCantidadPedido = new javax.swing.JTextField();
        lblPrecioProveedor = new javax.swing.JLabel();
        txtPrecioProveedor = new javax.swing.JTextField();

        setTitle("Datos producto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblId.setText("Id");

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre:(*)");

        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescripcion.setText("Descripcion(*):");

        lblPrecioPublico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrecioPublico.setText("Precio publico:(*)");

        lblProveedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProveedor.setText("Id proveedor:(*)");

        btnAgregarActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palomita.png"))); // NOI18N
        btnAgregarActualizar.setAutoscrolls(true);
        btnAgregarActualizar.setBorder(null);
        btnAgregarActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarActualizarMouseClicked(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        btCancelar.setAutoscrolls(true);
        btCancelar.setBorder(null);
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });

        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaDescripcion);

        lblCantidadInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCantidadInventario.setText("Cantidad en inventario:(*)");

        lblCantidadMinima.setText("Cantidad minima:(*)");

        lblCantidadPedido.setText("Cantidad de pedido:(*)");

        lblPrecioProveedor.setText("Precio proveedor:(*)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescripcion)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProveedor)
                                    .addComponent(lblPrecioProveedor))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(txtPrecioProveedor))))
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidadMinima)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantidadInventario)
                                    .addComponent(lblCantidadPedido))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCantidadPedido)
                                        .addComponent(txtCantidadMinima, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCantidadInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblPrecioPublico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblId)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProveedor)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecioProveedor)
                            .addComponent(txtPrecioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioPublico)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidadInventario)
                            .addComponent(txtCantidadInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidadMinima)
                            .addComponent(txtCantidadMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadPedido)
                    .addComponent(txtCantidadPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // metodo que actualiza / agrega productos
    private void btnAgregarActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarActualizarMouseClicked
       
        JTextField[] campos = {txtNombre,txtPrecio,txtCantidadInventario,txtProveedor,
                              txtCantidadMinima,txtCantidadPedido};
       
        
        Double precio,precioProveedor;
        int cantidadInventario;
        boolean formLleno = true;
        ProveedorDao proveedorDao = new ProveedorDao();
        // verificamos que ninguno de los textos es vacio
        for(JTextField campo : campos){
            if(campo.getText().equals("")){
                formLleno = false; // se pone en falsa cuando detecta que no esta lleno algún campo
                break;
            }
        }
        if(txtaDescripcion.getText().equals(""))
            formLleno = false;
        
        
       // verificamos que el form este lleno
       if(formLleno)
        {
         try
         {
             // hacemos los casteos de los datos numericos obtenidos
            int idProveedor = Integer.parseInt(txtProveedor.getText());
            int cantidadMinima=Integer.parseInt(txtCantidadMinima.getText());
            int cantidadPedido=Integer.parseInt(txtCantidadPedido.getText());
            cantidadInventario = Integer.parseInt(txtCantidadInventario.getText());
            precio = Double.valueOf(txtPrecio.getText());
            precioProveedor = Double.valueOf(txtPrecioProveedor.getText());
            // verificamos que los numeros sean positivos
            if(cantidadMinima > 0 && cantidadPedido > 0 && precio > 0 && precioProveedor > 0 && cantidadInventario > 0){
                if(proveedorDao.buscarProveedor(new Proveedor(idProveedor)) != null){ // verificamos que el proveedor elegido exista en la base de datos
                    // creamos un producto con la información obtenida
                    Producto producto = new Producto(id,txtNombre.getText(),txtaDescripcion.getText(),precioProveedor,precio,idProveedor,
                                                        cantidadInventario,cantidadMinima,cantidadPedido);
                    
                    // dependiendo de la acción se actualiza o se inserta un nuevo producto
                    if(accion.equals("agregado"))
                        productoDao.insertar(producto);
                    else
                        productoDao.actualizarProducto(producto);
                    
                    formWindowClosed(null); // mandamos a cerrar la ventana
                    // mostramos mensaje de exito
                    JOptionPane.showMessageDialog(null,"¡Producto "+accion+" con exito!","Exito", JOptionPane.INFORMATION_MESSAGE);
                    
                    
                }else{
                    // mensaje de proveedor no existente
                   JOptionPane.showMessageDialog(null,"""
                                                      El proveedor no se encuentra registrado, le
                                                      recomendamos que primero agregue al proveedor y
                                                      después el producto.""","Error", JOptionPane.ERROR_MESSAGE); 
                }
                    
          }else // mensaje de datos no positvos
                JOptionPane.showMessageDialog(null,"Ingrese valores apropiados en las cantidades minimas, de pedido y a los precios","Error a actualizar", JOptionPane.ERROR_MESSAGE);
          
       
        }catch(NumberFormatException nfe){ // mensaje por si los datos numericos no lo son
             JOptionPane.showMessageDialog(null,"Algun dato es invalido revisa por favor","Datos invalido", JOptionPane.ERROR_MESSAGE);
         }
       }else // mensaje por si el formulario esta incompleto
           JOptionPane.showMessageDialog(null,"Datos incompletos, favor de llenar bien los campos","Incompleto", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAgregarActualizarMouseClicked
    // metodo de cerrado de ventana
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // llamamos al inventario y actualizamos su tabla para después destruirse la ventana de edición
        inventario.limpiarTabla();
        inventario.lista = productoDao.pedirTabla();
        inventario.llenarTabla(inventario.lista);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed
    // metodo para destruir la ventana al darle clic al boton cancelar
    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btCancelarMouseClicked
    
  
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
            java.util.logging.Logger.getLogger(FrmDatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDatosProducto(new Producto(0),null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btnAgregarActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidadInventario;
    private javax.swing.JLabel lblCantidadMinima;
    private javax.swing.JLabel lblCantidadPedido;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioProveedor;
    private javax.swing.JLabel lblPrecioPublico;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JTextField txtCantidadInventario;
    private javax.swing.JTextField txtCantidadMinima;
    private javax.swing.JTextField txtCantidadPedido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioProveedor;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
}
