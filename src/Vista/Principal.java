/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author USUARIO
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clienteUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clientePassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Pelicula = new javax.swing.JMenu();
        CrearPelicula = new javax.swing.JCheckBoxMenuItem();
        ModificarPelicula = new javax.swing.JCheckBoxMenuItem();
        EliminarPelicula = new javax.swing.JCheckBoxMenuItem();
        Sala = new javax.swing.JMenu();
        CrearSala = new javax.swing.JCheckBoxMenuItem();
        ModificarSala = new javax.swing.JCheckBoxMenuItem();
        EliminarSala = new javax.swing.JCheckBoxMenuItem();
        Sesion = new javax.swing.JMenu();
        CrearSesion = new javax.swing.JCheckBoxMenuItem();
        ModificarSesion = new javax.swing.JCheckBoxMenuItem();
        EliminarSesion = new javax.swing.JCheckBoxMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem3.setText("jMenuItem3");

        jMenu9.setText("jMenu9");

        jMenuItem4.setText("jMenuItem4");

        jMenu10.setText("File");
        jMenuBar3.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar3.add(jMenu11);

        jMenu14.setText("jMenu14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Administrador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Crear Reserva ");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Eliminar Reserva");

        Pelicula.setText("Pelicula");
        Pelicula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        CrearPelicula.setSelected(true);
        CrearPelicula.setText("Crear");
        CrearPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearPeliculaActionPerformed(evt);
            }
        });
        Pelicula.add(CrearPelicula);

        ModificarPelicula.setSelected(true);
        ModificarPelicula.setText("Modificar");
        ModificarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPeliculaActionPerformed(evt);
            }
        });
        Pelicula.add(ModificarPelicula);

        EliminarPelicula.setSelected(true);
        EliminarPelicula.setText("Eliminar");
        EliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPeliculaActionPerformed(evt);
            }
        });
        Pelicula.add(EliminarPelicula);

        jMenuBar1.add(Pelicula);

        Sala.setText("Sala");

        CrearSala.setSelected(true);
        CrearSala.setText("Crear");
        CrearSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearSalaActionPerformed(evt);
            }
        });
        Sala.add(CrearSala);

        ModificarSala.setSelected(true);
        ModificarSala.setText("Modificar");
        ModificarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarSalaActionPerformed(evt);
            }
        });
        Sala.add(ModificarSala);

        EliminarSala.setSelected(true);
        EliminarSala.setText("Eliminar");
        EliminarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarSalaActionPerformed(evt);
            }
        });
        Sala.add(EliminarSala);

        jMenuBar1.add(Sala);

        Sesion.setText("Sesion");

        CrearSesion.setSelected(true);
        CrearSesion.setText("Crear");
        CrearSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearSesionActionPerformed(evt);
            }
        });
        Sesion.add(CrearSesion);

        ModificarSesion.setSelected(true);
        ModificarSesion.setText("Modificar");
        ModificarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarSesionActionPerformed(evt);
            }
        });
        Sesion.add(ModificarSesion);

        EliminarSesion.setSelected(true);
        EliminarSesion.setText("Eliminar");
        EliminarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarSesionActionPerformed(evt);
            }
        });
        Sesion.add(EliminarSesion);

        jMenuBar1.add(Sesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clienteUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(clientePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clienteUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(clientePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearPeliculaActionPerformed
        Vista.CrearPelicula alt_crearPelicula= new Vista.CrearPelicula();
        alt_crearPelicula.setVisible(true);    
    }//GEN-LAST:event_CrearPeliculaActionPerformed

    private void EliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPeliculaActionPerformed
        Vista.EliminarPelicula alt_eliminarPelicula= new Vista.EliminarPelicula();
        alt_eliminarPelicula.setVisible(true);
    }//GEN-LAST:event_EliminarPeliculaActionPerformed

    private void ModificarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPeliculaActionPerformed
        Vista.ModificarPelicula alt_modificarPelicula= new Vista.ModificarPelicula();
        alt_modificarPelicula.setVisible(true);
    }//GEN-LAST:event_ModificarPeliculaActionPerformed

    private void CrearSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearSalaActionPerformed
        Vista.CrearSala alt_crearSala= new Vista.CrearSala();
        alt_crearSala.setVisible(true);
    }//GEN-LAST:event_CrearSalaActionPerformed

    private void ModificarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarSalaActionPerformed
        Vista.ModificarSala alt_modificarSala= new Vista.ModificarSala();
        alt_modificarSala.setVisible(true);
    }//GEN-LAST:event_ModificarSalaActionPerformed

    private void EliminarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarSalaActionPerformed
        Vista.EliminarSala alt_eliminarSala= new Vista.EliminarSala();
        alt_eliminarSala.setVisible(true);
    }//GEN-LAST:event_EliminarSalaActionPerformed

    private void CrearSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearSesionActionPerformed
        Vista.CrearSesion alt_crearSesion= new Vista.CrearSesion();
        alt_crearSesion.setVisible(true);
    }//GEN-LAST:event_CrearSesionActionPerformed

    private void ModificarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarSesionActionPerformed
        Vista.ModificarSesion alt_modificarSesion= new Vista.ModificarSesion();
        alt_modificarSesion.setVisible(true);
    }//GEN-LAST:event_ModificarSesionActionPerformed

    private void EliminarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarSesionActionPerformed
        Vista.EliminarSesion alt_eliminarSesion= new Vista.EliminarSesion();
        alt_eliminarSesion.setVisible(true);
    }//GEN-LAST:event_EliminarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vista.Administrador alt_administrador= new Vista.Administrador();
        alt_administrador.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem CrearPelicula;
    private javax.swing.JCheckBoxMenuItem CrearSala;
    private javax.swing.JCheckBoxMenuItem CrearSesion;
    private javax.swing.JCheckBoxMenuItem EliminarPelicula;
    private javax.swing.JCheckBoxMenuItem EliminarSala;
    private javax.swing.JCheckBoxMenuItem EliminarSesion;
    private javax.swing.JCheckBoxMenuItem ModificarPelicula;
    private javax.swing.JCheckBoxMenuItem ModificarSala;
    private javax.swing.JCheckBoxMenuItem ModificarSesion;
    private javax.swing.JMenu Pelicula;
    private javax.swing.JMenu Sala;
    private javax.swing.JMenu Sesion;
    private javax.swing.JTextField clientePassword;
    private javax.swing.JTextField clienteUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
