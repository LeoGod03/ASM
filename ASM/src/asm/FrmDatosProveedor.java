
package asm;
// importamos las librerias necesarias
import dao.ProveedorDao;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import modelo.Proveedor;


// constructor de la clase
public class FrmDatosProveedor extends javax.swing.JFrame {
    //atributos de la clase
    private final ProveedorDao proveedorDao;
    private final int id;
    private final FrmProveedores proveedores;
    private String accion;
    public FrmDatosProveedor(Proveedor proveedor,FrmProveedores proveedores) {
        proveedorDao = new ProveedorDao();
        initComponents(); // inicializamos los componentes 
        JCheckBox[] diasSeleccion = {tboxLunes,tboxMartes,tboxMiercoles,tboxJueves,tboxViernes,tboxSabado,tboxDomingo}; 
        if(proveedor != null){ // si el proveedor no es nulo se llenan los campos con la información del proveedor
            boolean[] dias = proveedor.getDias();
            id = proveedor.getId();
            txtNombre.setText(proveedor.getNombre());
            txtTelefono.setText(proveedor.getTelefono());
            txtCorreo.setText(proveedor.getCorreo());
            for(int i = 0; i < 7; i++)
                diasSeleccion[i].setSelected(dias[i]);
            accion = "actualizado";
        }else{ // en caso contrario le asignamos una id nueva el proveedor que se agregará
           if(proveedorDao.buscarUltimoProveedor() != null)
                id = proveedorDao.buscarUltimoProveedor().getId() + 1;  
           else
               id = 1;
           accion = "agregado";
        }
       
        this.proveedores = proveedores; 
       
        
        lblId.setText("ID proveedor " + id);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblLunes = new javax.swing.JLabel();
        lblMartes = new javax.swing.JLabel();
        lblMiercoles = new javax.swing.JLabel();
        lblJueves = new javax.swing.JLabel();
        lblViernes = new javax.swing.JLabel();
        lblSabado = new javax.swing.JLabel();
        lblDomingo = new javax.swing.JLabel();
        tboxLunes = new javax.swing.JCheckBox();
        tboxMartes = new javax.swing.JCheckBox();
        tboxMiercoles = new javax.swing.JCheckBox();
        tboxJueves = new javax.swing.JCheckBox();
        tboxViernes = new javax.swing.JCheckBox();
        tboxSabado = new javax.swing.JCheckBox();
        tboxDomingo = new javax.swing.JCheckBox();
        lblDiasReparto = new javax.swing.JLabel();
        btnAgregarActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Datos proveedor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblId.setText("Id proveedor:");

        lblNombre.setText("Nombre del proveedor:(*) ");

        lblTelefono.setText("Telefono:(*)");

        lblCorreo.setText("Correo:");

        lblLunes.setText("LUN");

        lblMartes.setText("MAR");

        lblMiercoles.setText("MIE");

        lblJueves.setText("JUE");

        lblViernes.setText("VIE");

        lblSabado.setText("SAB");

        lblDomingo.setText("DOM");

        tboxLunes.setAutoscrolls(true);
        tboxLunes.setBorder(null);

        tboxMartes.setBorder(null);
        tboxMartes.setBorderPainted(true);

        tboxMiercoles.setBorder(null);

        tboxJueves.setBorder(null);

        tboxViernes.setBorder(null);

        tboxSabado.setBorder(null);

        tboxDomingo.setBorder(null);

        lblDiasReparto.setText("Dias de reparto:(*)");

        btnAgregarActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palomita.png"))); // NOI18N
        btnAgregarActualizar.setAutoscrolls(true);
        btnAgregarActualizar.setBorder(null);
        btnAgregarActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarActualizarMouseClicked(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        btnCancelar.setAutoscrolls(true);
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblCorreo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLunes)
                                    .addComponent(tboxLunes))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMartes)
                                    .addComponent(tboxMartes))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tboxMiercoles)
                                    .addComponent(lblMiercoles))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tboxJueves)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblJueves)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblViernes)
                                    .addComponent(tboxViernes))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSabado)
                                    .addComponent(tboxSabado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDomingo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(tboxDomingo))))
                            .addComponent(lblDiasReparto))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblId)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnAgregarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDiasReparto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLunes)
                    .addComponent(lblMartes)
                    .addComponent(lblMiercoles)
                    .addComponent(lblJueves)
                    .addComponent(lblViernes)
                    .addComponent(lblSabado)
                    .addComponent(lblDomingo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tboxLunes)
                    .addComponent(tboxMartes)
                    .addComponent(tboxMiercoles)
                    .addComponent(tboxJueves)
                    .addComponent(tboxViernes)
                    .addComponent(tboxSabado)
                    .addComponent(tboxDomingo))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // metodo para cuando el usuario haga clic en agregar o actualizar
    private void btnAgregarActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarActualizarMouseClicked
        JCheckBox[] diasReparto = {tboxLunes,tboxMartes,tboxMiercoles,tboxJueves,tboxViernes,tboxSabado,tboxDomingo};
        int diasElegidos = 0;
        boolean correoValido = true;
        boolean[] dias = new boolean[7];
        // verificamos cuantos dias de reparto tiene el proveedor
        for(int i = 0; i < 7; i++){
            dias[i] = diasReparto[i].isSelected();
            if(diasReparto[i].isSelected())
                diasElegidos ++;
        }
        // si el correo no esta vacio, verificamos que sea un correo valido
        if(!txtCorreo.getText().isEmpty())
            correoValido = Proveedor.correoValido(txtCorreo.getText());
        // verificamos que los campos obligatorios no esten vacios
       if(!txtNombre.getText().isEmpty() && !txtTelefono.getText().isEmpty() && diasElegidos > 0){
           // creamos el proveedor con la información dada
          Proveedor proveedor = new Proveedor(id,txtNombre.getText(),txtTelefono.getText(),txtCorreo.getText(),dias);
          if(Proveedor.telefonoValido(proveedor.getTelefono()) && correoValido){ // verificamos que todo sea valido
              // dependiendo de la acción el proveedor se agrega o se actualiza
              if(accion.equals("agregado"))
                proveedorDao.insertar(proveedor);
              else
                proveedorDao.actualizarProveedor(proveedor);
              
              formWindowClosed(null);
              // se muestra mensaje de exito
              JOptionPane.showMessageDialog(null,"Proveedor "+accion+" con exito","En hora buena", JOptionPane.INFORMATION_MESSAGE);
          }else
              // mensaaje de telefono o correo invalido
             JOptionPane.showMessageDialog(null,"Numero de telefono o correo invalido, favor de revisar","Invalido", JOptionPane.ERROR_MESSAGE); 
          
       }else
           // mensaje de error cuando el formulario no esta lleno con los campos necesarios
           JOptionPane.showMessageDialog(null,"Datos necesarios incompletos, favor de revisar","Incompleto", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAgregarActualizarMouseClicked
    // metodo que destruye la form al dar clic al boton cancelar
    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked
    // cuando se cierra el form actualizamos la tabla del form del inventario y se destruye
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        proveedores.limpiarTabla();
        proveedores.lista = proveedorDao.pedirTabla();
        proveedores.llenarTabla(proveedores.lista);
        this.dispose();
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
            java.util.logging.Logger.getLogger(FrmDatosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDatosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDatosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDatosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDatosProveedor(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDiasReparto;
    private javax.swing.JLabel lblDomingo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblJueves;
    private javax.swing.JLabel lblLunes;
    private javax.swing.JLabel lblMartes;
    private javax.swing.JLabel lblMiercoles;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSabado;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblViernes;
    private javax.swing.JCheckBox tboxDomingo;
    private javax.swing.JCheckBox tboxJueves;
    private javax.swing.JCheckBox tboxLunes;
    private javax.swing.JCheckBox tboxMartes;
    private javax.swing.JCheckBox tboxMiercoles;
    private javax.swing.JCheckBox tboxSabado;
    private javax.swing.JCheckBox tboxViernes;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
