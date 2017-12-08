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
public class Solucion {
    
    int idSolucion;
    String nombre;
    int estado;
    int pregunta;

    public Solucion(int idSolucion, String nombre, int estado, int pregunta) {
        this.idSolucion = idSolucion;
        this.nombre = nombre;
        this.estado = estado;
        this.pregunta = pregunta;
    }

    public Solucion(String nombre, int estado, int pregunta) {
        this.nombre = nombre;
        this.estado = estado;
        this.pregunta = pregunta;
    }

    public Solucion() {
    }

    public int getIdSolucion() {
        return idSolucion;
    }

    public void setIdSolucion(int idSolucion) {
        this.idSolucion = idSolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
    
    
}
