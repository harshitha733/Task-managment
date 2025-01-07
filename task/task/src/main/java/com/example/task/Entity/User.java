package com.example.task.Entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private String phone;

    @Enumerated(EnumType.STRING)
    private Role role;

    private LocalDate createdDate;

    private LocalDate updatedDate;
    // Getters and Setters

    public enum Role {
        ADMIN, MANAGER, STOREEMPLOYEE
    }
}
