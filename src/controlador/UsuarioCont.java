package controlador;

import modelos.Usuario;

import java.util.List;

public interface UsuarioCont {
    public void insertarUsuario(Usuario usuario);
    public void actualizarUsuario(Usuario usuario);
    public List<Usuario> obtenerUsuarios();
    public void eliminarUsuario(Usuario usuario);
}
