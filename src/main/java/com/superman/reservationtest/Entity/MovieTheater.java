package com.superman.reservationtest.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieTheater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieTheaterId;

    @Column
    private Long name;

    @OneToMany(mappedBy = "movieTheater", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private final List<Theater> theaterList = new ArrayList<>();
}
