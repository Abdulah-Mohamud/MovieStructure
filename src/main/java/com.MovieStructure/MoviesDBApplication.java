package com.MovieStructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
@RequestMapping("/myNetflix")
public class MoviesDBApplication {

    @Autowired
    private FilmRepository filmRepository;

    public static void main(String[] args) {
        SpringApplication.run(MoviesDBApplication.class, args);
    }

    @GetMapping("/films")
    public @ResponseBody
    Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @PostMapping("/addFilm")
    public @ResponseBody
    String newFilm(int film_id, String title,
            String description, int length, String rating) {
        Film savedFilm = new Film(film_id,title,description,length,rating);
        filmRepository.save(savedFilm);
        return "Film Added Successfully";
    }

//    @DeleteMapping("/deleteFilm{film_id")
//    public String deleteFilm(@PathVariable("film_id") int film_id){
//        filmRepository.deleteById(film_id);
//        return "Film successfully deleted";
//    }
}
