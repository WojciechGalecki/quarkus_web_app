package wg.app.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import wg.app.model.Film;
import wg.app.repository.FilmRepository;

@Path("/films")
public class FilmController {

    @Inject
    private FilmRepository filmRepository;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Film getFilm(@PathParam("id") Short id) {
        return filmRepository.getFilm(id)
            .orElseThrow();
    }
}
