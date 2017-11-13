/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.Solucion;

import com.google.gson.Gson;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlSolucion {

    String tabla = "pregunta";

    public String convertirGson(Solucion solucion) {
        Gson gson = new Gson();
        String objeto = gson.toJson(solucion);
        return objeto;
    }

    public boolean SolicitudGuardar(String nombre, int estado, int pregunta) {
        Solucion solucion = new Solucion(nombre, estado, pregunta);
        GenericoDAO solucionDAO = new GenericoDAO();
        String objeto = convertirGson(solucion);
        return solucionDAO.guardar(objeto, tabla);
    }

    public Solucion SolicitudBuscar(int pregunta) {
        Solucion solucion = new Solucion(0, "", 0, 0);
        GenericoDAO solucionDAO = new GenericoDAO();
        String objeto = convertirGson(solucion);
        ResultSet atributos = solucionDAO.buscar(objeto, tabla, pregunta);
        try {
            solucion.setIdSolucion(Integer.parseInt(atributos.getString("idSolucion")));
            solucion.setNombre(atributos.getString("nombre"));
            solucion.setEstado(Integer.parseInt(atributos.getString("estado")));
            solucion.setPregunta(Integer.parseInt(atributos.getString("pregunta")));
        } catch (Exception e) {
            return null;
        }
        return solucion;
    }

    public boolean SolicitudModificar(int idSolucion, String nombre, int estado, int pregunta) {
        Solucion solucion = new Solucion(idSolucion, nombre, estado, pregunta);
        GenericoDAO solucionDAO = new GenericoDAO();
        String objeto = convertirGson(solucion);
        return solucionDAO.modificar(objeto, tabla, "idSolucion", idSolucion);
    }

    public boolean SolicitudEliminar(int pregunta) {
        Solucion solucion = new Solucion();
        GenericoDAO solucionDAO = new GenericoDAO();
        String objeto = convertirGson(solucion);
        return solucionDAO.eliminar(objeto, tabla, pregunta);
    }

    public DefaultTableModel SolicitudListar() {
        GenericoDAO usuarioDAO = new GenericoDAO();
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"IdSolucion", "Nombre", "Estado", "IdPregunta"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet atributos = usuarioDAO.listar(tabla);
        try {
            while (atributos.next()) {
                modelTabla.addRow(new Object[]{
                    atributos.getString("idSolucion"),
                    atributos.getString("nombre"),
                    atributos.getString("estado"),
                    atributos.getString("pregunta")
                });
            }
        } catch (Exception e) {

        }
        return modelTabla;
    }
}
