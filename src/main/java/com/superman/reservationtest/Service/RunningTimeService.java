package com.superman.reservationtest.Service;

import com.superman.reservationtest.Entity.RunningTime;
import com.superman.reservationtest.Repository.RunningTimeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunningTimeService {
    private final RunningTimeRepository runningTimeRepository;

    @Autowired
    RunningTimeService(RunningTimeRepository runningTimeRepository){
        this.runningTimeRepository = runningTimeRepository;
    }

    public String save(RunningTime runningTime){
        runningTimeRepository.save(runningTime);

        return "success";
    }

    public String remove(Long id){
        runningTimeRepository.deleteById(id);

        return "success";
    }
}
