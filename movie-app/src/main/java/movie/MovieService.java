package movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public Optional<Movie> findNewestByRelease() {
        return movies.stream().max(Comparator.comparing(Movie::getReleaseDate));
    }
}
