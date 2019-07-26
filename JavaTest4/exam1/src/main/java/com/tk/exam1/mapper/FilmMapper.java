package com.tk.exam1.mapper;

import com.tk.exam1.model.Film;
import com.tk.exam1.model.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FilmMapper {
    void createFilm(Film film);
    List<Film> queryFilms();
}
