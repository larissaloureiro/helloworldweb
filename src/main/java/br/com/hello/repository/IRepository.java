package br.com.hello.repository;

import java.util.List;

public interface IRepository <T> {
	public void save(T tipo); // Inserir dados
	public void delete(Integer id); // Excluir dados
	public List<T> findAll(); // Buscar todos
	public T findById(Integer id); // Buscar por Id
	public void update(T tipo); // Atualizar
}
