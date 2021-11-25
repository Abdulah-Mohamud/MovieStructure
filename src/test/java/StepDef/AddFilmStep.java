package StepDef;

import com.MovieStructure.MovieStructure.Movie;
import com.MovieStructure.MovieStructure.MovieRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@SpringBootApplication

public class AddFilmStep {


    @Autowired
    private MovieRepository movieRepository;
    private Movie testMovie;


    @Given("I want to add a new film")
    public void iWantToAddANewFilm() {
        Movie testMovie = new Movie("Test movie title", "Test movie description", 33, 1);
        movieRepository.save(testMovie);
    }

    @When("I add the film to the database")
    public void iAddTheFilmToTheDatabase() {
        movieRepository.save(testMovie);
    }
}

//    @Then("return film added successfully")
//    public void returnFilmAddedSuccessfully() {
//        assertEquals(movieRepository.findById(testMovie.getFilm_id()), testMovie , "Film added Successfully");
//    }


//    @When("there is a duplicate film")
//    public void thereIsADuplicateFilm() {
//    }
//
//    @Then("return duplicate film found")
//    public void returnDuplicateFilmFound() {
//    }
//}
