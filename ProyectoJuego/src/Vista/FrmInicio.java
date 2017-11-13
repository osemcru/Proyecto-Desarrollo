/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlAdministrador;
import Controlador.CtlUsuario;
import Modelo.Administrador;
import Modelo.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Krull
 */
public class FrmInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrmInicio
     */
    CtlAdministrador ctlAdmin;
    CtlUsuario ctlUser;

    public FrmInicio() {
        initComponents();
        setLocationRelativeTo(this);
        ctlAdmin = new CtlAdministrador();
        ctlUser = new CtlUsuario();
        jLOjos.setVisible(false);
        jLOjos1.setVisible(false);
        jLOjos2.setVisible(false);
        jLOjos3.setVisible(false);
        setResizable(false);

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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLOjos3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLOjos2 = new javax.swing.JLabel();
        jLBotonInicio = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLOjos1 = new javax.swing.JLabel();
        jLOjos = new javax.swing.JLabel();
        jLBotonRegistrar = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eam3.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLOjos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo4.jpg"))); // NOI18N
        getContentPane().add(jLOjos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Orator Std", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLOjos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo3.jpg"))); // NOI18N
        getContentPane().add(jLOjos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLBotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BInicio.png"))); // NOI18N
        jLBotonInicio.setName(""); // NOI18N
        jLBotonInicio.setPreferredSize(new java.awt.Dimension(200, 100));
        jLBotonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBotonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBotonInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLBotonInicioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLBotonInicioMouseReleased(evt);
            }
        });
        getContentPane().add(jLBotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 140, 50));

        tfUsuario.setBackground(new java.awt.Color(0, 0, 0));
        tfUsuario.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255), 2));
        tfUsuario.setCaretColor(new java.awt.Color(51, 255, 255));
        tfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfUsuarioMouseEntered(evt);
            }
        });
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 200, -1));

        jLabel2.setFont(new java.awt.Font("Orator Std", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Nickname");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLOjos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo2.jpg"))); // NOI18N
        getContentPane().add(jLOjos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLOjos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.jpg"))); // NOI18N
        getContentPane().add(jLOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BResgistrar.png"))); // NOI18N
        jLBotonRegistrar.setName(""); // NOI18N
        jLBotonRegistrar.setPreferredSize(new java.awt.Dimension(200, 100));
        jLBotonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBotonRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBotonRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBotonRegistrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLBotonRegistrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLBotonRegistrarMouseReleased(evt);
            }
        });
        getContentPane().add(jLBotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 240, 50));

        tfPassword.setBackground(new java.awt.Color(0, 0, 0));
        tfPassword.setFont(new java.awt.Font("Monotype Corsiva", 0, 22)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(255, 255, 255));
        tfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255), 2));
        tfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfPasswordMouseEntered(evt);
            }
        });
        tfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 200, -1));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 4, 490, 550));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLBotonInicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonInicioMouseReleased
        jLBotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BInicio.png")));
        jLOjos3.setVisible(true);

        try {
            String nickname = tfUsuario.getText();
            String clave = tfPassword.getText();

            Usuario usuario = ctlUser.SolicitudIniciarSesion(nickname, clave);
            Administrador administrador = ctlAdmin.SolicitudIniciarSesion(nickname, clave);

            if (usuario != null) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + usuario.getNombre() + "!");
                new FrmUsuario(usuario).setVisible(true);
                this.dispose();
            } else if (administrador != null) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + administrador.getNombre());
                new FrmAdministrador(administrador).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "NickName o clave incorrecta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un fallo");
        }


    }//GEN-LAST:event_jLBotonInicioMouseReleased

    private void jLBotonInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonInicioMousePressed

        jLBotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BInicioPres.png")));
    }//GEN-LAST:event_jLBotonInicioMousePressed

    private void jLBotonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonInicioMouseEntered
        jLBotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BInicioSobre.png")));
        jLOjos3.setVisible(true);

    }//GEN-LAST:event_jLBotonInicioMouseEntered

    private void jLBotonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonInicioMouseExited
        jLBotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BInicio.png")));

    }//GEN-LAST:event_jLBotonInicioMouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLOjos.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void tfUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsuarioMouseEntered
        jLOjos1.setVisible(true);
    }//GEN-LAST:event_tfUsuarioMouseEntered

    private void tfPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordMouseEntered
        jLOjos2.setVisible(true);
    }//GEN-LAST:event_tfPasswordMouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLOjos.setVisible(false);
        jLOjos1.setVisible(false);
        jLOjos2.setVisible(false);
        jLOjos3.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLBotonRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonRegistrarMouseEntered
        jLBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BResgistrarSobre.png")));
        jLOjos3.setVisible(true);
    }//GEN-LAST:event_jLBotonRegistrarMouseEntered

    private void jLBotonRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonRegistrarMouseExited
        jLBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BResgistrar.png")));
    }//GEN-LAST:event_jLBotonRegistrarMouseExited

    private void jLBotonRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonRegistrarMousePressed
        jLBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BRegistrarPres.png")));
    }//GEN-LAST:event_jLBotonRegistrarMousePressed

    private void jLBotonRegistrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonRegistrarMouseReleased
        jLBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BResgistrar.png")));
        new FrmRegistrarUsuario().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLBotonRegistrarMouseReleased

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void jLBotonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonRegistrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLBotonRegistrarMouseClicked

    private void tfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jLBotonInicioMouseReleased(null);
        }
    }//GEN-LAST:event_tfUsuarioKeyTyped

    private void tfPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPasswordKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jLBotonInicioMouseReleased(null);
        }
    }//GEN-LAST:event_tfPasswordKeyTyped

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
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBotonInicio;
    private javax.swing.JLabel jLBotonRegistrar;
    private javax.swing.JLabel jLOjos;
    private javax.swing.JLabel jLOjos1;
    private javax.swing.JLabel jLOjos2;
    private javax.swing.JLabel jLOjos3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
