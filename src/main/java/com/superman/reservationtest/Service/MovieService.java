package com.superman.reservationtest.Service;

import com.superman.reservationtest.Entity.Movie;
import com.superman.reservationtest.Repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public String save(Movie movie){
        movieRepository.save(movie);

        return "success";
    }

    public String remove(String name){
        movieRepository.deleteByName(name);

        return "success";
    }

    public Movie find(String name){
        Movie movie = movieRepository.findByNameContaining(name).orElseGet(null);
        movie.getRunningTimeList();

        return movie;
    }
}
