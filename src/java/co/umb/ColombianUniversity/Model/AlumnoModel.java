/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.Model;

/**
 *
 * @author Alexander
 */
public class AlumnoModel {
    
    private int id;
    private String nombre;
    private String apellido;
    private int idTipoDocumento;
    private int idDomicilio;
    private int idGenero;

    public AlumnoModel(int id, String nombre, String apellido, int idTipoDocumento, int idDomicilio, int idGenero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idTipoDocumento = idTipoDocumento;
        this.idDomicilio = idDomicilio;
        this.idGenero = idGenero;
    }  
    
    public AlumnoModel(){
    
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    
    
    
    
    
}
