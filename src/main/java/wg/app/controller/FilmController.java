package wg.app.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class FilmController {

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String x() {
        return "hello";
    }
}