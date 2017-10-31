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
public class AuditoriaPregunta {
    int idAuditoriaPregunta;
    int porcentaje;
    int pregunta;

    public AuditoriaPregunta(int idAuditoriaPregunta, int porcentaje, int pregunta) {
        this.idAuditoriaPregunta = idAuditoriaPregunta;
        this.porcentaje = porcentaje;
        this.pregunta = pregunta;
    }

    public AuditoriaPregunta(int porcentaje, int pregunta) {
        this.porcentaje = porcentaje;
        this.pregunta = pregunta;
    }
    
    public AuditoriaPregunta() {
    }

    public int getIdAuditoriaPregunta() {
        return idAuditoriaPregunta;
    }

    public void setIdAuditoriaPregunta(int idAuditoriaPregunta) {
        this.idAuditoriaPregunta = idAuditoriaPregunta;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
    
}
