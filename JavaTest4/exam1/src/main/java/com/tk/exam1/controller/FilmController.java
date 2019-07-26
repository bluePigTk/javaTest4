package com.tk.exam1.controller;

import com.github.pagehelper.PageHelper;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.tk.exam1.model.Film;
import com.tk.exam1.model.Page;
import com.tk.exam1.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    FilmService filmService;
    @PostMapping("/create")
    public ResponseEntity<String> createFilm(@RequestBody Film film){
        try {
                filmService.createFilm(film);
            return new ResponseEntity<String>("保存成功",HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("出异常了",HttpStatus.EXPECTATION_FAILED);
        }
    }
    @PostMapping("/")
    public List<Film> list(@RequestBody Page page){
        System.out.println(page);
        List<Film> list= filmService.queryFilms(page);

              return list;

    }
}
