package com.retrox.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "DESCRIPTION")
    private String description;
}
