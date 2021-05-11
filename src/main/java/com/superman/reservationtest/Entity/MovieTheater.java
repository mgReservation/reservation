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
public class MovieTheater {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieTheaterId;

    @Column
    private Long name;

    @OneToMany(mappedBy = "movieTheater")
    private final List<Theater> theaterList = new ArrayList<>();
}
