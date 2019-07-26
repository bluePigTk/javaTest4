package com.tk.exam1.service;

import com.tk.exam1.model.Film;
import com.tk.exam1.model.Page;

import java.util.List;

public interface FilmService {
    void createFilm(Film film);
    List<Film> queryFilms(Page page);
}
