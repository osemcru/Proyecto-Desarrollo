/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.Usuario;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlUsuario {

    String tabla = "usuario";
    Usuario logueado;

    public String convertirGson(Usuario usuario) {
        Gson gson = new Gson();
        String objeto = gson.toJson(usuario);
        return objeto;
    }

    public boolean SolicitudGuardar(String nickname, String clave, int idCodigo, String nombre, String apellido, String correo, int semestre, int idTipoUsuario) {
        Usuario usuario = new Usuario(idCodigo, nickname, clave, nombre, apellido, correo, semestre, idTipoUsuario);
        GenericoDAO usuarioDAO = new GenericoDAO();
        String objeto = convertirGson(usuario);
        return usuarioDAO.guardar(objeto, tabla);
    }

    public Usuario SolicitudBuscar(int idCodigo) {
        Usuario usuario = new Usuario(idCodigo, "", "", "", "", "", 0, 2);
        GenericoDAO usuarioDAO = new GenericoDAO();
        String objeto = convertirGson(usuario);
        ResultSet atributos = usuarioDAO.buscar(objeto, tabla, idCodigo);
        try {
            usuario.setIdCodigo(Integer.parseInt(atributos.getString("idCodigo")));
            usuario.setNickname(atributos.getString("nickname"));
            usuario.setClave(atributos.getString("clave"));
            usuario.setNombre(atributos.getString("nombre"));
            usuario.setApellido(atributos.getString("apellido"));
            usuario.setCorreo(atributos.getString("correo"));
            usuario.setSemestre(Integer.parseInt(atributos.getString("semestre")));
        } catch (Exception e) {
            return null;
        }
        return usuario;
    }

    public boolean SolicitudModificar(String nickname, String clave, int idCodigo, String nombre, String apellido, String correo, int semestre, int idTipoUsuario) {
        Usuario usuario = new Usuario(idCodigo, nickname, clave, nombre, apellido, correo, semestre, idTipoUsuario);
        GenericoDAO usuarioDAO = new GenericoDAO();
        String objeto = convertirGson(usuario);
        return usuarioDAO.modificar(objeto, tabla);
    }

    public boolean SolicitudEliminar(int idCodigo) {
        Usuario usuario = new Usuario();
        GenericoDAO usuarioDAO = new GenericoDAO();
        String objeto = convertirGson(usuario);
        return usuarioDAO.eliminar(objeto, tabla, idCodigo);
    }

    public DefaultTableModel solicitudListar() {
        GenericoDAO usuarioDAO = new GenericoDAO();
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Codigo", "Nombres", "Apellidos"};

        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet atributos = usuarioDAO.listar(tabla);
        try {
            while (atributos.next()) {
                modelTabla.addRow(new Object[]{
                    atributos.getString("idCodigo"),
                    atributos.getString("nombre"),
                    atributos.getString("apellido")
                });
            }
        } catch (Exception e) {
            System.out.println("Algo paso");
        }
        return modelTabla;
    }

    public Usuario SolicitudIniciarSesion(String nickname, String clave) {
        Usuario usuario = new Usuario(0, "", "", "", "", "", 0, 2);
        GenericoDAO usuarioDAO = new GenericoDAO();
        String objeto = convertirGson(usuario);
        ArrayList<String> confirmado = usuarioDAO.iniciarSesion(objeto, tabla, "nickname", "clave", nickname, clave);
        try {
            logueado = new Usuario(Integer.parseInt(confirmado.get(0)), confirmado.get(1), confirmado.get(2), confirmado.get(3), confirmado.get(4), confirmado.get(5), Integer.parseInt(confirmado.get(6)), 1);
            return logueado;
        } catch (Exception e) {
            return null;
        }
    }
}
