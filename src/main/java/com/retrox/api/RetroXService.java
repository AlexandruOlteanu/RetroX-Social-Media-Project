package com.retrox.api;

import com.retrox.api.domain.request.LoginRequest;
import com.retrox.api.domain.response.LoginResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public interface RetroXService {

    String MEDIA_TYPE_APPLICATION_JSON = "application/json";
    @PostMapping(value = "/api/retrox/login", consumes = MEDIA_TYPE_APPLICATION_JSON, produces = MEDIA_TYPE_APPLICATION_JSON)
    ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request);

}
