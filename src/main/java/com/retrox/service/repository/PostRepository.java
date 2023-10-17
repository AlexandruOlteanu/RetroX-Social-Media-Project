package com.retrox.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.retrox.service.domain.Post;

public interface PostRepository  extends  JpaRepository<Post, Integer>{

}
