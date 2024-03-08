package com.example.ninjacookerbackend.models.entity;

import com.example.ninjacookerbackend.models.enums.Sex;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    @Column(columnDefinition = "boolean default true")
    private boolean isFirstLogin;

    @Column(columnDefinition = "TEXT", updatable = false)
    private String verificationCode;

    @Column(columnDefinition = "boolean default false")
    private boolean isValidate;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<UserRoleEntity> roles = new ArrayList<>();

}
