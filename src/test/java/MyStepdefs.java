import com.MovieStructure.Movie;
import com.MovieStructure.MovieRepository;
import io.cucumber.java.en.Given;

public class MyStepdefs {

    private MovieRepository movieRepository;
    private Movie newMovie;

    @Given("that there are no duplicates")
    public void thatThereAreNoDuplicates() {
        newMovie = new Movie(1, "Film1", "Film Description", 60, "PG", 1);
        movieRepository.save(newMovie);
    }
}
