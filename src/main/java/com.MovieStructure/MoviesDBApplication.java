package com.MovieStructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

//@EnableSwagger2<dependency>
//   <groupId>mysql</groupId>
//   <artifactId>mysql-connector-java</artifactId>
//   <scope>runtime</scope>
//</dependency>

@Service
@SpringBootApplication
@RestController
@CrossOrigin
@RequestMapping("/myNetflix")
public class MoviesDBApplication {

    @Autowired
    private MovieRepository movieRepository;

    public static void main(String[] args) {
        SpringApplication.run(MoviesDBApplication.class, args);
    }

    @GetMapping("/movies")
    public @ResponseBody
    Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/movies/{film_id}")
    public @ResponseBody
    Movie getMovie (@PathVariable int film_id) {
        return movieRepository.findById(film_id).orElse(null);
    }

    @PostMapping(path="/addmovie", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Movie> addAMovie(@RequestBody Movie newMovie){
        Movie savedMovie = new Movie(newMovie.getFilm_id(),newMovie.getTitle(), newMovie.getDescription(), newMovie.getLength(), newMovie.getLanguage_id());
        movieRepository.save(savedMovie);
        return new ResponseEntity<Movie>(savedMovie, HttpStatus.OK);}

    @DeleteMapping("/deletemovie/{film_id}")
    public String deleteMovie(@PathVariable("film_id") int film_id){
        movieRepository.deleteById(film_id);
        return "Movie successfully deleted";
    }

    @PutMapping("/updatemovie")
    public @ResponseBody String updateAMovie(@RequestParam int film_id, @RequestParam String description) {
        Movie updatedMovie = movieRepository.findById(film_id).orElse(null);
        assert updatedMovie != null;
        updatedMovie.setDescription(description);
        movieRepository.save(updatedMovie);
        return "Movie description updated";
    }


}
