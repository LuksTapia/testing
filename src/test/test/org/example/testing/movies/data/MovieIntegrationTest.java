package org.example.testing.movies.data;

import org.example.testing.movies.model.Genre;
import org.example.testing.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class MovieIntegrationTest {

    @Test
    public void load_all_movies() throws SQLException {

        DataSource dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        MovieRepositoryJDBC movieRepositoryJDBC = new MovieRepositoryJDBC(jdbcTemplate);

        List<Movie> movies = movieRepositoryJDBC.findAll();

        assertThat(movies, CoreMatchers.is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        )));


    }
}