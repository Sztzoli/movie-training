package movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {


    MovieService movieService;

    @BeforeEach
    void setUp() {
        movieService = new MovieService();
        Movie movie1 = new Movie("film",12, LocalDate.of(2020,1,1));
        Movie movie2 = new Movie("film2",120, LocalDate.of(2020,3,1));
        movieService.save(movie1);
        movieService.save(movie2);
    }

    @Test
    void findNewestByRelease() {

    }

    @Test
    void findByFragment() {
    }
}