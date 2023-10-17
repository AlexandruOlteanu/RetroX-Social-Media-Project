package com.retrox.service.web;

import com.retrox.api.RetroXService;
import com.retrox.api.domain.request.LoginRequest;
import com.retrox.api.domain.request.PostRequest;
import com.retrox.api.domain.request.RegisterRequest;
import com.retrox.api.domain.response.LoginResponse;
import com.retrox.service.LoginService;
import com.retrox.service.PostService;
import com.retrox.service.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RetroXController implements RetroXService {

    private final LoginService loginService;
    private final RegisterService registerService;
    private final PostService postService;

    @Override
    public ResponseEntity<LoginResponse> login(LoginRequest request) {
        return ResponseEntity.ok(loginService.login(request));
    }

    @Override
    public void register(RegisterRequest request) {
        registerService.register(request);
    }

    @Override
    public void post(PostRequest request) {
        postService.post(request);
    }


}
