package com.superman.reservationtest.Controller;

import javax.websocket.server.PathParam;

import com.superman.reservationtest.Entity.MovieTheater;
import com.superman.reservationtest.Service.MovieTheaterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movieTheater")
public class MovieTheaterController {
    private final MovieTheaterService movieTheaterService;

    @Autowired
    MovieTheaterController(MovieTheaterService movieTheaterService){
        this.movieTheaterService = movieTheaterService;
    }

    @GetMapping(value="")
    public String save(@PathParam(value = "name") String name){
        MovieTheater movieTheater = new MovieTheater();
        return movieTheaterService.save(movieTheater);
    }

    @GetMapping(value="/remove/{name}")
    public String remove(@PathVariable String name){
        return movieTheaterService.remove(name);
    }
    
    @GetMapping(value="/find/{name}")
    public MovieTheater find(@PathVariable String name){
        return movieTheaterService.find(name);
    }
}
