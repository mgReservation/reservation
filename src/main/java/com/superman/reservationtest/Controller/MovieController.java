package com.superman.reservationtest.Controller;

import javax.websocket.server.PathParam;

import com.superman.reservationtest.Entity.Movie;
import com.superman.reservationtest.Service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/movie")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping(value="")
    public String save(@PathParam(value = "name") String name){
        Movie movie = new Movie();
        return movieService.save(movie);
    }

    @GetMapping(value="/remove/{name}")
    public String remove(@PathVariable String name){
        return movieService.remove(name);
    }
    
    @GetMapping(value="/find/{name}")
    public Movie find(@PathVariable String name){
        return movieService.find(name);
    }
}
