package com.retrox.api.domain.request;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

@Data
@Jacksonized
@Builder
public class PostRequest {

    @NotNull
    private String username;
    @NotNull
    private String contentUrl;
    private String description;
    private Date date;

}