package com.retrox.service.web;

import com.retrox.api.RetroXService;
import com.retrox.api.domain.request.LoginRequest;
import com.retrox.api.domain.response.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetroXController implements RetroXService {

    @Override
    public ResponseEntity<LoginResponse> login(LoginRequest request) {

        LoginResponse response = LoginResponse.builder()
                .message("User " + request.getUsername() + " logged in succesfully!")
                .permissions("administrator")
                .uniqueId(1)
                .build();
        return ResponseEntity.ok(response);
    }
}
