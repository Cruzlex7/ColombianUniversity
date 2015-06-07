package co.umb.ColombianUniversity.Model;

/**
 *
 * @author JorgeIvan
 */
public class CarreraModel {
    
    private int id;
    private String nombre,titulo;
    private int idPlan;

    public CarreraModel(int id, String nombre, String titulo, int idPlan) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.idPlan = idPlan;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }
    
    
    
}
