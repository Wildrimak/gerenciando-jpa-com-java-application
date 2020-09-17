package com.wildrimak.treinamento.dominio.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.wildrimak.treinamento.dominio.modelos.Cliente;

@Component
public class ClienteJPA {

	@PersistenceContext
	EntityManager entityManager;

	public List<Cliente> getClientes() {

		TypedQuery<Cliente> query = entityManager.createQuery("from Cliente", Cliente.class);
		return query.getResultList();

	}

}
