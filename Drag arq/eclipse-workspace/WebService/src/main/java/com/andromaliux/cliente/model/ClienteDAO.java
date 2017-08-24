package com.andromaliux.cliente.model;

import java.util.List;
import javax.persistence.*;

public class ClienteDAO implements DAO<Cliente>{

	private final EntityManagerFactory entityManagerFactory;
	private final EntityManager entityManager;
	
	public ClienteDAO() {
		super();
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_cliente");
		this.entityManager = entityManagerFactory.createEntityManager();
	}
	@Override
	public void salvar(Cliente t) {
		// TODO Auto-generated method stub
		this.entityManager.getTransaction().begin();
		this.entityManager.getTransaction().commit();
		this.entityManager.persist(t);
		
	}

	@Override
	public void editar(Cliente t) {
		// TODO Auto-generated method stub
		this.entityManager.getTransaction().begin();
		this.entityManager.getTransaction().commit();
		this.entityManager.merge(t);
	}

	@Override
	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		
		this.entityManager.getTransaction().begin();
		this.entityManager.getTransaction().commit();
		this.entityManager.remove(buscarPorId(id));
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return this.entityManager.createQuery("SELECT c FROM Cliente c ORDER BY c.nome").getResultList();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}
	
}
