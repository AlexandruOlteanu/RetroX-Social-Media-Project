package com.retrox.service;

import com.retrox.api.domain.request.LoginRequest;
import com.retrox.api.domain.response.LoginResponse;

public interface LoginService {

    LoginResponse login(LoginRequest request);
}
