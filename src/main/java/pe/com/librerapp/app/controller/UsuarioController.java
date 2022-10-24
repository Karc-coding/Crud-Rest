package pe.com.librerapp.app.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import pe.com.librerapp.app.domain.Usuario;
import pe.com.librerapp.app.repository.IRepositoryUser;
import pe.com.librerapp.app.service.IUsuarioService;

@RestController
@RequestMapping("/user")
@Log4j2
public class UsuarioController {

	@Autowired
	public IUsuarioService userService;
	
	@Autowired
	public IRepositoryUser repo;



	@PostMapping("/save")
	public ResponseEntity<Usuario> voidSaveUser(@RequestBody Usuario user) {
		userService.saveUser(user);
		log.info("Se ha creado un nuevo usuario");
		return new ResponseEntity<Usuario>(HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<Object> voidListUser(){

		List<Usuario> lisUser = userService.listUser();
		
		if (lisUser.size() == 0) {
			return ResponseEntity.notFound().build();
		} else {
			userService.listUser();
			log.info("Se ha listado todos los usuarios");
			return ResponseEntity.ok(lisUser);
		}
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Object> voidUpdateUser(@RequestBody Usuario user){
		
		Optional<Usuario> u = repo.findById(user.getId());
		
		if (!u.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			userService.updateUser(user);
			log.info("Se ha actualizado el usuario con el ID " + user.getId());
			return ResponseEntity.accepted().build();
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> voidDeleteUser(@PathVariable Long id){
		
		Optional<Usuario> u = repo.findById(id);
		
		if (!u.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			userService.deleteUser(id);
			log.info("Se ha eliminado el usuario con el ID " + id);
			return ResponseEntity.ok(u);
		}
	}
}
