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
import javax.swing.JOptionPane;

/**
 *
 * @author XgioserX
 */
public class FrmGestionUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestionUsuarios
     */
    CtlUsuario ctlUsuario;
    Administrador administrador;
    
    public FrmGestionUsuarios(Administrador admin) {
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
        jbCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfClave = new javax.swing.JTextField();
        tfNickname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabUsuario = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfCodigoEditar = new javax.swing.JTextField();
        jbBuscarUsuario = new javax.swing.JButton();
        jbEliminarUsuario = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jbRegistrarUsuario1 = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbEditarUsuario1 = new javax.swing.JButton();
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
        getContentPane().add(tfSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 200, -1));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Semestre:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, 20));

        jbCancelar.setBackground(new java.awt.Color(0, 51, 51));
        jbCancelar.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(204, 255, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Correo Electronico:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, 20));

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
        getContentPane().add(tfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 200, -1));

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("Apellidos:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, 20));

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
        getContentPane().add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 200, -1));

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
        getContentPane().add(tfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 200, -1));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText("Nombres:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, 20));

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("Clave:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, 20));

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
        getContentPane().add(tfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 200, -1));

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
        getContentPane().add(tfNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 200, -1));

        jTabUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombres", "Apellidos"
            }
        ));
        jScrollPane1.setViewportView(jTabUsuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 90));

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 255));
        jLabel16.setText("NickName:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, 20));

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText("Codigo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 20));

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
        getContentPane().add(tfCodigoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 200, -1));

        jbBuscarUsuario.setBackground(new java.awt.Color(0, 51, 51));
        jbBuscarUsuario.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jbBuscarUsuario.setForeground(new java.awt.Color(204, 255, 255));
        jbBuscarUsuario.setText("Buscar");
        jbBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 140, 50));

        jbEliminarUsuario.setBackground(new java.awt.Color(0, 51, 51));
        jbEliminarUsuario.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jbEliminarUsuario.setForeground(new java.awt.Color(204, 255, 255));
        jbEliminarUsuario.setText("Eliminar");
        jbEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        jLabel22.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 255, 255));
        jLabel22.setText("Usuarios");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 190, -1));

        jbRegistrarUsuario1.setBackground(new java.awt.Color(0, 51, 51));
        jbRegistrarUsuario1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jbRegistrarUsuario1.setForeground(new java.awt.Color(204, 255, 255));
        jbRegistrarUsuario1.setText("Registrar");
        jbRegistrarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbRegistrarUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

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

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Lista de Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jbEditarUsuario1.setBackground(new java.awt.Color(0, 51, 51));
        jbEditarUsuario1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jbEditarUsuario1.setForeground(new java.awt.Color(204, 255, 255));
        jbEditarUsuario1.setText("Editar");
        jbEditarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditarUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 550));

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

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbCancelarActionPerformed

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
                jbCancelar.setEnabled(true);
                jbEliminarUsuario.setEnabled(true);
                jbCancelar.setVisible(true);
                tfCodigoEditar.setEnabled(false);
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
        new FrmAdministrador(administrador).setVisible(true);
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
        if (!(evt.getKeyChar() >= '1' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
        
        int semestre = Integer.parseInt(tfSemestre.getText());
        
        if (semestre >= 10) {
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

    private void jbRegistrarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarUsuario1ActionPerformed
        
        try {
            String nickname = tfNickname.getText();
            String clave = tfClave.getText();
            String nombres = tfNombres.getText();
            String apellidos = tfApellidos.getText();
            int codigo = Integer.parseInt(tfCodigoEditar.getText());
            String correo = tfCorreo.getText();
            int semestre = Integer.parseInt(tfSemestre.getText());
            int idTipo = 2;
            
            if (ctlUsuario.SolicitudGuardar(nickname, clave, codigo, nombres, apellidos, correo, semestre, idTipo)) {
                JOptionPane.showMessageDialog(this, "Guardado exitosamente");
                new FrmGestionAdmin(administrador).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos");
        }
    }//GEN-LAST:event_jbRegistrarUsuario1ActionPerformed

    private void jbEditarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditarUsuario1ActionPerformed
    
    private void limpiar() {
        tfCodigoEditar.setText("");
        tfNickname.setText("");
        tfClave.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        tfCorreo.setText("");
        tfSemestre.setText("");
        tfCodigoEditar.setEnabled(true);
        jbEliminarUsuario.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbRegistrarUsuario1.setEnabled(true);
        jbCancelar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabUsuario;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbBuscarUsuario;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditarUsuario1;
    private javax.swing.JButton jbEliminarUsuario;
    private javax.swing.JButton jbRegistrarUsuario1;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfClave;
    private javax.swing.JTextField tfCodigoEditar;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfNickname;
    private javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfSemestre;
    // End of variables declaration//GEN-END:variables
}