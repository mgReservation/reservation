package com.superman.reservationtest.Controller;

import javax.websocket.server.PathParam;

import com.superman.reservationtest.Entity.RunningTime;
import com.superman.reservationtest.Service.RunningTimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/runningTime")
public class RunningTimeController {
    private final RunningTimeService runningTimeService;

    @Autowired
    RunningTimeController(RunningTimeService runningTimeService){
        this.runningTimeService = runningTimeService;
    }
    
    @GetMapping(value="")
    public String save(@PathParam(value = "name") String name){
        RunningTime runningTime = new RunningTime();
        return runningTimeService.save(runningTime);
    }

    @GetMapping(value="/remove/{name}")
    public String remove(@PathVariable Long id){
        return runningTimeService.remove(id);
    }
}
