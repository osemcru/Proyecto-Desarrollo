/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.Administrador;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlAdministrador {

    String tabla = "administrador"; //variable que contiene el nombre de esta tabla
    public Administrador logueado; //indica el estado del administrador cuando se ha logueado

    public String convertirGson(Administrador administrador) { //Este metodo convierte el administrador en un gson para llevarlo al dao generico
        Gson gson = new Gson();
        String objeto = gson.toJson(administrador);
        return objeto;
    }

/*Este metodo permite guardar por medio del Dao permitiendo asi que sea generico con el gson
*/
    public boolean SolicitudGuardar(String nickname, String clave, int idCodigo, String nombre, String apellido, String correo, int idTipoUsuario) {
        Administrador administrador = new Administrador(idCodigo, nickname, clave, nombre, apellido, correo, idTipoUsuario);
        GenericoDAO adminDAO = new GenericoDAO();
        String objeto = convertirGson(administrador);
        return adminDAO.guardar(objeto, tabla);
    }
//Este metodo permite buscar el objeto gson 
    public Administrador SolicitudBuscar(int idCodigo) {
        Administrador administrador = new Administrador(idCodigo, "", "", "", "", "", 1);
        GenericoDAO adminDAO = new GenericoDAO();
        String objeto = convertirGson(administrador);
        ResultSet atributos = adminDAO.buscar(objeto, tabla, idCodigo);
        try {
            administrador.setIdCodigo(Integer.parseInt(atributos.getString("idCodigo")));
            administrador.setNickname(atributos.getString("nickname"));
            administrador.setNombre(atributos.getString("clave"));
            administrador.setNombre(atributos.getString("nombre"));
            administrador.setApellido(atributos.getString("apellido"));
            administrador.setCorreo(atributos.getString("correo"));
        } catch (Exception e) {
            return null;
        }
        return administrador;
    }
//Este metodo permite modificar el objeto que esta como gson
    public boolean SolicitudModificar(String nickname, String clave, int idCodigo, String nombre, String apellido, String correo, int semestre, int idTipoUsuario) {
        Administrador administrador = new Administrador(idCodigo, nickname, clave, nombre, apellido, correo, idTipoUsuario);
        GenericoDAO adminDAO = new GenericoDAO();
        String objeto = convertirGson(administrador);
        return adminDAO.modificar(objeto, tabla, "idCodigo", idCodigo);
    }
//Este metodo permite eliminar el objeto que esta como gson
    public boolean SolicitudEliminar(int idCodigo) {
        Administrador administrador = new Administrador();
        GenericoDAO adminDAO = new GenericoDAO();
        String objeto = convertirGson(administrador);
        return adminDAO.eliminar(objeto, tabla, idCodigo);
    }
//Este metodo me permite listar en la tabla este administrador
    public DefaultTableModel solicitudListar() {
        GenericoDAO administradorDAO = new GenericoDAO();
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"NickName", "Clave", "Codigo", "Nombres", "Apellidos", "Correo"};

        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet atributos = administradorDAO.listar(tabla);
        try {
            while (atributos.next()) {
                modelTabla.addRow(new Object[]{
                    atributos.getString("nickname"),
                    atributos.getString("clave"),
                    atributos.getString("codigo"),
                    atributos.getString("nombre"),
                    atributos.getString("apellido"),
                    atributos.getString("correo")
                });
            }
        } catch (Exception e) {

        }
        return modelTabla;
    }
//Este metodo me permite iniciar sesion con un administrador
    public Administrador SolicitudIniciarSesion(String nickname, String clave) {
        Administrador administrador = new Administrador(0, "", "", "", "", "", 1);
        GenericoDAO adminDAO = new GenericoDAO();
        String objeto = convertirGson(administrador);
        ArrayList<String> confirmado = adminDAO.iniciarSesion(objeto, tabla, "nickname", "clave", nickname, clave);
        try {
            logueado = new Administrador(Integer.parseInt(confirmado.get(0)), confirmado.get(1), confirmado.get(2), confirmado.get(3), confirmado.get(4), confirmado.get(5), 1);
            return logueado;
        } catch (Exception e) {
            return null;
        }
    }
//Este metodo confirma el momento en el que se loguea el administrador
    public Administrador SolicitudLogueago() {
        if (logueado != null) {
            return logueado;
        } else {
            return null;
        }
    }
}
