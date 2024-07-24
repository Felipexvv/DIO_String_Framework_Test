package me.dio.Santander_BootCamp_Java_Dio.service.impl;

import me.dio.Santander_BootCamp_Java_Dio.domain.model.User;
import me.dio.Santander_BootCamp_Java_Dio.domain.repository.UserRepository;
import me.dio.Santander_BootCamp_Java_Dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
          //userToCreate.getId() != null && userRepository.existsById((userToCreate.getId()))
            //throw new IllegalArgumentException("This User ID already exists");
            throw new IllegalArgumentException("This Account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
