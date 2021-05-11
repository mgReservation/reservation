package com.superman.reservationtest.Service;

import com.superman.reservationtest.Entity.MovieTheater;
import com.superman.reservationtest.Repository.MovieTheaterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieTheaterService {
    private final MovieTheaterRepository movieTheaterRepository;

    @Autowired
    MovieTheaterService(MovieTheaterRepository movieTheaterRepository){
        this.movieTheaterRepository = movieTheaterRepository;
    }

    public String save(MovieTheater movieTheater){
        movieTheaterRepository.save(movieTheater);

        return "success";
    }

    public String remove(String name){
        movieTheaterRepository.deleteByName(name);

        return "success";
    }

    public MovieTheater find(String name){
        MovieTheater movieTheater = movieTheaterRepository.findByNameContaining(name).orElseGet(null);
        movieTheater.getTheaterList();

        return movieTheater;
    }
}
