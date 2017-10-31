/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlUsuario;
import Modelo.Administrador;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class FrmGestionAdmin extends javax.swing.JFrame {

    CtlUsuario ctlUsu;
    Administrador administrador;

    /**
     * Creates new form FrmGestionUsuarios
     */
    public FrmGestionAdmin(Administrador admin) {
        initComponents();
        setLocationRelativeTo(this);
        ctlUsu = new CtlUsuario();
        administrador = admin;
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabUsuario = new javax.swing.JTable();
        btnBuscarUsuario = new javax.swing.JButton();
        btnRegistrarUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NickName", "Clave", "Codigo", "Nombres", "Apellidos", "Correo", "Semestre"
            }
        ));
        jScrollPane1.setViewportView(jTabUsuario);
        if (jTabUsuario.getColumnModel().getColumnCount() > 0) {
            jTabUsuario.getColumnModel().getColumn(6).setHeaderValue("Semestre");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 680, 190));

        btnBuscarUsuario.setBackground(new java.awt.Color(0, 51, 51));
        btnBuscarUsuario.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        btnBuscarUsuario.setForeground(new java.awt.Color(204, 255, 255));
        btnBuscarUsuario.setText("Buscar,Modificar o Eliminar");
        btnBuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBuscarUsuarioMouseReleased(evt);
            }
        });
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        btnRegistrarUsuario.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistrarUsuario.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(204, 255, 255));
        btnRegistrarUsuario.setText("Registrar");
        btnRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseReleased(evt);
            }
        });
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Lista de Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Gestion de Usuarios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jbAtras.setBackground(new java.awt.Color(0, 51, 51));
        jbAtras.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jbAtras.setForeground(new java.awt.Color(204, 255, 255));
        jbAtras.setText("Atras");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        // TODO add your handling code here:
        new FrmAdministrador(administrador).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        // TODO add your handling code here:
        new FrmGuardarUsuario(administrador).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnRegistrarUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseReleased

    }//GEN-LAST:event_btnRegistrarUsuarioMouseReleased

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        // TODO add your handling code here:
        new FrmEditarUsuario(administrador).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnBuscarUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarUsuarioMouseReleased

    private void listar(){
        jTabUsuario.setModel(ctlUsu.solicitudListar());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabUsuario;
    private javax.swing.JButton jbAtras;
    // End of variables declaration//GEN-END:variables
}
