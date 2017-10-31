/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author XgioserX
 */
public class Usuario {

    int idCodigo;
    String nickname;
    String clave;
    String nombre;
    String apellido;
    String correo;
    int semestre;
    int tipoUsuario;

    public Usuario(int idCodigo, String nickname, String clave, String nombre, String apellido, String correo, int semestre, int tipoUsuario) {
        this.idCodigo = idCodigo;
        this.nickname = nickname;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.semestre = semestre;
        this.tipoUsuario = tipoUsuario;
    }

    

    public Usuario() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
