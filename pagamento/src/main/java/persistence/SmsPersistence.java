package persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import model.Sms;

@Repository
public class SmsPersistence {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Sms sms){
		this.entityManager.persist(sms);
	}
	
	

}
