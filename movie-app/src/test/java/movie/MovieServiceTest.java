package movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {


    MovieService movieService;
    Movie movie1;
    Movie movie2;

    @BeforeEach
    void setUp() {
        movieService = new MovieService();
        movie1 = new Movie("film",12, LocalDate.of(2020,1,1));
        movie2 = new Movie("film2",120, LocalDate.of(2020,3,1));
        movieService.save(movie1);
        movieService.save(movie2);
    }

    @Test
    void saveTest() {
        movieService.save(movie1);
        assertEquals("film", movieService.getMovies().get(0).getName());
    }

    @Test
    void findNewestByReleaseTest() {
        movieService.save(movie1);
        movieService.save(movie2);
        assertEquals("film2", movieService.findNewestByRelease().get().getName());


    }

    @Test
    void findByFragment() {
        Movie result = movieService.findByFragment("2");
        assertEquals("film2",result.getName());
    }

    @Test
    void findByFragmentThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()->movieService.findByFragment("sorozat"));
        assertEquals("Movie not found" ,ex.getMessage());
    }



}