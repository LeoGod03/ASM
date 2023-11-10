/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm;


import dao.VentaDao;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Venta;



public final class FrmCorteCaja extends javax.swing.JFrame {

    private final DefaultTableModel modelo;
    private ArrayList<Venta> lista;
    private VentaDao ventaDao;
    public FrmCorteCaja() {
        initComponents();
        fchIni.setDateFormatString("yyyy-MM-dd");
        fchFinal.setDateFormatString("yyyy-MM-dd");
        ventaDao = new VentaDao();
        java.util.Date fecha = new java.util.Date(new java.util.Date().getTime());
        System.out.println(fecha);
        modelo = (DefaultTableModel) tblVentas.getModel();
        fchIni.setDate(fecha);
        lista = ventaDao.corteCajaDia(fecha);
        llenarTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        fchIni = new com.toedter.calendar.JDateChooser();
        fchFinal = new com.toedter.calendar.JDateChooser();
        lblCorteCaja = new javax.swing.JLabel();
        rbtnDia = new javax.swing.JRadioButton();
        rbtnIntervalo = new javax.swing.JRadioButton();
        lblVentas = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnCorte = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_venta", "Fecha", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblVentas);

        fchFinal.setEnabled(false);

        lblCorteCaja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCorteCaja.setText("Corte de caja");

        rbtnDia.setSelected(true);
        rbtnDia.setText("por día");
        rbtnDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnDiaMouseClicked(evt);
            }
        });

        rbtnIntervalo.setText("por intervalo de fechas");
        rbtnIntervalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnIntervaloMouseClicked(evt);
            }
        });

        lblVentas.setText("Numero de ventas:");

        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(null);
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        btnCorte.setText("Calcular corte");
        btnCorte.setBorder(null);
        btnCorte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCorteMouseClicked(evt);
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
                        .addGap(240, 240, 240)
                        .addComponent(lblCorteCaja))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCorte, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(fchIni, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(55, 55, 55)
                                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(rbtnDia)
                                            .addGap(311, 311, 311)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbtnIntervalo)
                                        .addComponent(fchFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lblVentas)
                                .addComponent(jScrollPane1)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCorteCaja)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnDia)
                    .addComponent(rbtnIntervalo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fchFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fchIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCorte, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnIntervaloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnIntervaloMouseClicked
        rbtnDia.setSelected(!rbtnIntervalo.isSelected());
        fchFinal.setEnabled(rbtnIntervalo.isSelected());
    }//GEN-LAST:event_rbtnIntervaloMouseClicked

    private void rbtnDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnDiaMouseClicked
        rbtnIntervalo.setSelected(!rbtnDia.isSelected());
        fchFinal.setEnabled(!rbtnDia.isSelected());
    }//GEN-LAST:event_rbtnDiaMouseClicked

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        limpiarTabla();
        if(rbtnDia.isSelected())
            lista = ventaDao.corteCajaDia(fchIni.getDate());
        else
            lista = ventaDao.corteCajaIntervalo(fchIni.getDate(), fchFinal.getDate());
        
        llenarTabla();
    }//GEN-LAST:event_btnCalcularMouseClicked

    private void btnCorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMouseClicked
        String mensaje = "Las ventas de "+fchIni.getDate();
        if(rbtnIntervalo.isSelected())
            mensaje += " - " + fchFinal.getDate();
        double sumaTotal = 0;
        int i;
        for(i = 0; i < tblVentas.getRowCount(); i++){
            sumaTotal += (Double) tblVentas.getValueAt(i, 2);
            ventaDao.eliminarVenta(new Venta((String) tblVentas.getValueAt(i,0)));
        }
        mensaje += "\nfueron: "+i +" y la cantidad de dinero\ngenerado fue: "+sumaTotal;
        limpiarTabla();
        JOptionPane.showMessageDialog(null,mensaje,"Corte", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCorteMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
       FrmMenuPrincipal menu =  new FrmMenuPrincipal();
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked
    
    void limpiarTabla(){
        for(int i = 0; i < tblVentas.getRowCount();i++)
        {
            modelo.removeRow(i);
            i--;
        }
    } 
   public void llenarTabla(){
        int i;
        Object[] venta = new Object[3];
        for(i = 0; i < lista.size(); i++){
            venta[0] = lista.get(i).getId();
            venta[1] = lista.get(i).getFecha();
            venta[2] = lista.get(i).getTotalVenta();
            modelo.addRow(venta);
        }
        tblVentas.setModel(modelo);
        if(i != 0)
            lblVentas.setText("Número de ventas: " + tblVentas.getRowCount());
        else
            lblVentas.setText("No hay ventas");
            
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCorteCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCorte;
    private javax.swing.JButton btnMenu;
    private com.toedter.calendar.JDateChooser fchFinal;
    private com.toedter.calendar.JDateChooser fchIni;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorteCaja;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JRadioButton rbtnDia;
    private javax.swing.JRadioButton rbtnIntervalo;
    private javax.swing.JTable tblVentas;
    // End of variables declaration//GEN-END:variables
}
