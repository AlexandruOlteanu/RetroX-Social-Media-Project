package com.retrox.api.domain.response;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Jacksonized
@Builder
public class LoginResponse {
    private String message;
    private String permissions;
    private String username;
    private Integer uniqueId;
}
