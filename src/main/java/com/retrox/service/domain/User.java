package com.retrox.service.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "USERS")
public class User {
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Id
    @Column(name = "USERNAME")
    private String username;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "DESCRIPTION")
    private String description;
}
