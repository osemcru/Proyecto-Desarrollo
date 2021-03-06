/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.Examen;
import com.google.gson.Gson;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlExamen {

    String tabla = "examen";

    public String convertirGson(Object examen) {
        Gson gson = new Gson();
        String objeto = gson.toJson(examen);
        return objeto;
    }

    public boolean SolicitudGuardar(int idExamen, int participantes, int usuario) {
        Examen examen = new Examen(idExamen, participantes, usuario);
        GenericoDAO examenDAO = new GenericoDAO();
        String objeto = convertirGson(examen);
        return examenDAO.guardar(objeto, tabla);
    }

    public boolean SolicitudGuardarIntermedia(int examen, int pregunta) {
        GenericoDAO examenDAO = new GenericoDAO();
        return examenDAO.guardarTablaIntermedia("examenpregunta", "examen", "pregunta", examen, pregunta);
    }

    public Examen SolicitudBuscar(int idExamen) {
        Examen examen = new Examen(idExamen, 0, 0);
        GenericoDAO examenDAO = new GenericoDAO();
        String objeto = convertirGson(examen);
        ResultSet atributos = examenDAO.buscar(objeto, tabla, idExamen);
        try {
            while (atributos.next()) {
                examen.setIdExamen(Integer.parseInt(atributos.getString("idExamen")));
                examen.setParticipantes(Integer.parseInt(atributos.getString("participantes")));
                examen.setUsuario(Integer.parseInt(atributos.getString("usuario")));
            }
        } catch (Exception e) {
            return null;
        }
        return examen;
    }

    public boolean SolicitudModificar(int idExamen, int participantes, int usuario) {
        Examen examen = new Examen(idExamen, participantes, usuario);
        GenericoDAO examenDAO = new GenericoDAO();
        String objeto = convertirGson(examen);
        return examenDAO.modificar(objeto, tabla, "idExamen", idExamen);
    }

    public boolean SolicitudEliminar(int idExamen) {
        Examen examen = new Examen();
        GenericoDAO examenDAO = new GenericoDAO();
        String objeto = convertirGson(examen);
        return examenDAO.eliminar(objeto, tabla, idExamen);
    }

    public DefaultTableModel SolicitudListar() {
        GenericoDAO examenDAO = new GenericoDAO();
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"IdExamen", "Participantes", "Codigo Usuario"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet atributos = examenDAO.listar(tabla);
        try {
            while (atributos.next()) {
                modelTabla.addRow(new Object[]{
                    atributos.getString("idExamen"),
                    atributos.getString("participantes"),
                    atributos.getString("usuario")
                });
            }
        } catch (Exception e) {

        }
        return modelTabla;
    }

    public int SolicitudUltimaIDExamen() {
        GenericoDAO examenDAO = new GenericoDAO();
        ResultSet atributos = examenDAO.listar(tabla);
        int idExamen = 0;
        try {
            while (atributos.next()) {
                idExamen = Integer.parseInt(atributos.getString("idExamen"));
            }
        } catch (Exception e) {

        }
        return idExamen;
    }

    public int SolicitudPreguntaAleatoria() {
        GenericoDAO examenDAO = new GenericoDAO();
        ResultSet atributos = examenDAO.buscarAleatoriamente("pregunta");
        int idPregunta = 0;
        try {
            while (atributos.next()) {
                idPregunta = Integer.parseInt(atributos.getString("idPregunta"));
            }
        } catch (Exception e) {

        }
        return idPregunta;
    }
}
