/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.AuditoriaUsuario;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlAuditoriaUsuario {

    String tabla = "auditoriaUsuario";
    
    public String convertirGson(AuditoriaUsuario auditoriaUsuario) {
        Gson gson = new Gson();
        String objeto = gson.toJson(auditoriaUsuario);
        return objeto;
    }
 
    public boolean SolicitudGuardar(int idCodigo,int porcentaje) {
        AuditoriaUsuario auditoriaUsuario = new AuditoriaUsuario(porcentaje, idCodigo);
        GenericoDAO audUsuDAO = new GenericoDAO();
        String objeto = convertirGson(auditoriaUsuario);
        return audUsuDAO.guardar(objeto, tabla);
    }

    public AuditoriaUsuario SolicitudBuscar(int idCodigo) {
        AuditoriaUsuario auditoriaUsuario = new AuditoriaUsuario(0,0,0);
        GenericoDAO audUsuDAO = new GenericoDAO();
        String objeto = convertirGson(auditoriaUsuario);
        ResultSet atributos = audUsuDAO.buscar(objeto, tabla, idCodigo);
        try {
            auditoriaUsuario.setIdAuditoriaUsuario(Integer.parseInt(atributos.getString("idAuditoriaUsuario")));
            auditoriaUsuario.setPorcentaje(Integer.parseInt(atributos.getString("porcentaje")));
            auditoriaUsuario.setUsuario(Integer.parseInt(atributos.getString("usuario")));
        } catch (Exception e) {
            return null;
        }
        return auditoriaUsuario;
    }

//    public boolean SolicitudModificar(int idCodigo,int idTipoUsuario) {
//        AuditoriaUsuario auditoriaUsuario = new AuditoriaUsuario(idTipoUsuario, idCodigo, idTipoUsuario);
//        GenericoDAO audUsuDAO = new GenericoDAO();
//        String objeto = convertirGson(auditoriaUsuario);
//        return audUsuDAO.modificar(objeto, tabla);
//    }
//
//    public boolean SolicitudEliminar(int idTipoUsuario) {
//        AuditoriaUsuario auditoriaUsuario = new AuditoriaUsuario();
//        GenericoDAO audUsuDAO = new GenericoDAO();
//        String objeto = convertirGson(auditoriaUsuario);
//        return audUsuDAO.eliminar(objeto, tabla, idTipoUsuario);
//    }
//
//    public DefaultTableModel solicitudListar() {
//        GenericoDAO usuarioDAO = new GenericoDAO();
//        DefaultTableModel modelTabla;
//        String nombreColumnas[] = {"IdTipoUsuario", "IdCodigo", "IdTipoUsuario"};
//        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);
//
//        ResultSet atributos = usuarioDAO.listar(tabla);
//        try {
//            while (atributos.next()) {
//                modelTabla.addRow(new Object[]{
//                    atributos.getString("idTipoUsuario"),
//                    atributos.getString("idCodigo"),
//                    atributos.getString("idTipoUsuario")
//                });
//            }
//        } catch (Exception e) {
//
//        }
//        return modelTabla;
//    }
}
  
