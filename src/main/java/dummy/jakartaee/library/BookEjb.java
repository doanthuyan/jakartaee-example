package dummy.jakartaee.library;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BookEjb  {
	/**
     * Stores the persistence context.
     */
    @PersistenceContext
    private EntityManager em;
    public List<BookEntity> getBooks(){
    	return em.createQuery("SELECT object (book) FROM BookEntity AS book", BookEntity.class).getResultList();
    }
}
