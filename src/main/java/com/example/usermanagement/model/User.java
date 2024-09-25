package com.example.usermanagement.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String fullName;
    private String mobNum;
    private String panNum;
    private UUID managerId;
    private boolean isActive = true;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Getters and Setters
}
