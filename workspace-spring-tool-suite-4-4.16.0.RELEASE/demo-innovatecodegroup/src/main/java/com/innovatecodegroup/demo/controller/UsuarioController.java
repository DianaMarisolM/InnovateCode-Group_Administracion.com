package com.innovatecodegroup.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovatecodegroup.demo.model.Usuario;
import com.innovatecodegroup.demo.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<?> getTodosUsuarios(){
		return ResponseEntity.ok(usuarioService.getUsuarios());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<?> getUsuarios(@PathVariable  Integer id){
		return ResponseEntity.ok(usuarioService.getusuarioById(id));	
	}
	
	@PostMapping
	public ResponseEntity<?> crearUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.crearUsuario(usuario));
	}
	   
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarUsuario(@RequestBody Usuario usuario, @PathVariable Integer id){
		Optional<Usuario> respuesta = usuarioService.getusuarioById(id);
		if(respuesta.isPresent()) {
			return ResponseEntity.ok(usuarioService.actualizarUsuario(usuario));
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarUsuario(@PathVariable Integer id){
		Optional<Usuario> respuesta = usuarioService.getusuarioById(id);
		if(respuesta.isPresent()) {
			usuarioService.eliminarUsuario(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();	
	}
}
