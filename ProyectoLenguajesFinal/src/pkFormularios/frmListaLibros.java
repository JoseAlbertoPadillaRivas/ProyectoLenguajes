/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkFormularios;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkClases.cLibro;
import pkCrud.cCrudLibro;

/**
 *
 * @author josep
 */
public class frmListaLibros extends javax.swing.JFrame {

    private cCrudLibro libro;

    private int idLibro;
    private String nombre;
    private int numeroPaginas;
    private int idCategoria;
    private String fechaPublicacion;

    public frmListaLibros() {
        initComponents();
        libro = new pkCrud.cCrudLibro();
        cargarRegistros();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        lbIdLibro = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbPaginas = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        txtIdLibro = new javax.swing.JTextField();
        txtNombreLibro = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLibros = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCargarCampos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbIdLibro.setText("ID Libro");

        lbNombre.setText("Nombre");

        lbPaginas.setText("Paginas");

        lbCategoria.setText("ID Categoria");

        lbFecha.setText("Fecha de publicación");

        tbLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Libro", "Nombre", "Paginas", "ID Categoria", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tbLibros);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCargarCampos.setText("CARGAR CAMPOS");
        btnCargarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCamposActionPerformed(evt);
            }
        });

        btnVolver.setText("Menú principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnReservar.setText("RESERVAR");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbIdLibro)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreLibro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPaginas)
                                .addGap(18, 18, 18)
                                .addComponent(txtPaginas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(txtCategoria)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbFecha)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarCampos)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdLibro)
                    .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombre)
                            .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPaginas)
                            .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCategoria)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarCampos)
                    .addComponent(btnReservar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int idLibro = Integer.parseInt(txtIdLibro.getText());
        String nombre = txtNombreLibro.getText();
        int paginas = Integer.parseInt(txtPaginas.getText());
        int idCategoria = Integer.parseInt(txtCategoria.getText());
        String fecha = txtFecha.getText();

        cLibro editarLibro = new cLibro(idLibro, nombre, paginas, idCategoria, fecha);
        try {
            cCrudLibro crud = new cCrudLibro();
            crud.editarLibro(editarLibro);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        cargarRegistros();
        limpiar();


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCargarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCamposActionPerformed
        try {
            int modificar = tbLibros.getSelectedRow();
            if (modificar >= 0) {
                txtIdLibro.setText(tbLibros.getValueAt(modificar, 0).toString());
                txtNombreLibro.setText(tbLibros.getValueAt(modificar, 1).toString());
                txtPaginas.setText(tbLibros.getValueAt(modificar, 2).toString());
                txtCategoria.setText(tbLibros.getValueAt(modificar, 3).toString());
                txtFecha.setText(tbLibros.getValueAt(modificar, 4).toString());
            } else {
                JOptionPane.showMessageDialog(null, "No ha selecionado una fila para modificar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCargarCamposActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int idLibro = Integer.parseInt(txtIdLibro.getText());
        cLibro eliminarLibro = new cLibro(idLibro);
        try {
            cCrudLibro crud = new cCrudLibro();
            crud.eliminarLribo(eliminarLibro);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        cargarRegistros();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenu menu = new frmMenu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        frmReservas reservas = new frmReservas();
        reservas.setVisible(true);
    }//GEN-LAST:event_btnReservarActionPerformed

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
            java.util.logging.Logger.getLogger(frmListaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListaLibros().setVisible(true);
            }
        });
    }

    private void cargarRegistros() {
        try {

            List<cLibro> listaLibros = libro.ObtenerLibros();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID Libro");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Paginas");
            modeloTabla.addColumn("ID Categoria");
            modeloTabla.addColumn("Fecha");

            for (cLibro libro : listaLibros) {
                Object[] fila = {
                    libro.getIdLibro(),
                    libro.getNombre(),
                    libro.getNumeroPaginas(),
                    libro.getIdCategoria(),
                    libro.getFechaPublicacion(),};
                modeloTabla.addRow(fila);
            }

            tbLibros.setModel(modeloTabla);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los registros de Libros.");
        }
    }

    public void limpiar() {
        txtIdLibro.setText("");
        txtNombreLibro.setText("");
        txtPaginas.setText("");
        txtCategoria.setText("");
        txtFecha.setText("");
    }

    // TODO add your handling code here:

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarCampos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbIdLibro;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPaginas;
    private javax.swing.JTable tbLibros;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtNombreLibro;
    private javax.swing.JTextField txtPaginas;
    // End of variables declaration//GEN-END:variables
}
