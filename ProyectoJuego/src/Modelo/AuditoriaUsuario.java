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
public class AuditoriaUsuario {
    int idAuditoriaUsuario;
    int porcentaje;
    int usuario;

    public AuditoriaUsuario(int idAuditoriaUsuario, int porcentaje, int usuario) {
        this.idAuditoriaUsuario = idAuditoriaUsuario;
        this.porcentaje = porcentaje;
        this.usuario = usuario;
    }

    public AuditoriaUsuario(int porcentaje, int usuario) {
        this.porcentaje = porcentaje;
        this.usuario = usuario;
    }
    
    public AuditoriaUsuario() {
    }

    public int getIdAuditoriaUsuario() {
        return idAuditoriaUsuario;
    }

    public void setIdAuditoriaUsuario(int idAuditoriaUsuario) {
        this.idAuditoriaUsuario = idAuditoriaUsuario;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
    
}
