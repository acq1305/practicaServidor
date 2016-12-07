package servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import datos.Status;

@Path("/rest")
public class HealthResource {

    @GET
    @Path("/estado")
    @Produces(MediaType.APPLICATION_JSON)
    public Status health() {
        return new Status();
    }
}
