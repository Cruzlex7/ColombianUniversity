package co.umb.ColombianUniversity.Model;

/**
 *
 * @author JorgeIvan
 */
public class MateriaModel {
    
    private int id;
    private String nombre;

    public MateriaModel(int id, String nombra) {
        this.id = id;
        this.nombre = nombra;
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
    
    
    
}
