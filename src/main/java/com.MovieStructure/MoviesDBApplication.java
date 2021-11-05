package com.MovieStructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

//@EnableSwagger2
@SpringBootApplication
@RestController
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

    @PostMapping("/addmovie")
    public @ResponseBody
    String newFilm(@RequestParam int film_id, @RequestParam String title,
                   @RequestParam String description, @RequestParam int length, @RequestParam String rating,
                   @RequestParam int language_id) {
        Movie savedMovie = new Movie(film_id,title,description,length,rating,language_id);
        movieRepository.save(savedMovie);
        return "Film Added Successfully";
    }
//
//    @DeleteMapping("/deleteFilm{film_id")
//    public String deleteFilm(@PathVariable("film_id") int film_id){
//        filmRepository.deleteById(film_id);
//        return "Film successfully deleted";
//    }


}
