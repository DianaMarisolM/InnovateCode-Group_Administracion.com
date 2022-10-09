package com.innovatecodegroup.demo.service;

import java.util.List;
import java.util.Optional;

import com.innovatecodegroup.demo.model.Usuario;

public interface UsuarioService {
    public List<Usuario>  getUsuarios();
    public Optional<Usuario> getusuarioById(Integer id);
    public Usuario crearUsuario(Usuario usuario);
    public Usuario actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(Integer id);
	
    
}
