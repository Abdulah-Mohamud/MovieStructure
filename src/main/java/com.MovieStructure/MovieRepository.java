package com.MovieStructure;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository <Movie, Integer> {
}