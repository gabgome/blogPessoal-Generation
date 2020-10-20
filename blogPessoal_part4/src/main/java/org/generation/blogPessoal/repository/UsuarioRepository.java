package org.generation.blogPessoal.repository;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);

}

/*
 * findBy é uma palavra reservada do Spring. 
 * O retorno dele será o atributo usuario da classe model de Usuario
*/
