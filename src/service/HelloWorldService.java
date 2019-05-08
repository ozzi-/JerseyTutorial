package service;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/sayhello")
public class HelloWorldService {

    @GET
    public Response sayHello() {
        String output = "Hello World!";
        return Response.status(200).entity(output).build();
    }

}