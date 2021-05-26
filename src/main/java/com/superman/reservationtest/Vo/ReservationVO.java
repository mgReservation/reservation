package com.superman.reservationtest.Vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationVO {

  private final List<SeatVO> sertVOList = new ArrayList<>();
  private Long userId;
  private Long runningTimeId;
}
