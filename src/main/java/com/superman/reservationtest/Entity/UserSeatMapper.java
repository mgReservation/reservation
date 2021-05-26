package com.superman.reservationtest.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class UserSeatMapper {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userSeatMapperId;

  @OneToMany(mappedBy = "userSeatMapper", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  private final List<Seat> seatList = new ArrayList<>();

  @ManyToOne
  @JoinColumn(name = "userId")
  private User user;
}
