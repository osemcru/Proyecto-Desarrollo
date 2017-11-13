/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlCategoria;
import Controlador.CtlPregunta;
import Controlador.CtlSolucion;
import Modelo.Administrador;
import Modelo.Categoria;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class FrmRegistroPregunta extends javax.swing.JFrame {

    CtlCategoria ctlCategoria;
    Administrador administrador;
    CtlPregunta ctlPregunta;
    CtlSolucion ctlSolucion;

    /**
     *
     * Creates new form FrmRegistroPregunta
     */
    public FrmRegistroPregunta(Administrador admin) {
        initComponents();
        administrador = admin;
        ctlCategoria = new CtlCategoria();
        ctlPregunta = new CtlPregunta();
        ctlSolucion = new CtlSolucion();
        ctlPregunta.SolicitudCargarInformacion(cbCategoriaPregunta);
        limpiar();
        listar();
        setLocationRelativeTo(this);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TblPreguntas = new javax.swing.JTable();
        cbTipoPregunta = new javax.swing.JComboBox<>();
        cbCategoriaPregunta = new javax.swing.JComboBox<>();
        ChbA = new javax.swing.JCheckBox();
        ChbB = new javax.swing.JCheckBox();
        ChbC = new javax.swing.JCheckBox();
        ChbD = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jbAtras = new javax.swing.JButton();
        BtnModificarPregunta = new javax.swing.JButton();
        BtnEliminarPregunta = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        BtnBuscarPregunta1 = new javax.swing.JButton();
        BtnRegistrarPregunta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TxtD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtB = new javax.swing.JTextField();
        TxtA = new javax.swing.JTextField();
        TxtC = new javax.swing.JTextField();
        TxtPregunta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblPreguntas.setBackground(new java.awt.Color(0, 102, 153));
        TblPreguntas.setFont(new java.awt.Font("Monotype Corsiva", 0, 12)); // NOI18N
        TblPreguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdPregunta", "Descripcion", "idCategoria ", "idExamen"
            }
        ));
        TblPreguntas.setOpaque(false);
        jScrollPane1.setViewportView(TblPreguntas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 460, 130));

        cbTipoPregunta.setBackground(new java.awt.Color(204, 255, 255));
        cbTipoPregunta.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        cbTipoPregunta.setForeground(new java.awt.Color(204, 255, 255));
        cbTipoPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "Unica Respuesta", "Multiple Respuesta" }));
        cbTipoPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoPreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(cbTipoPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 220, -1));

        cbCategoriaPregunta.setBackground(new java.awt.Color(204, 255, 255));
        cbCategoriaPregunta.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        cbCategoriaPregunta.setForeground(new java.awt.Color(204, 255, 255));
        cbCategoriaPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion..." }));
        getContentPane().add(cbCategoriaPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 220, -1));

        ChbA.setBackground(new java.awt.Color(0, 204, 204));
        ChbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbAActionPerformed(evt);
            }
        });
        getContentPane().add(ChbA, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, 20));

        ChbB.setBackground(new java.awt.Color(0, 204, 204));
        ChbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbBActionPerformed(evt);
            }
        });
        getContentPane().add(ChbB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        ChbC.setBackground(new java.awt.Color(0, 204, 204));
        ChbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbCActionPerformed(evt);
            }
        });
        getContentPane().add(ChbC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 20, 20));

        ChbD.setBackground(new java.awt.Color(0, 204, 204));
        ChbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbDActionPerformed(evt);
            }
        });
        getContentPane().add(ChbD, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 65)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preguntas");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 70));

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
        getContentPane().add(jbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        BtnModificarPregunta.setBackground(new java.awt.Color(0, 51, 51));
        BtnModificarPregunta.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        BtnModificarPregunta.setForeground(new java.awt.Color(204, 255, 255));
        BtnModificarPregunta.setText("Modificar Pregunta");
        BtnModificarPregunta.setActionCommand("Iniciar Juego");
        BtnModificarPregunta.setAlignmentY(0.1F);
        BtnModificarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarPreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        BtnEliminarPregunta.setBackground(new java.awt.Color(0, 51, 51));
        BtnEliminarPregunta.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        BtnEliminarPregunta.setForeground(new java.awt.Color(204, 255, 255));
        BtnEliminarPregunta.setText("Eliminar Pregunta");
        BtnEliminarPregunta.setActionCommand("Iniciar Juego");
        BtnEliminarPregunta.setAlignmentY(0.1F);
        BtnEliminarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarPreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, -1));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("C)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 40, -1));

        BtnBuscarPregunta1.setBackground(new java.awt.Color(0, 51, 51));
        BtnBuscarPregunta1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        BtnBuscarPregunta1.setForeground(new java.awt.Color(204, 255, 255));
        BtnBuscarPregunta1.setText("Buscar Pregunta");
        BtnBuscarPregunta1.setActionCommand("Iniciar Juego");
        BtnBuscarPregunta1.setAlignmentY(0.1F);
        BtnBuscarPregunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPregunta1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscarPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 220, -1));

        BtnRegistrarPregunta.setBackground(new java.awt.Color(0, 51, 51));
        BtnRegistrarPregunta.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        BtnRegistrarPregunta.setForeground(new java.awt.Color(204, 255, 255));
        BtnRegistrarPregunta.setText("Registrar Pregunta");
        BtnRegistrarPregunta.setActionCommand("Iniciar Juego");
        BtnRegistrarPregunta.setAlignmentY(0.1F);
        BtnRegistrarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarPreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegistrarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, -1));

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("A)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 30, -1));

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Pregunta:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, -1));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("D)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 40, -1));

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tipo Pregunta:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 150, -1));

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("B)");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 30, -1));

        TxtD.setBackground(new java.awt.Color(0, 0, 0));
        TxtD.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        TxtD.setForeground(new java.awt.Color(255, 255, 255));
        TxtD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        TxtD.setCaretColor(new java.awt.Color(51, 255, 255));
        TxtD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtDMouseEntered(evt);
            }
        });
        TxtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDActionPerformed(evt);
            }
        });
        TxtD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDKeyTyped(evt);
            }
        });
        getContentPane().add(TxtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 340, -1));

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Categoria:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 110, -1));

        TxtB.setBackground(new java.awt.Color(0, 0, 0));
        TxtB.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        TxtB.setForeground(new java.awt.Color(255, 255, 255));
        TxtB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        TxtB.setCaretColor(new java.awt.Color(51, 255, 255));
        TxtB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtBMouseEntered(evt);
            }
        });
        TxtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBActionPerformed(evt);
            }
        });
        TxtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBKeyTyped(evt);
            }
        });
        getContentPane().add(TxtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 340, -1));

        TxtA.setBackground(new java.awt.Color(0, 0, 0));
        TxtA.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        TxtA.setForeground(new java.awt.Color(255, 255, 255));
        TxtA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        TxtA.setCaretColor(new java.awt.Color(51, 255, 255));
        TxtA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtAMouseEntered(evt);
            }
        });
        TxtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAActionPerformed(evt);
            }
        });
        TxtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtAKeyTyped(evt);
            }
        });
        getContentPane().add(TxtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 340, -1));

        TxtC.setBackground(new java.awt.Color(0, 0, 0));
        TxtC.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        TxtC.setForeground(new java.awt.Color(255, 255, 255));
        TxtC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        TxtC.setCaretColor(new java.awt.Color(51, 255, 255));
        TxtC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtCMouseEntered(evt);
            }
        });
        TxtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCActionPerformed(evt);
            }
        });
        TxtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCKeyTyped(evt);
            }
        });
        getContentPane().add(TxtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 340, -1));

        TxtPregunta.setBackground(new java.awt.Color(0, 0, 0));
        TxtPregunta.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        TxtPregunta.setForeground(new java.awt.Color(255, 255, 255));
        TxtPregunta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        TxtPregunta.setCaretColor(new java.awt.Color(51, 255, 255));
        TxtPregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtPreguntaMouseEntered(evt);
            }
        });
        TxtPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPreguntaActionPerformed(evt);
            }
        });
        TxtPregunta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPreguntaKeyTyped(evt);
            }
        });
        getContentPane().add(TxtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 460, -1));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtrasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAtrasMouseReleased
        new FrmAdministrador(administrador).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbAtrasMouseReleased
    private void BtnModificarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarPreguntaActionPerformed
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
    }//GEN-LAST:event_BtnModificarPreguntaActionPerformed

    private void BtnBuscarPregunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarPregunta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarPregunta1ActionPerformed

    private void BtnEliminarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminarPreguntaActionPerformed

    private void BtnRegistrarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarPreguntaActionPerformed
        // TODO add your handling code here:
        if (TxtPregunta.getText().isEmpty() || TxtA.getText().isEmpty() || TxtB.getText().isEmpty()
                || TxtC.getText().isEmpty() || TxtD.getText().isEmpty() || cbCategoriaPregunta.getSelectedIndex() == 0
                || cbTipoPregunta.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {

            Categoria categoria = ctlCategoria.SolicitudBuscarUno((String) cbCategoriaPregunta.getSelectedItem());
            System.out.println(categoria.getIdCategoria());
            int idCategoria = categoria.getIdCategoria();
            int tipoPregunta = cbTipoPregunta.getSelectedIndex();
            String descripcion = TxtPregunta.getText();
            int idPregunta = ctlPregunta.SolicitudUltimaIDPregunta();

            if (ctlPregunta.SolicitudGuardar(idPregunta + 1, descripcion, idCategoria, tipoPregunta)) {

                idPregunta = ctlPregunta.SolicitudUltimaIDPregunta();

                String nombreA = TxtA.getText();
                int estadoA = (ChbA.isSelected()) ? 1 : 0;

                String nombreB = TxtB.getText();
                int estadoB = (ChbB.isSelected()) ? 1 : 0;

                String nombreC = TxtC.getText();
                int estadoC = (ChbC.isSelected()) ? 1 : 0;

                String nombreD = TxtD.getText();
                int estadoD = (ChbD.isSelected()) ? 1 : 0;

                int idSolucion = ctlSolucion.SolicitudUltimaIDSolucion();

                if (ctlSolucion.SolicitudGuardar(idSolucion + 1, nombreA, estadoA, idPregunta)
                        && ctlSolucion.SolicitudGuardar(idSolucion + 2, nombreB, estadoB, idPregunta)
                        && ctlSolucion.SolicitudGuardar(idSolucion + 3, nombreC, estadoC, idPregunta)
                        && ctlSolucion.SolicitudGuardar(idSolucion + 4, nombreD, estadoD, idPregunta)) {

                    JOptionPane.showMessageDialog(this, "Guardado exitosamente");
                    limpiar();
                    listar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar las soluciones");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar la pregunta");
            }
        }
    }//GEN-LAST:event_BtnRegistrarPreguntaActionPerformed

    private void TxtDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDMouseEntered

    private void TxtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDActionPerformed

    private void TxtBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtBMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBMouseEntered

    private void TxtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBActionPerformed

    private void TxtAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtAMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAMouseEntered

    private void TxtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAActionPerformed

    private void TxtCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtCMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCMouseEntered

    private void TxtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCActionPerformed

    private void TxtPreguntaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtPreguntaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPreguntaMouseEntered

    private void TxtPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPreguntaActionPerformed

    private void ChbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbDActionPerformed
        // TODO add your handling code here:
        if (cbTipoPregunta.getSelectedIndex() == 1) {
            ChbB.setSelected(false);
            ChbC.setSelected(false);
            ChbA.setSelected(false);
        }
    }//GEN-LAST:event_ChbDActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        new FrmAdministrador(administrador).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void TxtPreguntaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPreguntaKeyTyped
        // TODO add your handling code here:
        String pregunta = TxtPregunta.getText();

        if (pregunta.length() > 250) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtPreguntaKeyTyped

    private void TxtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAKeyTyped
        // TODO add your handling code here:
        String solucion = TxtA.getText();

        if (solucion.length() > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtAKeyTyped

    private void TxtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBKeyTyped
        // TODO add your handling code here:
        String solucion = TxtB.getText();

        if (solucion.length() > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtBKeyTyped

    private void TxtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCKeyTyped
        // TODO add your handling code here:
        String solucion = TxtC.getText();

        if (solucion.length() > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCKeyTyped

    private void TxtDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDKeyTyped
        // TODO add your handling code here:
        String solucion = TxtD.getText();

        if (solucion.length() > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtDKeyTyped

    private void cbTipoPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoPreguntaActionPerformed
        // TODO add your handling code here:
        if (cbTipoPregunta.getSelectedIndex() == 1 || cbTipoPregunta.getSelectedIndex() == 2) {
            TxtA.setEnabled(true);
            TxtB.setEnabled(true);
            TxtC.setEnabled(true);
            TxtD.setEnabled(true);

            ChbA.setEnabled(true);
            ChbB.setEnabled(true);
            ChbC.setEnabled(true);
            ChbD.setEnabled(true);
        } else if (cbTipoPregunta.getSelectedIndex() == 0) {
            TxtA.setEnabled(false);
            TxtB.setEnabled(false);
            TxtC.setEnabled(false);
            TxtD.setEnabled(false);

            ChbA.setEnabled(false);
            ChbB.setEnabled(false);
            ChbC.setEnabled(false);
            ChbD.setEnabled(false);
        }
    }//GEN-LAST:event_cbTipoPreguntaActionPerformed

    private void ChbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbAActionPerformed
        // TODO add your handling code here:
        if (cbTipoPregunta.getSelectedIndex() == 1) {
            ChbB.setSelected(false);
            ChbC.setSelected(false);
            ChbD.setSelected(false);
        }
    }//GEN-LAST:event_ChbAActionPerformed

    private void ChbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbBActionPerformed
        // TODO add your handling code here:
        if (cbTipoPregunta.getSelectedIndex() == 1) {
            ChbA.setSelected(false);
            ChbC.setSelected(false);
            ChbD.setSelected(false);
        }
    }//GEN-LAST:event_ChbBActionPerformed

    private void ChbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbCActionPerformed
        // TODO add your handling code here:
        if (cbTipoPregunta.getSelectedIndex() == 1) {
            ChbB.setSelected(false);
            ChbA.setSelected(false);
            ChbD.setSelected(false);
        }
    }//GEN-LAST:event_ChbCActionPerformed

    public void limpiar() {
        TxtPregunta.setText("");
        TxtA.setText("");
        TxtB.setText("");
        TxtC.setText("");
        TxtD.setText("");
        TxtA.setEnabled(false);
        TxtB.setEnabled(false);
        TxtC.setEnabled(false);
        TxtD.setEnabled(false);
        cbCategoriaPregunta.setSelectedIndex(0);
        cbTipoPregunta.setSelectedIndex(0);
        ChbA.setSelected(false);
        ChbB.setSelected(false);
        ChbC.setSelected(false);
        ChbD.setSelected(false);
        ChbA.setEnabled(false);
        ChbB.setEnabled(false);
        ChbC.setEnabled(false);
        ChbD.setEnabled(false);
    }

    public void listar() {
        TblPreguntas.setModel(ctlPregunta.SolicitudListar());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarPregunta1;
    private javax.swing.JButton BtnEliminarPregunta;
    private javax.swing.JButton BtnModificarPregunta;
    private javax.swing.JButton BtnRegistrarPregunta;
    private javax.swing.JCheckBox ChbA;
    private javax.swing.JCheckBox ChbB;
    private javax.swing.JCheckBox ChbC;
    private javax.swing.JCheckBox ChbD;
    private javax.swing.JTable TblPreguntas;
    private javax.swing.JTextField TxtA;
    private javax.swing.JTextField TxtB;
    private javax.swing.JTextField TxtC;
    private javax.swing.JTextField TxtD;
    private javax.swing.JTextField TxtPregunta;
    private javax.swing.JComboBox<String> cbCategoriaPregunta;
    private javax.swing.JComboBox<String> cbTipoPregunta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtras;
    // End of variables declaration//GEN-END:variables
}
