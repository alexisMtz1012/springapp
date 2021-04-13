package org.daniel.tapia.service;

import java.util.List;
import org.daniel.tapia.model.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IntCategoriasService {
	public List<Categoria> obtenerTodas();
	public Categoria buscarPorId(Integer id);
	public void guardar(Categoria categoria);
	public void eliminar(Integer idCategoria);
	public Page<Categoria>buscarTodas(Pageable page);
}
