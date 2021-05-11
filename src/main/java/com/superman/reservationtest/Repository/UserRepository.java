package com.superman.reservationtest.Repository;

import java.util.Optional;

import com.superman.reservationtest.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findOneByNameAndPhone(String name, String phone);
}
