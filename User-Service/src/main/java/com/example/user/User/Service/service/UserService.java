package com.example.user.User.Service.service;

import com.example.user.User.Service.client.TestServiceClient;
import com.example.user.User.Service.dto.UserDto;
import com.example.user.User.Service.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.user.User.Service.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final TestServiceClient testServiceClient;


    public ResponseEntity<UserDto> saveUser(UserDto userDto) {
        UserEntity  userEntity = new UserEntity();
        userEntity.setName(userDto.getName());
        userEntity.setEmail(userDto.getEmail());
        userRepository.save(userEntity);
        return ResponseEntity.ok(userDto);
    }

    public String test() {
        return testServiceClient.getHelloFromTestService();
    }
}
