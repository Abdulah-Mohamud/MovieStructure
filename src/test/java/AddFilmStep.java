import com.MovieStructure.Movie;
import com.MovieStructure.MovieRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFilmStep {

    private MovieRepository movieRepository;
    private Movie newMovie;

    @Given("that there are no duplicates")
    public void thatThereAreNoDuplicates() {
        newMovie = new Movie(1, "Film1", "Film Description", 60, 1);
    }


    @When("I add the film to the database")
    public void iAddTheFilmToTheDatabase() {
        movieRepository.save(newMovie);
    }

    @Then("return film added successfully")
    public void returnFilmAddedSuccessfully() {
        assertEquals(movieRepository.findById(newMovie.getFilm_id()), newMovie);
    }
}
