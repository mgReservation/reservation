package com.superman.reservationtest.Repository;

import java.util.Optional;

import com.superman.reservationtest.Entity.MovieTheater;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieTheaterRepository extends JpaRepository<MovieTheater, Long>{
    Optional<MovieTheater> deleteByName(String name);
    Optional<MovieTheater> findByNameContaining(String name);

}
