package movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    private Movie findByFragment(String fragment){
        Optional<Movie> search = movies.stream().filter(movie -> movie.getName().contains(fragment)).findFirst();
        if (search.isEmpty()){
            throw new IllegalArgumentException("Movie not found");
        }
        return search.get();
    }

}
