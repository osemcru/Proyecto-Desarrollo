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
public class AuditoriaExamen {
    int idAuditoriaExamen;
    int porcentaje;
    int examen;

    public AuditoriaExamen(int idAuditoriaExamen, int porcentaje, int examen) {
        this.idAuditoriaExamen = idAuditoriaExamen;
        this.porcentaje = porcentaje;
        this.examen = examen;
    }

    public AuditoriaExamen(int porcentaje, int examen) {
        this.porcentaje = porcentaje;
        this.examen = examen;
    }
    
    public AuditoriaExamen() {
    }

    public int getIdAuditoriaExamen() {
        return idAuditoriaExamen;
    }

    public void setIdAuditoriaExamen(int idAuditoriaExamen) {
        this.idAuditoriaExamen = idAuditoriaExamen;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }
    
}
