package me.dio.Santander_BootCamp_Java_Dio.service;

import me.dio.Santander_BootCamp_Java_Dio.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
