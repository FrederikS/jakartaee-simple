package codes.fdk.samples.jakartaee;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("foo")
@ApplicationScoped
public class FooResource {

	@Inject
	private FooRepository fooRepository;

	@GET
	@Path("/{id}")
	public Response foo(@PathParam("id") String id) {
		return fooRepository.findById(id)
							.map(foo -> Response.ok(foo).build())
							.orElse(Response.status(NOT_FOUND).build());
	}

}
