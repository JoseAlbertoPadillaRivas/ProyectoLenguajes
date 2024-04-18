
package pkFormularios;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkClases.cDevolucion;
import pkCrud.cCrudDevolucion;


public class frmVerDevoluciones extends javax.swing.JFrame {

    private cCrudDevolucion devolucion;
    private int idDevolucion;
    private int idReserva;    
    private String fechaEntrega; 
    private String Estado; 
    
    public frmVerDevoluciones() {
        initComponents();        
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
        tbDevoluciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdReserva = new javax.swing.JTextField();
        txtFechaEntrega = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnEditarDevolucion = new javax.swing.JButton();
        btnCargaDatos = new javax.swing.JButton();
        tbEliminarDevolucion = new javax.swing.JButton();
        txtIdDevolucion = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RESERVAS ");

        tbDevoluciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID DEVOLUCION", "ID RESERVA", "FECHA ENTREGA", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tbDevoluciones);

        jLabel2.setText("ID DEVOLUCION");

        jLabel3.setText("ID RESERVA");

        jLabel4.setText("FECHA ENTREGA");

        jLabel6.setText("ESTADO");

        btnEditarDevolucion.setText("EDITAR DEVOLUCION");
        btnEditarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDevolucionActionPerformed(evt);
            }
        });

        btnCargaDatos.setText("CARGAR DATOS");
        btnCargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaDatosActionPerformed(evt);
            }
        });

        tbEliminarDevolucion.setText("ELIMINAR DEVOLUCION");
        tbEliminarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEliminarDevolucionActionPerformed(evt);
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
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdReserva)
                    .addComponent(txtFechaEntrega)
                    .addComponent(txtEstado)
                    .addComponent(txtIdDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbEliminarDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(txtIdDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnCargaDatos)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarDevolucion)
                        .addGap(18, 18, 18)
                        .addComponent(tbEliminarDevolucion)
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

    private void btnEditarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDevolucionActionPerformed
        int idReserva = Integer.parseInt(txtIdReserva.getText());
        String fechaEntrega = txtFechaEntrega.getText();
        String estado = txtEstado.getText();        
        
        cDevolucion editarDevolucion = new cDevolucion(idReserva, fechaEntrega, estado);
        try {
            cCrudDevolucion crud = new cCrudDevolucion();
            crud.editarDevolucion(editarDevolucion);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        cargarRegistros();
        limpiar();
    }//GEN-LAST:event_btnEditarDevolucionActionPerformed

    private void tbEliminarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEliminarDevolucionActionPerformed
        int idDevolucion = Integer.parseInt(txtIdDevolucion.getText());
        cDevolucion eliminarDevolucion = new cDevolucion(idDevolucion);
        try {
            cCrudDevolucion crud = new cCrudDevolucion();
            crud.eliminarDevolucion(eliminarDevolucion);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        cargarRegistros();
        limpiar();
    }//GEN-LAST:event_tbEliminarDevolucionActionPerformed

    private void btnCargaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaDatosActionPerformed
       try {
            int modificar = tbDevoluciones.getSelectedRow();
            if (modificar >= 0) {
                txtIdDevolucion.setText(tbDevoluciones.getValueAt(modificar, 0).toString());
                txtIdReserva.setText(tbDevoluciones.getValueAt(modificar, 1).toString());
                txtFechaEntrega.setText(tbDevoluciones.getValueAt(modificar, 2).toString());
                txtEstado.setText(tbDevoluciones.getValueAt(modificar, 3).toString());               
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
            java.util.logging.Logger.getLogger(frmVerDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVerDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVerDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVerDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerDevoluciones().setVisible(true);
            }
        });
    }
    
    private void cargarRegistros() {
        try {

            List<cDevolucion> listaDevolucion = devolucion.ObtenerDevoluciones();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID DEVOLUCION");
            modeloTabla.addColumn("ID RESERVA");
            modeloTabla.addColumn("FECHA ENTREGA");
            modeloTabla.addColumn("ESTADO");            

            for (cDevolucion devolucion : listaDevolucion) {
                Object[] fila = {
                    devolucion.getIdDevolucion(),
                    devolucion.getIdReserva(),
                    devolucion.getFechaEntrega(),
                    devolucion.getEstadoDevolucion()};
                modeloTabla.addRow(fila);
            }

            tbDevoluciones.setModel(modeloTabla);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los registros de Libros.");
        }
    }
    
    public void limpiar() {
        txtIdDevolucion.setText("");
        txtIdReserva.setText("");
        txtFechaEntrega.setText("");
        txtEstado.setText("");        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaDatos;
    private javax.swing.JButton btnEditarDevolucion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDevoluciones;
    private javax.swing.JButton tbEliminarDevolucion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtIdDevolucion;
    private javax.swing.JTextField txtIdReserva;
    // End of variables declaration//GEN-END:variables
}
