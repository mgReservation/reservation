package com.superman.reservationtest.Repository;

import com.superman.reservationtest.Entity.Seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>{
    
}
