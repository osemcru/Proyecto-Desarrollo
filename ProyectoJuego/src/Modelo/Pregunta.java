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
public class Pregunta {
    
   int idPregunta;
   String descripcion;
   int categoria;
   int examen;

    public Pregunta(int idPregunta, String descripcion, int categoria, int examen) {
        this.idPregunta = idPregunta;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.examen = examen;
    }

    public Pregunta(String descripcion, int categoria, int examen) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.examen = examen;
    }

    public Pregunta() {
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }
   
   
}
