/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Conexion;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JComboBox;

/**
 *
 * @author Cristian Cruz
 */
public class GenericoDAO extends Conexion {

    public boolean guardar(String objeto, String tabla) {

        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(objeto).getAsJsonObject();
        Set<String> keys = jobject.keySet();

        ArrayList<String> listCampos = new ArrayList(keys);
        ArrayList<String> listValores = new ArrayList();
        for (int i = 0; i < listCampos.size(); i++) {
            listValores.add(jobject.get(listCampos.get(i)).getAsString());
        }
        String consulta = "insert into " + tabla + "(";
        Iterator<String> itrCampos = listCampos.iterator();

        while (itrCampos.hasNext()) {
            Object atributo = itrCampos.next();
            consulta = consulta + "" + atributo.toString();
            if (itrCampos.hasNext()) {
                consulta = consulta + ",";
            } else {
                consulta = consulta + ") values (";
            }

        }
        Iterator<String> itrValores = listValores.iterator();
        while (itrValores.hasNext()) {
            Object valor = itrValores.next();
            consulta = consulta + "'" + valor;
            if (itrValores.hasNext()) {
                consulta = consulta + "',";
            } else {
                consulta = consulta + "');";
            }

        }
        return super.ejecutar(consulta);
    }

    public ResultSet buscar(String objeto, String tabla, Object id) {
        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(objeto).getAsJsonObject();
        Set<String> keys = jobject.keySet();

        ArrayList<String> listCampos = new ArrayList(keys);
        String consulta = "select * from " + tabla + " where " + listCampos.get(0) + "='" + id + "'";
        super.ejecutarRetorno(consulta);
        return resultadoDB;
    }
    
    public ResultSet buscarVarios(String objeto, String tabla, Object id) {
        
        String consulta = "select * from " + tabla + " where " + objeto + "='" + id + "'";
        super.ejecutarRetorno(consulta);
        return resultadoDB;
    }

    public boolean modificar(String objeto, String tabla, String variable, Object contenido) {
        String consulta = "update " + tabla + " set ";

        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(objeto).getAsJsonObject();
        Set<String> keys = jobject.keySet();

        ArrayList<String> listCampos = new ArrayList(keys);
        ArrayList<String> listValores = new ArrayList();

        for (int i = 0; i < listCampos.size(); i++) {
            listValores.add(jobject.get(listCampos.get(i)).getAsString());
        }
        Iterator<String> itrCampos = listCampos.iterator();

        Iterator<String> itrValores = listValores.iterator();

        while (itrCampos.hasNext() && itrValores.hasNext()) {
            Object atributo = itrCampos.next();
            Object valor = itrValores.next();
            consulta += atributo.toString() + "='" + valor + "'";
            if (itrCampos.hasNext()) {
                consulta += ",";
            }
        }
        consulta += " where " + variable + "='" + contenido + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public boolean eliminar(String objeto, String tabla, Object variable) {
        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(objeto).getAsJsonObject();
        Set<String> keys = jobject.keySet();

        ArrayList<String> listCampos = new ArrayList(keys);
        String consulta = "delete from " + tabla + " where " + listCampos.get(0) + "='" + variable + "';";
        return super.ejecutar(consulta);
    }
    
    public boolean eliminarSecundario(String objeto, String tabla, Object variable) {
        
        String consulta = "delete from " + tabla + " where " + objeto + "='" + variable + "';";
        return super.ejecutar(consulta);
    }

    public void cargarInformacion(JComboBox<String> comboBox, String tabla, String variable) {
        String consulta = "SELECT * FROM " + tabla;
        super.ejecutarRetorno(consulta);
        try {
            while (resultadoDB.next() != resultadoDB.wasNull()) {

                comboBox.addItem(resultadoDB.getString(variable));

            }
        } catch (Exception e) {
            System.out.println("cargando cb" + e);
        }
    }

    public ResultSet listar(String tabla) {
        String consulta = "select * from " + tabla;
        super.ejecutarRetorno(consulta);
        return resultadoDB;
    }

    public ArrayList<String> iniciarSesion(String objeto, String tabla, String variable1, String variable2, String nickname, String clave) {
        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(objeto).getAsJsonObject();
        Set<String> keys = jobject.keySet();

        ArrayList<String> listCampos = new ArrayList(keys);
        String consulta = "select * from " + tabla + " where " + variable1 + "='" + nickname + "' and " + variable2 + "='" + clave + "';";
        super.ejecutarRetorno(consulta);
        ArrayList<String> dao = new ArrayList<>();
        try {
            if (resultadoDB.next()) {
                for (int i = 0; i < listCampos.size(); i++) {
                    dao.add(resultadoDB.getString(listCampos.get(i)));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Se prendio esta mier**");
        }
        return dao;
    }
}
