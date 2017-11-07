/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlCategoria;
import DAO.GenericoDAO;
import Modelo.Administrador;

/**
 *
 * @author Julian
 */
public class FrmRegistroPregunta extends javax.swing.JFrame {

    
     GenericoDAO DAOCategoria;
    CtlCategoria ctlCategoria;
    Administrador administrador;
    
    
    
    /**
     * 
     * Creates new form FrmRegistroPregunta
     */
    public FrmRegistroPregunta(Administrador admin) {
        initComponents();
          administrador = admin;
        ctlCategoria = new CtlCategoria();
        DAOCategoria = new GenericoDAO();
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

        BtnRegistrarPregunta = new javax.swing.JButton();
        BtnModificarPregunta = new javax.swing.JButton();
        BtnEliminarPregunta = new javax.swing.JButton();
        BtnBuscarPregunta = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtA = new javax.swing.JTextField();
        TxtB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtPregunta = new javax.swing.JTextField();
        TxtC = new javax.swing.JTextField();
        TxtD = new javax.swing.JTextField();
        cbPregunta = new javax.swing.JComboBox<>();
        rdA = new javax.swing.JRadioButton();
        rdB = new javax.swing.JRadioButton();
        rdC = new javax.swing.JRadioButton();
        rdD = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegistrarPregunta.setBackground(new java.awt.Color(0, 51, 51));
        BtnRegistrarPregunta.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        BtnRegistrarPregunta.setForeground(new java.awt.Color(255, 0, 0));
        BtnRegistrarPregunta.setText("Registrar Pregunta");
        getContentPane().add(BtnRegistrarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, -1));

        BtnModificarPregunta.setBackground(new java.awt.Color(0, 51, 51));
        BtnModificarPregunta.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        BtnModificarPregunta.setForeground(new java.awt.Color(255, 0, 0));
        BtnModificarPregunta.setText("Modificar Pregunta");
        BtnModificarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarPreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 230, -1));

        BtnEliminarPregunta.setBackground(new java.awt.Color(0, 51, 51));
        BtnEliminarPregunta.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        BtnEliminarPregunta.setForeground(new java.awt.Color(255, 0, 0));
        BtnEliminarPregunta.setText("Eliminar Pregunta");
        getContentPane().add(BtnEliminarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, -1));

        BtnBuscarPregunta.setBackground(new java.awt.Color(0, 51, 51));
        BtnBuscarPregunta.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        BtnBuscarPregunta.setForeground(new java.awt.Color(255, 0, 0));
        BtnBuscarPregunta.setText("Buscar Pregunta");
        getContentPane().add(BtnBuscarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 230, -1));

        jButton10.setBackground(new java.awt.Color(0, 51, 51));
        jButton10.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 0, 0));
        jButton10.setText("Mostrar Soluciones");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 102, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 460, 110));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Preguntas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Pregunta :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jbAtras.setBackground(new java.awt.Color(0, 51, 51));
        jbAtras.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jbAtras.setForeground(new java.awt.Color(255, 0, 0));
        jbAtras.setText("Atras");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("A)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("B)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("C)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));
        getContentPane().add(TxtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 280, -1));
        getContentPane().add(TxtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 280, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("D)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, 20));
        getContentPane().add(TxtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 280, -1));
        getContentPane().add(TxtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 280, -1));
        getContentPane().add(TxtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 280, -1));

        cbPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion...", "Unica Respuesta", "Multiple Respuesta" }));
        getContentPane().add(cbPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));
        getContentPane().add(rdA, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));
        getContentPane().add(rdB, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, -1));
        getContentPane().add(rdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, -1));
        getContentPane().add(rdD, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarPreguntaActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        // TODO add your handling code here:
        new FrmGestionCategorias(administrador).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarPregunta;
    private javax.swing.JButton BtnEliminarPregunta;
    private javax.swing.JButton BtnModificarPregunta;
    private javax.swing.JButton BtnRegistrarPregunta;
    private javax.swing.JTextField TxtA;
    private javax.swing.JTextField TxtB;
    private javax.swing.JTextField TxtC;
    private javax.swing.JTextField TxtD;
    private javax.swing.JTextField TxtPregunta;
    private javax.swing.JComboBox<String> cbPregunta;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAtras;
    private javax.swing.JRadioButton rdA;
    private javax.swing.JRadioButton rdB;
    private javax.swing.JRadioButton rdC;
    private javax.swing.JRadioButton rdD;
    // End of variables declaration//GEN-END:variables
}
