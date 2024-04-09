
package pkFormularios;

public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public frmMenu() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btbLibros = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btbCategorias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btbReservar = new javax.swing.JMenuItem();
        btbVerReservas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("Libros ");

        btbLibros.setText("Administrar Libros");
        btbLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbLibrosActionPerformed(evt);
            }
        });
        jMenu1.add(btbLibros);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Categorias");

        btbCategorias.setText("Administrar Categoría");
        btbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCategoriasActionPerformed(evt);
            }
        });
        jMenu2.add(btbCategorias);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reservas");

        btbReservar.setText("Rerservar Libro");
        btbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbReservarActionPerformed(evt);
            }
        });
        jMenu3.add(btbReservar);

        btbVerReservas.setText("Ver reservas");
        jMenu3.add(btbVerReservas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbLibrosActionPerformed
        frmLibro Libros = new frmLibro();
        Libros.setVisible(true);
        Libros.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btbLibrosActionPerformed

    private void btbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCategoriasActionPerformed
        frmCategoria categoria = new frmCategoria();
        categoria.setVisible(true);
        categoria.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btbCategoriasActionPerformed

    private void btbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbReservarActionPerformed
        frmReservas reservas = new frmReservas();
        reservas.setVisible(true);
    }//GEN-LAST:event_btbReservarActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btbCategorias;
    private javax.swing.JMenuItem btbLibros;
    private javax.swing.JMenuItem btbReservar;
    private javax.swing.JMenuItem btbVerReservas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
