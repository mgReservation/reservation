package com.superman.reservationtest.Repository;

import java.util.Optional;

import com.superman.reservationtest.Entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> deleteByName(String name);
    Optional<Movie> findByNameContaining(String name);
}
