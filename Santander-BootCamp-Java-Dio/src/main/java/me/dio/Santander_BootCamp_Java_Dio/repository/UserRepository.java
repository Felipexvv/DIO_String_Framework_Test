package me.dio.Santander_BootCamp_Java_Dio.repository;

import me.dio.Santander_BootCamp_Java_Dio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
