package dao;

import javax.persistence.EntityManager;

import model.Person;
import util.JPAUtil;

public class PersonDAO {
	public static void save(Person person) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		em.close();
	}
}
