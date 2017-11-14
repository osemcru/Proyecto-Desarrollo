/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.Pregunta;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlPregunta {

    String tabla = "pregunta";

    public String convertirGson(Pregunta pregunta) {
        Gson gson = new Gson();
        String objeto = gson.toJson(pregunta);
        return objeto;
    }

    public boolean SolicitudGuardar(int idPregunta, String descripcion, int categoria, int tipoPregunta) {
        Pregunta pregunta = new Pregunta(idPregunta, descripcion, categoria, tipoPregunta);
        GenericoDAO preguntaDAO = new GenericoDAO();
        String objeto = convertirGson(pregunta);
        return preguntaDAO.guardar(objeto, tabla);
    }

    public Pregunta SolicitudBuscar(int idPregunta) {
        Pregunta pregunta = new Pregunta(0, "", 0, 0);
        GenericoDAO preguntaDAO = new GenericoDAO();
        String objeto = convertirGson(pregunta);
        ResultSet atributos = preguntaDAO.buscar(objeto, tabla, idPregunta);
        try {
            while (atributos.next()) {
                pregunta.setIdPregunta(Integer.parseInt(atributos.getString("idPregunta")));
                pregunta.setDescripcion(atributos.getString("descripcion"));
                pregunta.setCategoria(Integer.parseInt(atributos.getString("categoria")));
                pregunta.setTipoPregunta(Integer.parseInt(atributos.getString("tipoPregunta")));
                System.out.println("pregunta: " + pregunta.getDescripcion());
            }
        } catch (Exception e) {
            return null;
        }
        if (pregunta.getDescripcion().equals("")) {
            return null;
        } else {
            return pregunta;
        }
    }

    public boolean SolicitudModificar(int idPregunta, String descripcion, int categoria, int tipoPregunta) {
        Pregunta pregunta = new Pregunta(idPregunta, descripcion, categoria, tipoPregunta);
        GenericoDAO preguntaDAO = new GenericoDAO();
        String objeto = convertirGson(pregunta);
        return preguntaDAO.modificar(objeto, tabla, "idPregunta", idPregunta);
    }

    public boolean SolicitudEliminar(int idPregunta) {
        Pregunta pregunta = new Pregunta();
        GenericoDAO preguntaDAO = new GenericoDAO();
        String objeto = convertirGson(pregunta);
        return preguntaDAO.eliminar(objeto, tabla, idPregunta);
    }

    public DefaultTableModel SolicitudListar() {
        GenericoDAO preguntaDAO = new GenericoDAO();
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"idPregunta", "descripcion", "idCategoria", "Tipo Pregunta"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet atributos = preguntaDAO.listar(tabla);
        try {
            while (atributos.next()) {
                modelTabla.addRow(new Object[]{
                    atributos.getString("idPregunta"),
                    atributos.getString("descripcion"),
                    atributos.getString("categoria"),
                    atributos.getString("tipoPregunta")
                });
            }
        } catch (Exception e) {

        }
        return modelTabla;
    }

    public void SolicitudCargarInformacion(JComboBox<String> cbCategorias) {
        GenericoDAO DAO = new GenericoDAO();
        DAO.cargarInformacion(cbCategorias, "categoria", "nombre");
    }

    public int SolicitudUltimaIDPregunta() {
        GenericoDAO preguntaDAO = new GenericoDAO();
        ResultSet atributos = preguntaDAO.listar(tabla);
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
