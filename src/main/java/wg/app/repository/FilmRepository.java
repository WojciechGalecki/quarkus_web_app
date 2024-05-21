package wg.app.repository;

import java.util.Optional;

import com.speedment.jpastreamer.application.JPAStreamer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import wg.app.model.Film;
import wg.app.model.Film$;

@ApplicationScoped
public class FilmRepository {

    @Inject
    private JPAStreamer jpaStreamer;

    public Optional<Film> getFilm(Short filmId) {
        return jpaStreamer.stream(Film.class)
            .filter(Film$.filmId.equal(filmId))
            .findFirst();
    }
}
