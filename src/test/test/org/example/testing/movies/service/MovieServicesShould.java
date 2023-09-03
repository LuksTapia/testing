package org.example.testing.movies.service;

import org.example.testing.movies.model.Genre;
import org.example.testing.movies.model.Movie;
import org.example.testing.movies.data.MovieRepository;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieServicesShould {

    private MovieRepository movieRepository;
    private MovieServices movieServices;


    @Before
    public void setup() {
        movieRepository = Mockito.mock(MovieRepository.class);
        movieServices = new MovieServices(movieRepository);

    }

    @Before
    public void setup2() {
        Mockito.when(movieRepository.findAll()).thenReturn(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                new Movie(4, "Super 8", 112, Genre.THRILLER),
                new Movie(5, "Scream", 111, Genre.HORROR),
                new Movie(6, "Home Alone", 103, Genre.COMEDY),
                new Movie(7, "Matrix", 136, Genre.ACTION)
        ));
    }

    @Test
    public void return_movies_by_gender() {

        List<Movie> moviesList = movieServices.findMoviesByGenre(Genre.COMEDY);
        List<Integer> moviesIds = getIntegerList(moviesList);
        Assert.assertThat(moviesIds, CoreMatchers.is(Arrays.asList(3,6)));

    }

    private static List<Integer> getIntegerList(List<Movie> moviesList) {
        List<Integer> moviesIds = moviesList.stream().map(Movie::getId).collect(Collectors.toList());
        return moviesIds;
    }

    @Test
    public void return_movies_by_length() {
        //List<Movie> movieList2 = movieServices.findMoviesByLength(125);
        List<Integer> movieIds = movieServices.idsPelis(125);
        Assert.assertThat(movieIds, CoreMatchers.is(Arrays.asList(1,7)));
    }
}