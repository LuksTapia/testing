package org.example.testing.movies.service;

import org.example.testing.movies.model.Genre;
import org.example.testing.movies.model.Movie;
import org.example.testing.movies.data.MovieRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieServices {

    private MovieRepository movieRepository;

    public MovieServices(MovieRepository movieRepository) {
        setMovieRepository(movieRepository);
    }
    private void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findMoviesByGenre(Genre comedy) {

        List<Movie> allMovies = movieRepository.findAll();
        List<Movie> moviesByGenre = allMovies.stream()
                .filter(movie -> isGenre(movie, comedy))
                .collect(Collectors.toList());
        return moviesByGenre;

    }
    private boolean isGenre(Movie actual, Genre genre) {
        return actual.getGenre() == genre;
    }

    //Using filter to practice
    private List<Movie> findMoviesByLength(int duration) {

        List<Movie> moviesByLength = movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() > duration)
                .collect(Collectors.toList());
        return moviesByLength;
    }

    //Using Iterator to practice.
    public List<Integer> idsPelis(int duration) {

        List<Integer> integers = new ArrayList<>();
        Iterator<Movie> movieIterator = findMoviesByLength(duration).iterator();

        while(movieIterator.hasNext()) {
            Movie movie = movieIterator.next();
            integers.add(movie.getId());
        }
        return integers;
    }
}
