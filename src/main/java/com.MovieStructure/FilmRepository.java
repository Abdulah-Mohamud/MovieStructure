package com.MovieStructure;

import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository <Film, Integer> {
}