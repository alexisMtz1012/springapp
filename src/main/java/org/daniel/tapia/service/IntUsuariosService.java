package org.daniel.tapia.service;

import java.util.List;

import org.daniel.tapia.model.Usuario;

public interface IntUsuariosService {
	public List<Usuario> obtenerTodas();
	public Usuario buscarPorID(Integer id);
	public void guardar(Usuario usuario);
	public void eliminar(Integer idUsuario);
}
