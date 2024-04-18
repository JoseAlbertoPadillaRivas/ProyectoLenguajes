/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkFormularios;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkClases.cReservas;
import pkCrud.cCrudDevolucion;
import pkCrud.cCrudReservas;

/**
 *
 * @author USER
 */
public class frmVerReservas extends javax.swing.JFrame {

    private cCrudReservas reserva;
    private cCrudDevolucion devolucion;
    private int idReserva;
    private int cedula;
    private int idLibro;
    private String fechaReserva; 
    private String fechaDevolucion; 
    
    public frmVerReservas() {
        initComponents();
        reserva = new pkCrud.cCrudReservas();
        devolucion = new pkCrud.cCrudDevolucion();
        cargarRegistros();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReservas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtIdLibro = new javax.swing.JTextField();
        txtFechaReserva = new javax.swing.JTextField();
        txtFechaDevolucion = new javax.swing.JTextField();
        btnEditaReserva = new javax.swing.JButton();
        btnCargaDatos = new javax.swing.JButton();
        btnDevolucion = new javax.swing.JButton();
        tbEliminarReserva = new javax.swing.JButton();
        txtIdReserva = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RESERVAS ");

        tbReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID RESERVA", "CEDULA", "ID LIBRO", "FECHA RESERVA", "FECHA DEVOLUCION"
            }
        ));
        jScrollPane1.setViewportView(tbReservas);

        jLabel2.setText("ID RESERVA");

        jLabel3.setText("CEDULA ");

        jLabel4.setText("ID LIBRO");

        jLabel5.setText("FECHA DEVOLUCION");

        jLabel6.setText("FECHA RESERVA");

        btnEditaReserva.setText("EDITAR RESERVA");
        btnEditaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaReservaActionPerformed(evt);
            }
        });

        btnCargaDatos.setText("CARGAR DATOS");
        btnCargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaDatosActionPerformed(evt);
            }
        });

        btnDevolucion.setText("DEVOLUCION");
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });

        tbEliminarReserva.setText("ELIMINAR RESERVA");
        tbEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEliminarReservaActionPerformed(evt);
            }
        });

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel4))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCedula)
                    .addComponent(txtIdLibro)
                    .addComponent(txtFechaReserva)
                    .addComponent(txtFechaDevolucion)
                    .addComponent(txtIdReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbEliminarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196)
                .addComponent(btnVolver)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVolver))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnCargaDatos)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditaReserva)
                        .addGap(18, 18, 18)
                        .addComponent(tbEliminarReserva)
                        .addGap(18, 18, 18)
                        .addComponent(btnDevolucion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaReservaActionPerformed
        int idReserva = Integer.parseInt(txtIdReserva.getText());
        int cedula = Integer.parseInt(txtCedula.getText());
        int idLibro = Integer.parseInt(txtIdLibro.getText());
        String fechaReserva = txtFechaReserva.getText();
        String fechaDevolucion = txtFechaDevolucion.getText();
        
        cReservas editarReserva = new cReservas(idReserva, cedula, idLibro, fechaReserva, fechaDevolucion);
        try {
            cCrudReservas crud = new cCrudReservas();
            crud.editarReserva(editarReserva);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        cargarRegistros();
        limpiar();
    }//GEN-LAST:event_btnEditaReservaActionPerformed

    private void tbEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEliminarReservaActionPerformed
        int idReserva = Integer.parseInt(txtIdReserva.getText());
        cReservas eliminarReserva = new cReservas(idReserva);
        try {
            cCrudReservas crud = new cCrudReservas();
            crud.eliminarReserva(eliminarReserva);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        cargarRegistros();
        limpiar();
    }//GEN-LAST:event_tbEliminarReservaActionPerformed

    private void btnCargaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaDatosActionPerformed
       try {
            int modificar = tbReservas.getSelectedRow();
            if (modificar >= 0) {
                txtIdReserva.setText(tbReservas.getValueAt(modificar, 0).toString());
                txtCedula.setText(tbReservas.getValueAt(modificar, 1).toString());
                txtIdLibro.setText(tbReservas.getValueAt(modificar, 2).toString());
                txtFechaReserva.setText(tbReservas.getValueAt(modificar, 3).toString());
                txtFechaDevolucion.setText(tbReservas.getValueAt(modificar, 4).toString());
            } else {
                JOptionPane.showMessageDialog(null, "No ha selecionado una fila para modificar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCargaDatosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
        int idReserva = Integer.parseInt(txtIdReserva.getText());
        try {
            cCrudDevolucion devolucion = new cCrudDevolucion();
            devolucion.devolucion(idReserva);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cargarRegistros();
        limpiar();
    }//GEN-LAST:event_btnDevolucionActionPerformed

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
            java.util.logging.Logger.getLogger(frmVerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerReservas().setVisible(true);
            }
        });
    }
    
    private void cargarRegistros() {
        try {

            List<cReservas> listaReservas = reserva.ObtenerReserva();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID RESERVA");
            modeloTabla.addColumn("CEDULA");
            modeloTabla.addColumn("ID LIBRO");
            modeloTabla.addColumn("FECHA RESERVA");
            modeloTabla.addColumn("FECHA DEVOLUCION");

            for (cReservas reserva : listaReservas) {
                Object[] fila = {
                    reserva.getIdReserva(),
                    reserva.getCedula(),
                    reserva.getIdLibro(),
                    reserva.getFechaReserva(),
                    reserva.getFechaDevolucion(),};
                modeloTabla.addRow(fila);
            }

            tbReservas.setModel(modeloTabla);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los registros de Libros.");
        }
    }
    
    public void limpiar() {
        txtIdReserva.setText("");
        txtCedula.setText("");
        txtIdLibro.setText("");
        txtFechaReserva.setText("");
        txtFechaDevolucion.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaDatos;
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JButton btnEditaReserva;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tbEliminarReserva;
    private javax.swing.JTable tbReservas;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFechaDevolucion;
    private javax.swing.JTextField txtFechaReserva;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtIdReserva;
    // End of variables declaration//GEN-END:variables
}