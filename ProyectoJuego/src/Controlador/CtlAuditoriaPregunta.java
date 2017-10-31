/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.AuditoriaPregunta;
import Modelo.AuditoriaUsuario;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlAuditoriaPregunta {
    
    String tabla = "auditoriaPregunta";
    
    public String convertirGson(AuditoriaPregunta auditoriaPregunta) {
        Gson gson = new Gson();
        String objeto = gson.toJson(auditoriaPregunta);
        return objeto;
    }
 
    public boolean SolicitudGuardar(int porcentaje, int pregunta) {
        AuditoriaPregunta auditoriaPregunta = new AuditoriaPregunta(porcentaje, pregunta);
        GenericoDAO audPreDAO = new GenericoDAO();
        String objeto = convertirGson(auditoriaPregunta);
        return audPreDAO.guardar(objeto, tabla);
    }

    public AuditoriaPregunta SolicitudBuscar(int idAuditoriaPregunta) {
        AuditoriaPregunta auditoriaPregunta = new AuditoriaPregunta(0,0,0);
        GenericoDAO audPreDAO = new GenericoDAO();
        String objeto = convertirGson(auditoriaPregunta);
        ResultSet atributos = audPreDAO.buscar(objeto, tabla, idAuditoriaPregunta);
        try {
            auditoriaPregunta.setIdAuditoriaPregunta(Integer.parseInt(atributos.getString("idAuditoriaExamen")));
            auditoriaPregunta.setPorcentaje(Integer.parseInt(atributos.getString("porcentaje")));
            auditoriaPregunta.setPregunta(Integer.parseInt(atributos.getString("pregunta")));
        } catch (Exception e) {
            return null;
        }
        return auditoriaPregunta;
    }

//    public boolean SolicitudModificar( int idAuditoriaPregunta,int porcentaje, int pregunta) {
//        AuditoriaPregunta auditoriaPregunta = new AuditoriaPregunta(idAuditoriaPregunta, porcentaje, pregunta);
//        GenericoDAO audPreDAO = new GenericoDAO();
//        String objeto = convertirGson(auditoriaPregunta);
//        return audPreDAO.modificar(objeto, tabla);
//    }

//    public boolean SolicitudEliminar(int idAuditoriaPregunta) {
//        AuditoriaPregunta auditoriaPregunta = new AuditoriaPregunta();
//        GenericoDAO audPreDAO = new GenericoDAO();
//        String objeto = convertirGson(auditoriaPregunta);
//        return audPreDAO.eliminar(objeto, tabla, idAuditoriaPregunta);
//    }
//
//    public DefaultTableModel solicitudListar() {
//        GenericoDAO usuarioDAO = new GenericoDAO();
//        DefaultTableModel modelTabla;
//        String nombreColumnas[] = {"IdAuditoriaPregunta", "Porcentaje", "Pregunta"};
//        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);
//
//        ResultSet atributos = usuarioDAO.listar(tabla);
//        try {
//            while (atributos.next()) {
//                modelTabla.addRow(new Object[]{
//                    atributos.getString("idAuditoriaPregunta"),
//                    atributos.getString("porcentaje"),
//                    atributos.getString("pregunta")
//                });
//            }
//        } catch (Exception e) {
//
//        }
//        return modelTabla;
//    }
}
  