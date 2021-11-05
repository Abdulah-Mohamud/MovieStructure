package com.MovieStructure.MovieStructure;

import com.MovieStructure.Movie;
import com.MovieStructure.MovieRepository;
import static org.junit.jupiter.api.Assertions.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class AddFilmTest {

    @Autowired
    private MovieRepository movieRepository;
    private Movie newMovie;

    @Given("that there are no duplicates")
    public void checkForDuplicate() {
        newMovie = new Movie(1, "Film1", "Film Description", 60, "PG", 1);
        movieRepository.save(newMovie);
    }

    @When("I add the film to the database")
    public void iAddTheTitleToTheDatabase() {
        movieRepository.save(newMovie);
    }

    @Then("return film added successfully")
    public void messageShouldAppearSayingTitleAddedSuccessfuly() {
        assertEquals(movieRepository.findById(newMovie.getFilm_id()), newMovie);
    }

    @When("there is a duplicate film")
    public void thereIsADuplicateFilm() {

    }

    @Then("return duplicate film found")
    public void returnDuplicateFilmFound() {
    }
}


