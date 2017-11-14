/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlUsuario;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Cruz
 */
public class FrmInicioJuego extends javax.swing.JFrame {

     public Clip clip;
    public String ruta = "/Sonidos/";
    Thread t;
    
    public FrmInicioJuego() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        
    }
    private int rep=0;

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
        ChbB = new javax.swing.JCheckBox();
        ChbC = new javax.swing.JCheckBox();
        ChbD = new javax.swing.JCheckBox();
        tfPregunta = new javax.swing.JTextField();
        tfA1 = new javax.swing.JTextField();
        tfA2 = new javax.swing.JTextField();
        tfA3 = new javax.swing.JTextField();
        tfA4 = new javax.swing.JTextField();
        jbSiguiente = new javax.swing.JButton();
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
        jLabel10.setText("Categoria");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 30));

        LbCategoria.setBackground(new java.awt.Color(0, 0, 0));
        LbCategoria.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        LbCategoria.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(LbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 220, -1));

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

        ChbB.setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().add(ChbB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        ChbC.setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().add(ChbC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 20, 20));

        ChbD.setBackground(new java.awt.Color(0, 153, 255));
        ChbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbDActionPerformed(evt);
            }
        });
        getContentPane().add(ChbD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        tfPregunta.setBackground(new java.awt.Color(0, 0, 0));
        tfPregunta.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        tfPregunta.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(tfPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 620, -1));

        tfA1.setBackground(new java.awt.Color(0, 0, 0));
        tfA1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        tfA1.setForeground(new java.awt.Color(255, 255, 255));
        tfA1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfA1.setCaretColor(new java.awt.Color(51, 255, 255));
        tfA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfA1MouseEntered(evt);
            }
        });
        tfA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfA1ActionPerformed(evt);
            }
        });
        getContentPane().add(tfA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 450, -1));

        tfA2.setBackground(new java.awt.Color(0, 0, 0));
        tfA2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        tfA2.setForeground(new java.awt.Color(255, 255, 255));
        tfA2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfA2.setCaretColor(new java.awt.Color(51, 255, 255));
        tfA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfA2MouseEntered(evt);
            }
        });
        tfA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfA2ActionPerformed(evt);
            }
        });
        getContentPane().add(tfA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 450, -1));

        tfA3.setBackground(new java.awt.Color(0, 0, 0));
        tfA3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        tfA3.setForeground(new java.awt.Color(255, 255, 255));
        tfA3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfA3.setCaretColor(new java.awt.Color(51, 255, 255));
        tfA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfA3MouseEntered(evt);
            }
        });
        tfA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfA3ActionPerformed(evt);
            }
        });
        getContentPane().add(tfA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 450, -1));

        tfA4.setBackground(new java.awt.Color(0, 0, 0));
        tfA4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        tfA4.setForeground(new java.awt.Color(255, 255, 255));
        tfA4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfA4.setCaretColor(new java.awt.Color(51, 255, 255));
        tfA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfA4MouseEntered(evt);
            }
        });
        tfA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfA4ActionPerformed(evt);
            }
        });
        getContentPane().add(tfA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 450, -1));

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
    
    private void LbCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCategoriaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCategoriaMouseEntered

    private void LbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LbCategoriaActionPerformed

    private void ChbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChbDActionPerformed

    private void ChbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChbAActionPerformed

    private void tfPreguntaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPreguntaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPreguntaMouseEntered

    private void tfPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPreguntaActionPerformed

    private void tfA1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfA1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfA1MouseEntered

    private void tfA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfA1ActionPerformed

    private void tfA2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfA2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfA2MouseEntered

    private void tfA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfA2ActionPerformed

    private void tfA3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfA3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfA3MouseEntered

    private void tfA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfA3ActionPerformed

    private void tfA4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfA4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tfA4MouseEntered

    private void tfA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfA4ActionPerformed

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
   
        new FrmInicioJuego().setVisible(true);
        this.dispose();

        
       
       
        
    }//GEN-LAST:event_jbSiguienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String [] Aleatorio = new String[2];
        Aleatorio[0] = "musica de duda";
        Aleatorio[1] = "Ambler";
      int numRam = (int) (Math.random()*2);
        
        sonido(Aleatorio[numRam]);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        clip.stop();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChbA;
    private javax.swing.JCheckBox ChbB;
    private javax.swing.JCheckBox ChbC;
    private javax.swing.JCheckBox ChbD;
    private javax.swing.JTextField LbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JTextField tfA1;
    private javax.swing.JTextField tfA2;
    private javax.swing.JTextField tfA3;
    private javax.swing.JTextField tfA4;
    private javax.swing.JTextField tfPregunta;
    // End of variables declaration//GEN-END:variables
}
