package com.retrox.service.web;

import com.retrox.api.RetroXService;
import com.retrox.api.domain.request.LoginRequest;
import com.retrox.api.domain.request.RegisterRequest;
import com.retrox.api.domain.response.LoginResponse;
import com.retrox.service.domain.User;
import com.retrox.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RetroXController implements RetroXService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<LoginResponse> login(LoginRequest request) {

        User user = userRepository.findUserByUsername(request.getUsername());

        return ResponseEntity.ok(LoginResponse.builder().build());
    }

    @Override
    public void register(RegisterRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setSurname(request.getSurname());
        user.setAge(request.getAge());
        user.setUsername(request.getUsername());
        user.setDescription(request.getDescription());
        userRepository.save(user);
    }
}
