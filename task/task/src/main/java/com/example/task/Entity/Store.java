package com.example.task.Entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String name;

    @NotNull
    private String address;

    @NotNull
    private String state;

    @NotNull
    private String city;

    @NotNull
    private String pincode;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    // Getters and Setters
}
