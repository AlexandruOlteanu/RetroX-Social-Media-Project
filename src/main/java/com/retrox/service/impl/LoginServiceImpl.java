package com.retrox.service.impl;

import com.retrox.api.domain.request.LoginRequest;
import com.retrox.api.domain.response.LoginResponse;
import com.retrox.service.LoginService;
import com.retrox.service.domain.User;
import com.retrox.service.mapper.PostMapper;
import com.retrox.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginServiceImpl implements LoginService {

    private final UserRepository userRepository;
    private final PostMapper postMapper;

    @Override
    public LoginResponse login(LoginRequest request) {
        User user = userRepository.findUserByUsername(request.getUsername());
        return LoginResponse.builder()
                .username(user.getUsername())
                .name(user.getName())
                .surname(user.getSurname())
                .age(user.getAge())
                .description(user.getDescription())
                .posts(user.getPosts().stream()
                        .map(postMapper::mapPost)
                        .collect(Collectors.toList()))
                .build();
    }
}
