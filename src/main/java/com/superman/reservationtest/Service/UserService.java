package com.superman.reservationtest.Service;

import java.util.List;

import com.superman.reservationtest.Entity.RunningTime;
import com.superman.reservationtest.Entity.Seat;
import com.superman.reservationtest.Entity.User;
import com.superman.reservationtest.Entity.UserSeatMapper;
import com.superman.reservationtest.Repository.RunningTimeRepository;
import com.superman.reservationtest.Repository.UserRepository;
import com.superman.reservationtest.Vo.ReservationVO;
import com.superman.reservationtest.Vo.SeatVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;
  private final RunningTimeRepository runningTimeRepository;

  @Autowired
  UserService(UserRepository userRepository, RunningTimeRepository runningTimeRepository) {
    this.userRepository = userRepository;
    this.runningTimeRepository = runningTimeRepository;
  }

  public String save(User user) {
    userRepository.save(user);

    return "Success";
  }

  public String remove(Long id) {
    userRepository.deleteById(id);

    return "Success";
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User find(Long id) {
    User user = userRepository.findById(id).orElseGet(null);
    user.getUserSeatMapperList();
    return user;
  }

  public String reservation(ReservationVO reservationVO){

    User user = userRepository.findById(reservationVO.getUserId()).orElseThrow(() -> new NullPointerException());
    RunningTime runningTime = runningTimeRepository.findById(reservationVO.getRunningTimeId()).orElseThrow(() -> new NullPointerException());

    user.getUserSeatMapperList().add(UserSeatMapper.builder().user(user).build());

    for(SeatVO s : reservationVO.getSertVOList()){
      user.getLastMapper().getSeatList().add(Seat.builder().userSeatMapper(user.getLastMapper()).theater(runningTime.getTheater()).seatColumn(s.getSeatColumn()).seatRow(s.getSeatRow()).build());
    }

    userRepository.save(user);

    return "Success";
  }
}
