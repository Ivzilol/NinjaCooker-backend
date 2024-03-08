package com.example.ninjacookerbackend.models.entity;

import com.example.ninjacookerbackend.models.enums.Sex;
import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String authorName;

    @Column
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column
    private Sex sex;

    @Column(columnDefinition = "true")
    private boolean isFirstLogin;

}
