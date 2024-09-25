package com.example.usermanagement.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID managerId;
    private String name;
    private boolean isActive = true;

    // Getters and Setters
}
