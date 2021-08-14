package pe.com.librerapp.app.service;

import java.util.List;

import pe.com.librerapp.app.domain.Usuario;

public interface IUsuarioService {
	
	public Usuario saveUser(Usuario user);
	public List<Usuario> listUser();
	public Usuario updateUser(Usuario user);
	public void deleteUser(Long id);

}
