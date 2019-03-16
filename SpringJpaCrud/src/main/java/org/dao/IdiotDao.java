package org.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.pojo.Idiot;
import org.springframework.stereotype.Repository;

@Repository("idiotDao")
@Transactional
public class IdiotDao 
{
	@PersistenceContext
	private EntityManager entityManager;
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	//@Transactional
	public void addIdiot(Idiot idiot) 
	{
		entityManager.persist(idiot);
	}
	
	public List<Idiot> getAllIdiots() //8657420671
	{
		Query q = entityManager.createQuery("from Idiot");
		List<Idiot> listIdiot = q.getResultList();
 		return listIdiot;
		
	}
	
	public Idiot getIdiotById(int id)
	{
		Idiot idiot = entityManager.find(Idiot.class, id);
		return idiot;
	}

	public void updateIdiot(Idiot idiot) 
	{
		entityManager.merge(idiot);
		
	}

	public void deleteById(int id)
	{
		Idiot idiot = entityManager.find(Idiot.class, id);
		if (idiot!=null)
			entityManager.remove(idiot);
	}
}
