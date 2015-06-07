/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.Model;

import java.sql.Date;

/**
 *
 * @author Alexander
 */
public class InscripcionMateriaModel {
    
    private int idInscripcionMateria;
    private int idAlumnoCarrera;
    private int idMateria;
    private int idEstadoMateria;
    private Date fechaInscripcion;
    private Date fechaEstado;
    private String nombreMateria;
    private String estado;

    public InscripcionMateriaModel(int idInscripcionMateria, int idAlumnoCarrera, int idMateria, int idEstadoMateria, Date fechaInscripcion, Date fechaEstado) {
        this.idInscripcionMateria = idInscripcionMateria;
        this.idAlumnoCarrera = idAlumnoCarrera;
        this.idMateria = idMateria;
        this.idEstadoMateria = idEstadoMateria;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaEstado = fechaEstado;
    }       

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
    public int getIdInscripcionMateria() {
        return idInscripcionMateria;
    }

    public void setIdInscripcionMateria(int idInscripcionMateria) {
        this.idInscripcionMateria = idInscripcionMateria;
    }

    public int getIdAlumnoCarrera() {
        return idAlumnoCarrera;
    }

    public void setIdAlumnoCarrera(int idAlumnoCarrera) {
        this.idAlumnoCarrera = idAlumnoCarrera;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getIdEstadoMateria() {
        return idEstadoMateria;
    }

    public void setIdEstadoMateria(int idEstadoMateria) {
        this.idEstadoMateria = idEstadoMateria;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Date getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(Date fechaEstado) {
        this.fechaEstado = fechaEstado;
    }
    
    
    
}
