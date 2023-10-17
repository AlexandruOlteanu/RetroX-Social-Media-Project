package com.retrox.service.dto;

import com.retrox.service.domain.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

@Data
@Jacksonized
@Builder
public class PostDTO {
    private Integer postId;
    private String contentUrl;
    private Date date;
    private String description;
    private String username;
}
