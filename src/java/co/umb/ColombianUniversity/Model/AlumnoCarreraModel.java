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
public class AlumnoCarreraModel {
    
    private int idAlumnoCarrera;
    private int idAlumno;
    private int idCarrera;
    private Date fechaTramite;
    private String carrera;
    

    public AlumnoCarreraModel(int idAlumnoCarrera, int idAlumno, int idCarrera, Date fechaTramite,String carrera) {
        this.idAlumnoCarrera = idAlumnoCarrera;
        this.idAlumno = idAlumno;
        this.idCarrera = idCarrera;
        this.fechaTramite = fechaTramite;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public int getIdAlumnoCarrera() {
        return idAlumnoCarrera;
    }

    public void setIdAlumnoCarrera(int idAlumnoCarrera) {
        this.idAlumnoCarrera = idAlumnoCarrera;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public Date getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Date fechaTramite) {
        this.fechaTramite = fechaTramite;
    }
    
    
    
}
