package com.tk.exam1.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tk.exam1.mapper.FilmMapper;
import com.tk.exam1.model.Film;
import com.tk.exam1.model.Page;
import com.tk.exam1.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    private Logger logger=LoggerFactory.getLogger(FilmServiceImpl.class);
    @Autowired
    FilmMapper filmMapper;
    @Override
    public void createFilm(Film film) {
        filmMapper.createFilm(film);
    }

    @Override
    public List<Film> queryFilms(Page page) {
        PageHelper.startPage(page.getPage(),page.getPageSize(),page.getSort());
        List<Film> filmList = filmMapper.queryFilms();
        PageInfo<Film> pageInfo = new PageInfo<>(filmList);
        List<Film> list = pageInfo.getList();
        if(list!=null){
            logger.info("查询结果为："+list.toString());
        }
        return list;
    }
}
