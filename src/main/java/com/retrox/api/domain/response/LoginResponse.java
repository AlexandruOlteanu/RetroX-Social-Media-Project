package com.retrox.api.domain.response;

import com.retrox.service.domain.Post;
import com.retrox.service.dto.PostDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Jacksonized
@Builder
public class LoginResponse {
    private String username;
    private String name;
    private String surname;
    private String message;
    private String permissions;
    private List<PostDTO> posts;
    private Integer age;
    private String description;
}
