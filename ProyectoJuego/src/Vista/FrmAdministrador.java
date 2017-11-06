/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Administrador;

/**
 *
 * @author Cristian Cruz
 */
public class FrmAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    Administrador administrador;

    public FrmAdministrador(Administrador admin) {
        initComponents();
        setLocationRelativeTo(this);
        tfUsuario.setEditable(false);
        administrador = admin;
        tfUsuario.setText(admin.getNombre() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnJuegos = new javax.swing.JButton();
        tfUsuario = new javax.swing.JTextField();
        btnPreguntas = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Nickname");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnUsuarios.setBackground(new java.awt.Color(0, 51, 51));
        btnUsuarios.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 0, 0));
        btnUsuarios.setText("Administrar Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        btnJuegos.setBackground(new java.awt.Color(0, 51, 51));
        btnJuegos.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        btnJuegos.setForeground(new java.awt.Color(255, 0, 0));
        btnJuegos.setText("Juegos Creados");
        btnJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegosActionPerformed(evt);
            }
        });
        getContentPane().add(btnJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        tfUsuario.setBackground(new java.awt.Color(0, 0, 0));
        tfUsuario.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(204, 255, 255));
        tfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255), 2));
        tfUsuario.setCaretColor(new java.awt.Color(51, 255, 255));
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 260, -1));

        btnPreguntas.setBackground(new java.awt.Color(0, 51, 51));
        btnPreguntas.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        btnPreguntas.setForeground(new java.awt.Color(255, 0, 0));
        btnPreguntas.setText("Administrar Preguntas y Categorias");
        btnPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreguntasActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jbAtras.setBackground(new java.awt.Color(0, 51, 51));
        jbAtras.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jbAtras.setForeground(new java.awt.Color(255, 0, 0));
        jbAtras.setText("Atras");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        new FrmGestionUsuarios(administrador).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJuegosActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void btnPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreguntasActionPerformed
        // TODO add your handling code here:
        new FrmGestionCategorias(administrador).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPreguntasActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        // TODO add your handling code here:
        new FrmInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJuegos;
    private javax.swing.JButton btnPreguntas;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAtras;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
