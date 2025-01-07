package com.example.task.Entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
public class StoreEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private String phone;

    @NotNull
    @Column(unique = true)
    private String email;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    // Getters and Setters
}
