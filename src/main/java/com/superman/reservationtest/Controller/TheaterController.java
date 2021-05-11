package com.superman.reservationtest.Controller;

import javax.websocket.server.PathParam;

import com.superman.reservationtest.Entity.Theater;
import com.superman.reservationtest.Service.TheaterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/theater")
public class TheaterController {
    private final TheaterService theaterService;

    @Autowired
    TheaterController(TheaterService theaterService){
        this.theaterService = theaterService;
    }

    @GetMapping(value="")
    public String save(@PathParam(value = "name") String name){
        Theater theater = new Theater();
        return theaterService.save(theater);
    }

    @GetMapping(value="/remove/{name}")
    public String remove(@PathVariable String name){
        return theaterService.remove(name);
    }
}
