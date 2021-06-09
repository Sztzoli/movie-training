package movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public void save(Movie movie) {
        movies.add(movie);
    }

    public Optional<Movie> findNewestByRelease() {
        return movies.stream().max(Comparator.comparing(Movie::getReleaseDate));
    }

    public Movie findByFragment(String fragment){
        Optional<Movie> search = movies.stream().filter(movie -> movie.getName().contains(fragment)).findFirst();
        if (search.isEmpty()){
            throw new IllegalArgumentException("Movie not found");
        }
        return search.get();
    }

    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }
}
