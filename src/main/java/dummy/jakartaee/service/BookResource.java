package dummy.jakartaee.service;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.*;
import static javax.ws.rs.core.Response.ok;

import dummy.jakartaee.library.BookBean;

@Path("/books/")
@RequestScoped
public class BookResource {
	@Inject
	private BookBean bookBean;
	
	@GET
	@Path("/")
	@Produces(APPLICATION_JSON)
	public Response  getBooks() {
		return ok(bookBean.getBooks()).build();
		// return ok("getting books").build(); 
	}
}
