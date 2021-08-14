package pe.com.librerapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.librerapp.app.domain.Usuario;

public interface IRepositoryUser extends JpaRepository<Usuario, Long> {

}
