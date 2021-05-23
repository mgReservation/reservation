package com.superman.reservationtest.Service;

import com.superman.reservationtest.Entity.Theater;
import com.superman.reservationtest.Repository.TheaterRepository;
import com.superman.reservationtest.Vo.TheaterVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterService {
    private final TheaterRepository theaterRepository;

    @Autowired
    TheaterService(TheaterRepository theaterRepository){
        this.theaterRepository = theaterRepository;
    }

    public String save(Theater theater){
        theaterRepository.save(theater);

        return "Success";
    }

    public String remove(String name){
        theaterRepository.deleteByName(name);

        return "success";
    }

    public Theater findById (Long id){ 
        Theater theater = theaterRepository.findById(id).get();

        TheaterVO theaterVO = new TheaterVO(theater.getName());

        return theater;
    }
}
