package com.abdo.moviesms.Services;

import com.abdo.moviesms.Entities.Film;
import com.abdo.moviesms.Repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public List<Film> searchFilms(String keyword) {
        List<Film> films = new ArrayList<>();
        films.addAll(filmRepository.findByTitleContainingIgnoreCase(keyword));
        films.addAll(filmRepository.findByGenresContainingIgnoreCase(keyword));
        films.addAll(filmRepository.findByCountriesContainingIgnoreCase(keyword));
        films.addAll(filmRepository.findByLanguagesContainingIgnoreCase(keyword));
        return films;
    }

    public List<Film> getFilmsByReleaseYear(int releaseYear) {
        return filmRepository.findByReleaseYearGreaterThanEqual(releaseYear);
    }

    public Film getFilmById(String id) {
        return filmRepository.findById(id).get();
    }

    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    public void deleteFilm(String id) {
        Film film = getFilmById(id);
        filmRepository.delete(film);
    }

    public Film updateFilm(String id, Film film) {
        Film existingFilm = getFilmById(id);
        existingFilm.setTitle(film.getTitle());
        existingFilm.setDescription(film.getDescription());
        existingFilm.setRating(film.getRating());
        existingFilm.setGenres(film.getGenres());
        existingFilm.setReleaseYear(film.getReleaseYear());
        existingFilm.setCountries(film.getCountries());
        existingFilm.setLanguages(film.getLanguages());
        existingFilm.setVideoUrl(film.getVideoUrl());
        existingFilm.setViews(film.getViews());
        existingFilm.setComments(film.getComments());
        return filmRepository.save(existingFilm);
    }
}

