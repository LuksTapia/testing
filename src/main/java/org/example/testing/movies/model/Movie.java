package org.example.testing.movies.model;

public class Movie {

    private Integer id;
    private String nombre;
    private int minutes;
    private Genre genre;

    public Movie(Integer id, String nombre, int minutes, Genre genre) {
        setId(id);
        setNombre(nombre);
        setMinutes(minutes);
        setGenre(genre);
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutes() {
        return minutes;
    }

    private void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Genre getGenre() {
        return genre;
    }

    private void setGenre(Genre genre) {
        this.genre = genre;
    }
}
