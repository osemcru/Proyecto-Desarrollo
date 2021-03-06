/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlCategoria;
import Controlador.CtlExamen;
import Controlador.CtlPregunta;
import Controlador.CtlSolucion;
import Modelo.Categoria;
import Modelo.Examen;
import Modelo.Pregunta;
import Modelo.Solucion;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import Modelo.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Cruz
 */
public class FrmInicioJuego extends javax.swing.JFrame {

    public Clip clip;
    public Clip clip2;
    public String ruta = "/Sonidos/";
    Thread t;

    CtlPregunta ctlPregunta;
    CtlSolucion ctlSolucion;
    CtlCategoria ctlCategoria;
    CtlExamen ctlExamen;
    Usuario usuario;
    Examen examen;
    int ID;
    ArrayList<Integer> listaPreguntas;
    ArrayList<Integer> mostradas;
    int[] correctas;
    int acertadas;
    int numUsuario;

    public FrmInicioJuego(Usuario user, int idExamen, ArrayList<Integer> preguntas) {
        initComponents();
        usuario = user;
        ctlPregunta = new CtlPregunta();
        ctlSolucion = new CtlSolucion();
        ctlCategoria = new CtlCategoria();
        ctlExamen = new CtlExamen();
        ID = idExamen;
        numUsuario = 0;
        listaPreguntas = preguntas;
        correctas = new int[4];
        mostradas = new ArrayList<>();
        acertadas = 0;
        examen = ctlExamen.SolicitudBuscar(idExamen);
        System.out.println("Id examen: " + examen.getIdExamen());
        System.out.println("participantes: " + examen.getParticipantes());
        setLocationRelativeTo(this);
        setResizable(false);
        LbCategoria.setEnabled(false);
        LbTipoPregunta.setEnabled(false);
        tfPregunta.setEnabled(false);
        tfA.setEnabled(false);
        tfB.setEnabled(false);
        tfC.setEnabled(false);
        tfD.setEnabled(false);
    }
    private int rep = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        LbCategoria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ChbA = new javax.swing.JCheckBox();
        ChbC = new javax.swing.JCheckBox();
        ChbD = new javax.swing.JCheckBox();
        tfPregunta = new javax.swing.JTextField();
        tfD = new javax.swing.JTextField();
        tfC = new javax.swing.JTextField();
        tfB = new javax.swing.JTextField();
        tfA = new javax.swing.JTextField();
        jbSiguiente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        LbTipoPregunta = new javax.swing.JTextField();
        ChbB = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de pregunta");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        LbCategoria.setBackground(new java.awt.Color(204, 255, 255));
        LbCategoria.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        LbCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LbCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        LbCategoria.setCaretColor(new java.awt.Color(51, 255, 255));
        LbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbCategoriaMouseEntered(evt);
            }
        });
        LbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LbCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(LbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 300, -1));

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("A)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 40, -1));

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("B)");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 40, -1));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("C)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 40, -1));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("D)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 40, -1));

        ChbA.setBackground(new java.awt.Color(0, 153, 255));
        ChbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbAActionPerformed(evt);
            }
        });
        getContentPane().add(ChbA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, 20));

        ChbC.setBackground(new java.awt.Color(0, 153, 255));
        ChbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbCActionPerformed(evt);
            }
        });
        getContentPane().add(ChbC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 20, 20));

        ChbD.setBackground(new java.awt.Color(0, 153, 255));
        ChbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbDActionPerformed(evt);
            }
        });
        getContentPane().add(ChbD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        tfPregunta.setBackground(new java.awt.Color(204, 255, 255));
        tfPregunta.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        tfPregunta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPregunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfPregunta.setCaretColor(new java.awt.Color(51, 255, 255));
        tfPregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfPreguntaMouseEntered(evt);
            }
        });
        tfPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(tfPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 710, -1));

        tfD.setBackground(new java.awt.Color(204, 255, 255));
        tfD.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        tfD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfD.setCaretColor(new java.awt.Color(51, 255, 255));
        tfD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfDMouseEntered(evt);
            }
        });
        tfD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDActionPerformed(evt);
            }
        });
        getContentPane().add(tfD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 450, -1));

        tfC.setBackground(new java.awt.Color(204, 255, 255));
        tfC.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        tfC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfC.setCaretColor(new java.awt.Color(51, 255, 255));
        tfC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfCMouseEntered(evt);
            }
        });
        tfC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCActionPerformed(evt);
            }
        });
        getContentPane().add(tfC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 450, -1));

        tfB.setBackground(new java.awt.Color(204, 255, 255));
        tfB.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        tfB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfB.setCaretColor(new java.awt.Color(51, 255, 255));
        tfB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfBMouseEntered(evt);
            }
        });
        tfB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBActionPerformed(evt);
            }
        });
        getContentPane().add(tfB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 450, -1));

        tfA.setBackground(new java.awt.Color(204, 255, 255));
        tfA.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        tfA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfA.setCaretColor(new java.awt.Color(51, 255, 255));
        tfA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfAMouseEntered(evt);
            }
        });
        tfA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAActionPerformed(evt);
            }
        });
        getContentPane().add(tfA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 450, -1));

        jbSiguiente.setBackground(new java.awt.Color(0, 51, 51));
        jbSiguiente.setFont(new java.awt.Font("Monotype Corsiva", 3, 30)); // NOI18N
        jbSiguiente.setForeground(new java.awt.Color(204, 255, 255));
        jbSiguiente.setText("Siguiente");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jbSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, -1));

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Categoria");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 30));

        LbTipoPregunta.setBackground(new java.awt.Color(204, 255, 255));
        LbTipoPregunta.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        LbTipoPregunta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LbTipoPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 2));
        LbTipoPregunta.setCaretColor(new java.awt.Color(51, 255, 255));
        LbTipoPregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbTipoPreguntaMouseEntered(evt);
            }
        });
        LbTipoPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LbTipoPreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(LbTipoPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 220, -1));

        ChbB.setBackground(new java.awt.Color(0, 153, 255));
        ChbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbBActionPerformed(evt);
            }
        });
        getContentPane().add(ChbB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Juego.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void sonido(String archivo) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.loop(clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {

        }

    }

    public void sonido2(String archivo) {

        try {
            clip2 = AudioSystem.getClip();
            clip2.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip2.start();

        } catch (Exception e) {

        }

    }

    private void LbCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCategoriaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCategoriaMouseEntered

    private void LbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCategoriaActionPerformed

    private void ChbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbDActionPerformed
        // TODO add your handling code here:
        sonido2("Deslizar");
        if (LbTipoPregunta.getText().equals("Unica Respuesta")) {
            ChbB.setSelected(false);
            ChbC.setSelected(false);
            ChbA.setSelected(false);
        }

    }//GEN-LAST:event_ChbDActionPerformed

    private void ChbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbAActionPerformed
        // TODO add your handling code here:
        sonido2("Deslizar");
        if (LbTipoPregunta.getText().equals("Unica Respuesta")) {
            ChbB.setSelected(false);
            ChbC.setSelected(false);
            ChbD.setSelected(false);
        }

    }//GEN-LAST:event_ChbAActionPerformed

    private void tfPreguntaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPreguntaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPreguntaMouseEntered

    private void tfPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPreguntaActionPerformed

    private void tfDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDMouseEntered

    private void tfDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDActionPerformed

    private void tfCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCMouseEntered

    private void tfCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCActionPerformed

    private void tfBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBMouseEntered

    private void tfBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBActionPerformed

    private void tfAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfAMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAMouseEntered

    private void tfAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        int cont = 0;
        for (int i = 0; i < correctas.length; i++) {
            if (correctas[i] == 1) {
                cont++;
            }
        }

        int respondidas = 0;
        if (ChbA.isSelected() && correctas[0] == 1) {
            respondidas++;
        }
        if (ChbB.isSelected() && correctas[1] == 1) {
            respondidas++;
        }
        if (ChbC.isSelected() && correctas[2] == 1) {
            respondidas++;
        }
        if (ChbD.isSelected() && correctas[3] == 1) {
            respondidas++;
        }

        if (respondidas == cont) {
            acertadas++;
        }
        rep++;

        if (rep == 9) {
            numUsuario++;

            JOptionPane.showMessageDialog(this, "Se acerto " + acertadas + " de 10");
            System.out.println(examen.getParticipantes());
            if (numUsuario == examen.getParticipantes()) {
                new FrmJuegoPuntuacion().setVisible(true);
                this.dispose();
            } else {
                new FrmSesionJuego(examen, listaPreguntas).setVisible(true);
                this.dispose();
            }

        } else {
            limpiarChb();
            cargarPregunta();
        }

    }//GEN-LAST:event_jbSiguienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String[] Aleatorio = new String[2];
        Aleatorio[0] = "musica de duda";
        Aleatorio[1] = "Ambler";
        int numRam = (int) (Math.random() * 2);

        sonido(Aleatorio[numRam]);

        cargarPregunta();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        clip.stop();
        clip2.stop();
    }//GEN-LAST:event_formWindowClosed

    private void LbTipoPreguntaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbTipoPreguntaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbTipoPreguntaMouseEntered

    private void LbTipoPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LbTipoPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LbTipoPreguntaActionPerformed

    private void ChbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbCActionPerformed
        // TODO add your handling code here:
        if (LbTipoPregunta.getText().equals("Unica Respuesta")) {
            ChbB.setSelected(false);
            ChbA.setSelected(false);
            ChbD.setSelected(false);
        }
        sonido2("Deslizar");
    }//GEN-LAST:event_ChbCActionPerformed

    private void ChbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbBActionPerformed
        // TODO add your handling code here:

        if (LbTipoPregunta.getText().equals("Unica Respuesta")) {
            ChbC.setSelected(false);
            ChbA.setSelected(false);
            ChbD.setSelected(false);
        }
        sonido2("Deslizar");
    }//GEN-LAST:event_ChbBActionPerformed

    private void cargarPregunta() {

        int escoger;
        Pregunta pregunta;
        boolean existente;
        for (int i = 0; i < listaPreguntas.size(); i++) {
            existente = false;
            escoger = listaPreguntas.get((int) (Math.random() * 9));
            for (int j = 0; j < mostradas.size(); j++) {
                if (escoger == mostradas.get(j)) {
                    existente = true;
                }
            }
            if (existente) {
                i--;
            } else {
                mostradas.add(escoger);
                pregunta = ctlPregunta.SolicitudBuscar(escoger);

                tfPregunta.setText(pregunta.getDescripcion());
                if (pregunta.getTipoPregunta() == 1) {
                    LbTipoPregunta.setText("Unica Respuesta");
                } else if (pregunta.getTipoPregunta() == 2) {
                    LbTipoPregunta.setText("Multiple Respuesta");
                }
                Categoria categoria = ctlCategoria.SolicitudBuscarUnoPorID(pregunta.getCategoria());
                LbCategoria.setText(categoria.getNombre());

                Solucion solucion;
                int contador = 1;

                solucion = ctlSolucion.SolicitudBuscar(pregunta.getIdPregunta(), contador);
                correctas[0] = solucion.getEstado();

                tfA.setText(solucion.getNombre());

                contador++;

                solucion = ctlSolucion.SolicitudBuscar(pregunta.getIdPregunta(), contador);
                correctas[1] = solucion.getEstado();

                tfB.setText(solucion.getNombre());

                contador++;

                solucion = ctlSolucion.SolicitudBuscar(pregunta.getIdPregunta(), contador);
                correctas[2] = solucion.getEstado();

                tfC.setText(solucion.getNombre());

                contador++;

                solucion = ctlSolucion.SolicitudBuscar(pregunta.getIdPregunta(), contador);
                correctas[3] = solucion.getEstado();

                tfD.setText(solucion.getNombre());
                break;
            }
        }

    }

    private void limpiarChb() {
        ChbA.setSelected(false);
        ChbB.setSelected(false);
        ChbC.setSelected(false);
        ChbD.setSelected(false);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChbA;
    private javax.swing.JCheckBox ChbB;
    private javax.swing.JCheckBox ChbC;
    private javax.swing.JCheckBox ChbD;
    private javax.swing.JTextField LbCategoria;
    private javax.swing.JTextField LbTipoPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JTextField tfA;
    private javax.swing.JTextField tfB;
    private javax.swing.JTextField tfC;
    private javax.swing.JTextField tfD;
    private javax.swing.JTextField tfPregunta;
    // End of variables declaration//GEN-END:variables
}
