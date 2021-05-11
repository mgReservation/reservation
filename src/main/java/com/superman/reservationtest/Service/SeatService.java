package com.superman.reservationtest.Service;

import com.superman.reservationtest.Entity.Seat;
import com.superman.reservationtest.Repository.SeatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    private final SeatRepository seatRepository;

    @Autowired
    SeatService(SeatRepository seatRepository){
        this.seatRepository = seatRepository;
    }

    public String save(Seat seat){
        seatRepository.save(seat);

        return "success";
    }

    public String remove(Long id){
        seatRepository.deleteById(id);

        return "success";
    }
}
