package com.example.task.Entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
public class Task {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        private String taskName;

        @NotNull
        private String taskDescription;

        private LocalDate createdDate;

        private LocalDate updatedDate;

        private LocalDate expectedCompletionDate;

        @ManyToOne
        @JoinColumn(name = "storeId", nullable = false)
        private Store store;

        @ManyToOne
        @JoinColumn(name = "assignedEmployeeId", nullable = false)
        private StoreEmployee assignedEmployee;

        // Getters and Setters
    }

