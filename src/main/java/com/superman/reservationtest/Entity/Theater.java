package com.superman.reservationtest.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;

@Entity
@Getter
public class Theater {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theaterId;

    @ManyToOne
    @JoinColumn(name = "movieTheaterId")
    private MovieTheater movieTheater;

    @Column
    private String name;

    @OneToMany(mappedBy = "theater")
    private final List<Seat> seatList = new ArrayList<>();

    @OneToMany(mappedBy = "theater")
    private final List<RunningTime> runningTimeList = new ArrayList<>();
}
