/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.CineException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import modelo.*;

/**
 *
 * @author USUARIO
 */
public class CrearReserva extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form CrearReserva
     */
    Pelicula pelicula = null;
    Sesion sesionActiva=null;
    JButton[][] b;
    int numClicks = 0;

    public CrearReserva() {
        initComponents();

    }
    //el metodo visualizar se llama desde la pantalla vista.listPeliculas
    public void visualizar(Pelicula peli) {
        this.pelicula = peli;
        this.tituloPeli.setText(this.pelicula.getTitutlo());
        this.minutos.setText(Integer.toString(this.pelicula.getMinutos()));
        this.argumento.setText(this.pelicula.getArgumento());
        cargarComboSesiones();

    }

    private void cargarComboSesiones() {
        this.sesiones.removeAllItems();

        if (this.pelicula.sesiones.size() == 0) {
            this.sesiones.addItem("");
        } else {
            for (int i = 0; i < this.pelicula.sesiones.size(); i++) {
                this.sesiones.addItem(this.pelicula.sesiones.get(i).getNombre());
            }
        }
    }
    /*
    *Este metodo recorre la matriz b y genera un boton por cada uno,
    *le da un color segun su Disponibilidad y
    *genera el listener y lo añade al panel correspondiente
    */
    public void cargarAsientos() {
        int f = this.sesionActiva.sala.getFilas();
        int tf = this.sesionActiva.sala.getTamFila();
        int iAux,jAux;
        this.panelAsientos.removeAll();
        this.panelAsientos.setLayout(new java.awt.GridLayout(f, tf));
        this.b = new JButton[f][tf];
        int cont = 0;
        for (int i = 0; i < this.b.length; i++) {
            for (int j = 0; j < this.b[i].length; j++) {
                iAux=i+1;
                jAux=j+1;
                b[i][j] = new JButton(iAux+ "-" + jAux);
                if (this.sesionActiva.asientos.get(cont).getDispo().equals(Disponibilidad.LIBRE)) 
                    b[i][j].setBackground(Color.GREEN);
                else
                    b[i][j].setBackground(Color.RED);
                
                b[i][j].addActionListener(this);
                this.panelAsientos.add(b[i][j]);
                cont++;
            }
        }
        this.panelAsientos.updateUI();
    }
    public void deReservadosAOcupados(){
        for( Asiento a : this.sesionActiva.asientos ){
            if(a.getDispo().equals(Disponibilidad.RESERVADO))
                a.setDispo(Disponibilidad.OCUPADO);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sesiones = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        argumento = new javax.swing.JEditorPane();
        botonReservar = new javax.swing.JButton();
        minutos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tituloPeli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        panelAsientos = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Reservar");

        sesiones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pelicula");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sesion");

        argumento.setEditable(false);
        jScrollPane1.setViewportView(argumento);

        botonReservar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonReservar.setText("Reservar");
        botonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservarActionPerformed(evt);
            }
        });

        minutos.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Minutos");

        tituloPeli.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Argumento");

        panelAsientos.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tituloPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonReservar)))))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tituloPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sesiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(botonReservar)))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(panelAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //al seleccionar la sesion se generan los asientos
    private void sesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionesActionPerformed
        Sesion sesion = null;
        if (this.sesiones.getSelectedIndex() != -1) {
            this.sesionActiva = this.pelicula.buscarSesion(this.sesiones.getSelectedItem().toString());
            if (this.sesionActiva != null) {
                cargarAsientos();
            }

        }
    }//GEN-LAST:event_sesionesActionPerformed

    private void botonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarActionPerformed
        deReservadosAOcupados();
        cargarAsientos();


    }//GEN-LAST:event_botonReservarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane argumento;
    private javax.swing.JButton botonReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField minutos;
    private javax.swing.JPanel panelAsientos;
    private javax.swing.JComboBox sesiones;
    private javax.swing.JTextField tituloPeli;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        numClicks++;
        String[] textoBotonPulsado=e.getActionCommand().split("-");//necesitamos el texto del boton pulsado para poder trabajar con ese asiento
        int fila=Integer.parseInt(textoBotonPulsado[0]);
        int columna=Integer.parseInt(textoBotonPulsado[1]);
        fila--;//a la inversa e cuando metimos el texto que le sumamos 1 para eliminar el 0
        columna--;
        //reservamos
        try {
            this.sesionActiva.crearReserva(fila, columna);
            b[fila][columna].setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Asiento reservado: "+e.getActionCommand());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        ;
        
        
    }
}
