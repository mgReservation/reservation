package com.superman.reservationtest.Repository;

import com.superman.reservationtest.Entity.RunningTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunningTimeRepository extends JpaRepository<RunningTime, Long>{

}
