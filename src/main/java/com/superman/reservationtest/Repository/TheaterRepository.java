package com.superman.reservationtest.Repository;

import java.util.Optional;

import com.superman.reservationtest.Entity.Theater;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long>{
    Optional<Theater> deleteByName(String name);
    Optional<Theater> findByNameContaining(String name);
}
