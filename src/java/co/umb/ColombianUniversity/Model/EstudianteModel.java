package co.umb.ColombianUniversity.Model;

/**
 *
 * @author JorgeIvan
 */
public class EstudianteModel {
    
    private int documento;
    private String nombre,segNombre,apellido,segApellido,tipoDocumento;
    private String avenida,calle,carrera,barrio;
    private int casa;
    private String genero;

    public EstudianteModel(int documento, String nombre, String segNombre, String apellido, String segApellido, String tipoDocumento, String avenida, String calle, String carrera, String barrio, int casa, String genero) {
        this.documento = documento;
        this.nombre = nombre;
        this.segNombre = segNombre;
        this.apellido = apellido;
        this.segApellido = segApellido;
        this.tipoDocumento = tipoDocumento;
        this.avenida = avenida;
        this.calle = calle;
        this.carrera = carrera;
        this.barrio = barrio;
        this.casa = casa;
        this.genero = genero;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegNombre() {
        return segNombre;
    }

    public void setSegNombre(String segNombre) {
        this.segNombre = segNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegApellido() {
        return segApellido;
    }

    public void setSegApellido(String segApellido) {
        this.segApellido = segApellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
