package com.superman.reservationtest.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;

@Entity
@Getter
public class RunningTime {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long runningTimeId;

    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theaterId")
    private Theater theater;

    @Column
    private LocalDateTime startTime;
}
