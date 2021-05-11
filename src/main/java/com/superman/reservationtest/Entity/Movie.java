package com.superman.reservationtest.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;

@Entity
@Getter
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @Column
    private String name;

    @Column
    private Integer runtime;

    @Column
    private String content;

    @Column
    private String director;

    @OneToMany(mappedBy = "movie")
    private List<RunningTime> runningTimeList = new ArrayList<>();
}
