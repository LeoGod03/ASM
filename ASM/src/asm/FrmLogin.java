
package asm;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class FrmLogin extends javax.swing.JFrame {

   // constructor del form
    public FrmLogin() {
        initComponents(); // inicializan los componentes
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogo = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        pwUsuario = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca de agua.png"))); // NOI18N
        lbLogo.setToolTipText("");
        lbLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Usuario");
        lbUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pwUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwUsuarioKeyPressed(evt);
            }
        });

        btLogin.setText("Iniciar sesion");
        btLogin.setToolTipText("");
        btLogin.setBorder(null);
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogin.setName("btLogin"); // NOI18N
        btLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btLoginMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(pwUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogin)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        lbLogo.getAccessibleContext().setAccessibleName("lbLogoTlapaleria");
        lbUsuario.getAccessibleContext().setAccessibleName("lbUsuario");
        pwUsuario.getAccessibleContext().setAccessibleName("pwUsuario");
        btLogin.getAccessibleContext().setAccessibleName("btLogin");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // metodo para cuando presione el botón de inicio de sesión
    private void btLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoginMousePressed
        String password = new String(pwUsuario.getPassword());
        if(password.equals("TlapAdmin"))// se verifica que la contraseña es correcta
        {
            // se crea el menu y se manda mensaje de login correcto
            FrmMenuPrincipal menu = new FrmMenuPrincipal();
            JOptionPane.showMessageDialog(null,"¡Login exitoso!","Login",JOptionPane.INFORMATION_MESSAGE);
            menu.setVisible(true);
            this.dispose();
            
        }
        else 
            // se manda un mensaje de error en caso de que la contraseña no sea correcta
            JOptionPane.showMessageDialog(null, "contraseña no valida", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btLoginMousePressed
    
    //evento de presionar una tecla
    private void pwUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwUsuarioKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER) // si la tecla es enter entonces ejecuta el codigo del boton de iniciar sesión
           btLoginMousePressed(null);
    }//GEN-LAST:event_pwUsuarioKeyPressed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pwUsuario;
    // End of variables declaration//GEN-END:variables
}
