package com.superman.reservationtest.Controller;

import javax.websocket.server.PathParam;

import com.superman.reservationtest.Entity.Seat;
import com.superman.reservationtest.Service.SeatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/seat")
public class SeatController {
    private final SeatService seatService;

    @Autowired
    SeatController(SeatService seatService){
        this.seatService = seatService;
    }

    @GetMapping(value="")
    public String save(@PathParam(value = "name") String name){
        Seat seat = new Seat();
        return seatService.save(seat);
    }

    @GetMapping(value="/remove/{name}")
    public String remove(@PathVariable Long id){
        return seatService.remove(id);
    }
}
