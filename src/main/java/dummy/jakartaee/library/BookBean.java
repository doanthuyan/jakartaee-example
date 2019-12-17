package dummy.jakartaee.library;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("bookBean")
@RequestScoped
public class BookBean implements Serializable{
	@Inject
	private BookEjb bookEjb;
	public List<BookEntity> getBooks(){
		return  bookEjb.getBooks();
	}
}
