package com.superman.reservationtest.Vo;

import lombok.Getter;

@Getter
public class SeatVO {
    Integer seatRow;
    Integer seatColumn;
    Long userId;
    Long theaterId;

    public SeatVO(Integer seatRow, Integer seatColumn, Long userId, Long theaterId) {
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
        this.userId = userId;
        this.theaterId = theaterId;
    }
}
