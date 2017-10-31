/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlUsuario;
import Modelo.Administrador;
import Modelo.Usuario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author XgioserX
 */
public class FrmEditarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmEditarUsuario
     */
    CtlUsuario ctlUsuario;
    Administrador administrador;

    public FrmEditarUsuario(Administrador admin) {
        initComponents();
        setLocationRelativeTo(this);
        administrador = admin;
        ctlUsuario = new CtlUsuario();
        limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfSemestre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbEditarUsuario = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfClave = new javax.swing.JTextField();
        tfNickname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfCodigoEditar = new javax.swing.JTextField();
        jbBuscarUsuario = new javax.swing.JButton();
        jbEliminarUsuario = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jbAtras = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfSemestre.setBackground(new java.awt.Color(0, 0, 0));
        tfSemestre.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfSemestre.setForeground(new java.awt.Color(255, 255, 255));
        tfSemestre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSemestre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        tfSemestre.setCaretColor(new java.awt.Color(51, 255, 255));
        tfSemestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfSemestreMouseEntered(evt);
            }
        });
        tfSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSemestreActionPerformed(evt);
            }
        });
        tfSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSemestreKeyTyped(evt);
            }
        });
        getContentPane().add(tfSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 200, -1));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Semestre:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, 20));

        jbEditarUsuario.setBackground(new java.awt.Color(0, 51, 51));
        jbEditarUsuario.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jbEditarUsuario.setForeground(new java.awt.Color(204, 255, 255));
        jbEditarUsuario.setText("Editar");
        jbEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Correo Electronico:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, 20));

        tfCorreo.setBackground(new java.awt.Color(0, 0, 0));
        tfCorreo.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfCorreo.setForeground(new java.awt.Color(255, 255, 255));
        tfCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        tfCorreo.setCaretColor(new java.awt.Color(51, 255, 255));
        tfCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfCorreoMouseEntered(evt);
            }
        });
        tfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(tfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 200, -1));

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("Apellidos:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 20));

        tfApellidos.setBackground(new java.awt.Color(0, 0, 0));
        tfApellidos.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfApellidos.setForeground(new java.awt.Color(255, 255, 255));
        tfApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        tfApellidos.setCaretColor(new java.awt.Color(51, 255, 255));
        tfApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfApellidosMouseEntered(evt);
            }
        });
        tfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidosActionPerformed(evt);
            }
        });
        tfApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidosKeyTyped(evt);
            }
        });
        getContentPane().add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 200, -1));

        tfNombres.setBackground(new java.awt.Color(0, 0, 0));
        tfNombres.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfNombres.setForeground(new java.awt.Color(255, 255, 255));
        tfNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        tfNombres.setCaretColor(new java.awt.Color(51, 255, 255));
        tfNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfNombresMouseEntered(evt);
            }
        });
        tfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombresActionPerformed(evt);
            }
        });
        tfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombresKeyTyped(evt);
            }
        });
        getContentPane().add(tfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 200, -1));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText("Nombres:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, 20));

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("Clave:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, 20));

        tfClave.setBackground(new java.awt.Color(0, 0, 0));
        tfClave.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfClave.setForeground(new java.awt.Color(255, 255, 255));
        tfClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        tfClave.setCaretColor(new java.awt.Color(51, 255, 255));
        tfClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfClaveMouseEntered(evt);
            }
        });
        tfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClaveActionPerformed(evt);
            }
        });
        getContentPane().add(tfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 200, -1));

        tfNickname.setBackground(new java.awt.Color(0, 0, 0));
        tfNickname.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfNickname.setForeground(new java.awt.Color(255, 255, 255));
        tfNickname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNickname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        tfNickname.setCaretColor(new java.awt.Color(51, 255, 255));
        tfNickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfNicknameMouseEntered(evt);
            }
        });
        tfNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNicknameActionPerformed(evt);
            }
        });
        getContentPane().add(tfNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 200, -1));

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 255));
        jLabel16.setText("NickName:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, 20));

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText("Codigo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, 20));

        tfCodigoEditar.setBackground(new java.awt.Color(0, 0, 0));
        tfCodigoEditar.setFont(new java.awt.Font("Orator Std", 1, 24)); // NOI18N
        tfCodigoEditar.setForeground(new java.awt.Color(255, 255, 255));
        tfCodigoEditar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCodigoEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        tfCodigoEditar.setCaretColor(new java.awt.Color(51, 255, 255));
        tfCodigoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfCodigoEditarMouseEntered(evt);
            }
        });
        tfCodigoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoEditarActionPerformed(evt);
            }
        });
        tfCodigoEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoEditarKeyTyped(evt);
            }
        });
        getContentPane().add(tfCodigoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 200, -1));

        jbBuscarUsuario.setBackground(new java.awt.Color(0, 51, 51));
        jbBuscarUsuario.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jbBuscarUsuario.setForeground(new java.awt.Color(204, 255, 255));
        jbBuscarUsuario.setText("Buscar");
        jbBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        jbEliminarUsuario.setBackground(new java.awt.Color(0, 51, 51));
        jbEliminarUsuario.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jbEliminarUsuario.setForeground(new java.awt.Color(204, 255, 255));
        jbEliminarUsuario.setText("Eliminar");
        jbEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 255, 255));
        jLabel18.setText("Actulizar");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 100, -1));

        jLabel20.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 255, 255));
        jLabel20.setText("Buscar");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 70, -1));

        jLabel21.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 255, 255));
        jLabel21.setText("Eliminar");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 90, -1));

        jLabel22.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 255, 255));
        jLabel22.setText("Usuario");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 120, -1));

        jbAtras.setBackground(new java.awt.Color(0, 51, 51));
        jbAtras.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jbAtras.setForeground(new java.awt.Color(204, 255, 255));
        jbAtras.setText("Atras");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSemestreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSemestreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSemestreMouseEntered

    private void tfSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSemestreActionPerformed

    private void jbEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarUsuarioActionPerformed
        try {
            String nickname = tfNickname.getText();
            String clave = tfClave.getText();
            String nombre = tfNombres.getText();
            String apellido = tfApellidos.getText();
            int codigo = Integer.parseInt(tfCodigoEditar.getText());
            String correo = tfCorreo.getText();
            int semestre = Integer.parseInt(tfSemestre.getText());

            if (ctlUsuario.SolicitudModificar(nickname, clave, codigo, nombre, apellido, correo, semestre, 2)) {
                JOptionPane.showMessageDialog(this, "Modificado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos");
        }
    }//GEN-LAST:event_jbEditarUsuarioActionPerformed

    private void tfCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCorreoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreoMouseEntered

    private void tfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreoActionPerformed

    private void tfApellidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfApellidosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosMouseEntered

    private void tfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosActionPerformed

    private void tfNombresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombresMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombresMouseEntered

    private void tfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombresActionPerformed

    private void tfClaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfClaveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClaveMouseEntered

    private void tfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClaveActionPerformed

    private void tfNicknameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNicknameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNicknameMouseEntered

    private void tfNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNicknameActionPerformed

    private void tfCodigoEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoEditarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoEditarMouseEntered

    private void tfCodigoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoEditarActionPerformed

    private void jbBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarUsuarioActionPerformed

        int codigo;
        try {

            codigo = Integer.parseInt(tfCodigoEditar.getText());
            Usuario usuario = ctlUsuario.SolicitudBuscar(codigo);

            if (usuario != null) {
                JOptionPane.showMessageDialog(null, "El usuario ha sido encontrado");
                tfNickname.setText(usuario.getNickname());
                tfClave.setText(usuario.getClave());
                tfNombres.setText(usuario.getNombre());
                tfApellidos.setText(usuario.getApellido());
                tfCorreo.setText(usuario.getCorreo());
                tfSemestre.setText(usuario.getSemestre() + "");
                jbEditarUsuario.setEnabled(true);
                jbEliminarUsuario.setEnabled(true);
                tfCodigoEditar.setEnabled(false);

                tfNickname.setEnabled(true);
                tfClave.setEnabled(true);
                tfNombres.setEnabled(true);
                tfApellidos.setEnabled(true);
                tfCorreo.setEnabled(true);
                tfSemestre.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "La categoria no ha sido encontrada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error al cargar los datos");
            limpiar();
        }
                  }//GEN-LAST:event_jbBuscarUsuarioActionPerformed

    private void jbEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarUsuarioActionPerformed
        // TODO add your handling code here:
        try {
            int codigo = Integer.parseInt(tfCodigoEditar.getText());

            if (ctlUsuario.SolicitudEliminar(codigo)) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente el usuario");
                limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar los datos");
        }

    }//GEN-LAST:event_jbEliminarUsuarioActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        // TODO add your handling code here:
        new FrmGestionAdmin(administrador).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void tfCodigoEditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoEditarKeyTyped
        // TODO add your handling code here:
        if (!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCodigoEditarKeyTyped

    private void tfSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSemestreKeyTyped
        // TODO add your handling code here:
        if (!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_tfSemestreKeyTyped

    private void tfNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombresKeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNombresKeyTyped

    private void tfApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidosKeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_tfApellidosKeyTyped

    private void limpiar() {
        tfCodigoEditar.setText("");
        tfCodigoEditar.setEnabled(true);
        tfNickname.setText("");
        tfNickname.setEnabled(false);
        tfClave.setText("");
        tfClave.setEnabled(false);
        tfNombres.setText("");
        tfNombres.setEnabled(false);
        tfApellidos.setText("");
        tfApellidos.setEnabled(false);
        tfCorreo.setText("");
        tfCorreo.setEnabled(false);
        tfSemestre.setText("");
        tfSemestre.setEnabled(false);
        jbEliminarUsuario.setEnabled(false);
        jbEditarUsuario.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbBuscarUsuario;
    private javax.swing.JButton jbEditarUsuario;
    private javax.swing.JButton jbEliminarUsuario;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfClave;
    private javax.swing.JTextField tfCodigoEditar;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfNickname;
    private javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfSemestre;
    // End of variables declaration//GEN-END:variables
}
