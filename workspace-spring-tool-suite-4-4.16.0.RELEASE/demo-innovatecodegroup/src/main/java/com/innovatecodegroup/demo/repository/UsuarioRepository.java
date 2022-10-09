package com.innovatecodegroup.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovatecodegroup.demo.model.Usuario;

@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>  {

}
