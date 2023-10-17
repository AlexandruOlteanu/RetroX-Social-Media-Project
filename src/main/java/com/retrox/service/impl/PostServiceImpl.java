package com.retrox.service.impl;

import com.retrox.api.domain.request.PostRequest;
import com.retrox.service.PostService;
import com.retrox.service.domain.Post;
import com.retrox.service.domain.User;
import com.retrox.service.repository.PostRepository;
import com.retrox.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostServiceImpl implements PostService {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Override
    public void post(PostRequest request) {
        Post post = new Post();
        User user = userRepository.findUserByUsername(request.getUsername());
        post.setUser(user);
        post.setDescription(request.getDescription());
        post.setContentUrl(request.getContentUrl());

        // TODO
        //post.setDate();

        postRepository.save(post);
    }
}
