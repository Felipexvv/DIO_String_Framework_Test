package me.dio.Santander_BootCamp_Java_Dio.domain.repository;

import me.dio.Santander_BootCamp_Java_Dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
