package com.FilmStructure;

import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository <Film, Integer> {
}