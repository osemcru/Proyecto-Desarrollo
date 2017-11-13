/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Usuario;

/**
 *
 * @author Cristian Cruz
 */
public class FrmUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    Usuario usuario;

    public FrmUsuario(Usuario user) {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        usuario = user;
        tfUsuario.setEditable(false);
        tfUsuario.setText(user.getNombre() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jbAtras = new javax.swing.JButton();
        tfUsuario = new javax.swing.JTextField();
        jbMostrarHistorial = new javax.swing.JButton();
        jbMostrarJuegos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Orator Std", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("Bienvenido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 50));

        jbAtras.setBackground(new java.awt.Color(0, 51, 51));
        jbAtras.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jbAtras.setForeground(new java.awt.Color(255, 255, 255));
        jbAtras.setText("Atras");
        jbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbAtrasMouseReleased(evt);
            }
        });
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        tfUsuario.setBackground(new java.awt.Color(0, 0, 0));
        tfUsuario.setFont(new java.awt.Font("Orator Std", 1, 36)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(204, 255, 255));
        tfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255), 2));
        tfUsuario.setCaretColor(new java.awt.Color(51, 255, 255));
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 340, -1));

        jbMostrarHistorial.setBackground(new java.awt.Color(0, 51, 51));
        jbMostrarHistorial.setFont(new java.awt.Font("Monotype Corsiva", 3, 30)); // NOI18N
        jbMostrarHistorial.setForeground(new java.awt.Color(204, 255, 255));
        jbMostrarHistorial.setText("MostarHistorial");
        jbMostrarHistorial.setActionCommand("Iniciar Juego");
        jbMostrarHistorial.setAlignmentY(0.1F);
        jbMostrarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(jbMostrarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jbMostrarJuegos.setBackground(new java.awt.Color(0, 51, 51));
        jbMostrarJuegos.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jbMostrarJuegos.setForeground(new java.awt.Color(204, 255, 255));
        jbMostrarJuegos.setText("Iniciar Juego");
        jbMostrarJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarJuegosActionPerformed(evt);
            }
        });
        getContentPane().add(jbMostrarJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtrasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAtrasMouseReleased

        new FrmInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbAtrasMouseReleased

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
//     new FrmGestionCategorias(administrador).setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void jbMostrarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarHistorialActionPerformed
 //        try {
        //            String nickname = txtNickName.getText();
        //            String clave = txtClave.getText();
        //            String nombre = txtNombre.getText();
        //            String apellido = txtApellido.getText();
        //            int codigo = Integer.p  arseInt(txtCodigo.getText());
        //            String correo = txtCorreo.getText();
        //            int semestre = Integer.parseInt(txtSemestre.getText());
        //
        //            if (controlador.SolicitudGuardar(nickname, clave, codigo, nombre, apellido, correo, semestre, 2)) {
        //                JOptionPane.showMessageDialog(this, "Guardado exitosamente");
        //            } else {
        //                JOptionPane.showMessageDialog(this, "Error al guardar");
        //            }
        //        } catch (Exception e) {
        //            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos");
        //        }
    }//GEN-LAST:event_jbMostrarHistorialActionPerformed

    private void jbMostrarJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarJuegosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMostrarJuegosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbMostrarHistorial;
    private javax.swing.JButton jbMostrarJuegos;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
