package pe.com.librerapp.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.librerapp.app.domain.Usuario;
import pe.com.librerapp.app.repository.IRepositoryUser;
import pe.com.librerapp.app.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	public IRepositoryUser repo;
	
	@Override
	public Usuario saveUser(Usuario user) {
		return repo.save(user);
	}

	@Override
	public List<Usuario> listUser() {
		return repo.findAll();
	}

	@Override
	public Usuario updateUser(Usuario user) {
		return repo.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		repo.deleteById(id);
	}

}
