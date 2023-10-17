package com.retrox.service.mapper;

import com.retrox.service.domain.Post;
import com.retrox.service.dto.PostDTO;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public PostDTO mapPost(Post post) {
        return PostDTO.builder()
                .postId(post.getPostId())
                .contentUrl(post.getContentUrl())
                .description(post.getDescription())
                .date(post.getDate())
                .username(post.getUser().getUsername())
                .build();
    }
}
