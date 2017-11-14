/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.AuditoriaExamen;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlAuditoriaExamen {
 
    String tabla = "auditoriaExamen"; //Esta variable indica el nombre de la tabla
    
    public String convertirGson(AuditoriaExamen auditoriaExamen) { //Este metodo permite convertir un objeto a gson
        Gson gson = new Gson();
        String objeto = gson.toJson(auditoriaExamen);
        return objeto;
    }
 
    public boolean SolicitudGuardar(int porcentaje, int examen) { //Este metodo permite guardar el objeto convertido en gson
        AuditoriaExamen auditoriaExamen = new AuditoriaExamen(porcentaje, examen);
        GenericoDAO adiExamDAO = new GenericoDAO(); 
        String objeto = convertirGson(auditoriaExamen);
        return adiExamDAO.guardar(objeto, tabla);
    }

    public AuditoriaExamen SolicitudBuscar(int idAuditoriaExamen) {  //Este metodo permite buscar en la auditoria los datos 
        AuditoriaExamen auditoriaExamen = new AuditoriaExamen(0, 0, 0);
        GenericoDAO adiExamDAO = new GenericoDAO();
        String objeto = convertirGson(auditoriaExamen);
        ResultSet atributos = adiExamDAO.buscar(objeto, tabla, idAuditoriaExamen);
        try {
            auditoriaExamen.setIdAuditoriaExamen(Integer.parseInt(atributos.getString("idAuditoriaExamen")));
            auditoriaExamen.setPorcentaje(Integer.parseInt(atributos.getString("porcentaje")));
            auditoriaExamen.setExamen(Integer.parseInt(atributos.getString("examen")));
        } catch (Exception e) {
            return null;
        }
        return auditoriaExamen;
    }

//    public boolean SolicitudModificar(int idAuditoriaExamen,int porcentaje,int examen) {
//        AuditoriaExamen auditoriaExamen = new AuditoriaExamen();
//        GenericoDAO adiExamDAO = new GenericoDAO();
//        String objeto = convertirGson(auditoriaExamen);
//        return adiExamDAO.modificar(objeto, tabla);
//    }
//
//    public boolean SolicitudEliminar(int idAuditoriaExamen) {
//        AuditoriaExamen idAudExa = new AuditoriaExamen();
//        GenericoDAO adminDAO = new GenericoDAO();
//        String objeto = convertirGson(idAudExa);
//        return adminDAO.eliminar(objeto, tabla, idAuditoriaExamen);
//    }
//
//    public DefaultTableModel solicitudListar() {
//        GenericoDAO usuarioDAO = new GenericoDAO();
//        DefaultTableModel modelTabla;
//        String nombreColumnas[] = {"IdAuditoriaExamen", "porcentaje", "IdExamen"};
//        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);
//
//        ResultSet atributos = usuarioDAO.listar(tabla);
//        try {
//            while (atributos.next()) {
//                modelTabla.addRow(new Object[]{
//                    atributos.getString("idAuditoriaExamen"),
//                    atributos.getString("porcentaje"),
//                    atributos.getString("examen")
//                });
//            }
//        } catch (Exception e) {
//
//        }
//        return modelTabla;
//    }
}
  
