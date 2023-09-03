package org.example.testing.movies.service.data;

import org.example.testing.movies.model.Movie;

import java.util.List;

public interface MovieRepository {

    Movie findById(long id);
    List<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
