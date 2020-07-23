package codes.fdk.samples.jakartaee;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import java.util.Collection;
import java.util.UUID;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("foo")
@ApplicationScoped
public class FooResource {

	@Inject
	private FooRepository fooRepository;

	@GET
	@Produces(APPLICATION_JSON)
	public Response findAll() {
		Collection<Foo> all = fooRepository.findAll();
		return Response.ok(all).build();
	}

	@GET
	@Path("/{id}")
	@Produces(APPLICATION_JSON)
	public Response findFoo(@PathParam("id") String id) {
		return fooRepository.findById(id)
							.map(foo -> Response.ok(foo).build())
							.orElse(Response.status(NOT_FOUND).build());
	}

	@POST
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	public Response save(@Valid CreateFooRequest createFooRequest) {
		String id = UUID.randomUUID().toString();
		Foo foo = new Foo(id, createFooRequest.getBar());
		fooRepository.save(foo);
		return Response.ok(foo).build();
	}

}
