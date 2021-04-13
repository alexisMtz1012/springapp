package org.daniel.tapia.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.daniel.tapia.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImp implements IntUsuariosService {
	
	private List<Usuario> lista = null;
	
	public UsuariosServiceImp() {
		lista = new LinkedList<Usuario>();
		try {
			Usuario u1 = new Usuario();
			u1.setIdUsuario(1);
			u1.setNombre("Natalia");
			u1.setUsername("natalia10");
			u1.setPassword("123456");
			u1.setEmail("natalia@gmail.com");
			u1.setEstatus(1);
			u1.setFechaRegistro(LocalDate.parse("12-01-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			lista.add(u1);
			//**************************************************
			Usuario u2 = new Usuario();
			u2.setIdUsuario(2);
			u2.setNombre("Alexis");
			u2.setUsername("alexis20");
			u2.setPassword("678945");
			u2.setEmail("alexis@gmail.com");
			u2.setEstatus(1);
			u2.setFechaRegistro(LocalDate.parse("15-02-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			lista.add(u2);
			//**************************************************
			Usuario u3 = new Usuario();
			u3.setIdUsuario(3);
			u3.setNombre("Antonio");
			u3.setUsername("antonio30");
			u3.setPassword("123456");
			u3.setEmail("antonio@gmail.com");
			u3.setEstatus(0);
			u3.setFechaRegistro(LocalDate.parse("18-02-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			lista.add(u3);
			//**************************************************
		}catch(DateTimeParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	@Override
	public List<Usuario> obtenerTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Usuario buscarPorID(Integer idUsuario) {
		for(Usuario usuario : obtenerTodas()) {
			if(usuario.getIdUsuario() == idUsuario) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public void guardar(Usuario usuario) {
		lista.add(usuario);
	}

	@Override
	public void eliminar(Integer idUsuario) {
		lista.remove(idUsuario);
	}

}
