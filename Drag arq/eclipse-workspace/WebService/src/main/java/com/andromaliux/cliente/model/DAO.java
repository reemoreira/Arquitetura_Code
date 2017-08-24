package com.andromaliux.cliente.model;

import java.util.List;

public interface DAO<T> {
	
	public void salvar(T t);
	public void editar(T t);
	public void excluir(Integer id);
	public List <Cliente> listar();
	public T buscarPorId(Integer id);
}	
