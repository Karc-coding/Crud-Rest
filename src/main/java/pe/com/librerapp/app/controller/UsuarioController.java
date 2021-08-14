package pe.com.librerapp.app.controller;


import java.util.List;

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
import pe.com.librerapp.app.service.IUsuarioService;

@RestController
@RequestMapping("/user")
@Log4j2
public class UsuarioController {

	@Autowired
	public IUsuarioService userService;
	
	/*@PostMapping("/save")
	public Usuario voidSaveUser(@RequestBody Usuario user) {
		log.info("Se ha creado un nuevo usuario");
		return userService.saveUser(user);
	}*/
	
	@PostMapping("/save")
	public ResponseEntity<Usuario> voidSaveUser(@RequestBody Usuario user) {
		userService.saveUser(user);
		log.info("Se ha creado un nuevo usuario");
		return new ResponseEntity<Usuario>(HttpStatus.CREATED);
	}
	
	
	
	/*@GetMapping("/list")
	public List<Usuario> voidListUser(){
		log.info("Se ha listado todos los usuarios");
		return userService.listUser();
	}*/
	
	@GetMapping("/list")
	public ResponseEntity<Usuario> voidListUser(){
		userService.listUser();
		log.info("Se ha listado todos los usuarios");
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
	
	
	
	/*@PutMapping("/update")
	public Usuario voidUpdateUser(@RequestBody Usuario user){
		log.info("Se ha actualizado el usuario con el ID " + user.getId());
		return userService.updateUser(user);
	}*/
	
	@PutMapping("/update")
	public ResponseEntity<Usuario> voidUpdateUser(@RequestBody Usuario user){
		userService.updateUser(user);
		log.info("Se ha actualizado el usuario con el ID " + user.getId());
		return new ResponseEntity<Usuario>(HttpStatus.ACCEPTED);
	}
	
	
	
	/*@DeleteMapping("/delete/{id}")
	public void voidDeleteUser(@PathVariable Long id){
		userService.deleteUser(id);
		log.info("Se ha eliminado el usuario con el ID " + id);
	}*/
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Usuario> voidDeleteUser(@PathVariable Long id){
		userService.deleteUser(id);
		log.info("Se ha eliminado el usuario con el ID " + id);
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
}
