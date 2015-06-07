package co.umb.ColombianUniversity.Model;

/**
 *
 * @author JorgeIvan
 */
public class UsuarioModel {
    
    private String nombre,contrasenia;
    private int rol;

    public UsuarioModel(String nombre, String contrasenia, int rol) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
}
