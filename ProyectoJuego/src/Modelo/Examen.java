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
public class Examen {
    int idExamen;
    int participantes;
    int usuario;

    public Examen(int idExamen, int participantes, int usuario) {
        this.idExamen = idExamen;
        this.participantes = participantes;
        this.usuario = usuario;
    }

    public Examen() {
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    
    
}
