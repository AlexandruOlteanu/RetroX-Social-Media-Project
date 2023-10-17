package com.retrox.service.impl;

import com.retrox.api.domain.request.RegisterRequest;
import com.retrox.service.RegisterService;
import com.retrox.service.domain.User;
import com.retrox.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegisterServiceImpl implements RegisterService {

    private final UserRepository userRepository;

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
