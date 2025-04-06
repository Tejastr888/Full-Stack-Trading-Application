package com.chaos.fullstacktradingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String mobileNumber;
    private String firstName;
    private String lastName;   
    private String status;
    private String isVerified;
    private String twoFactorAuth_enabled;
    private String picture;
    private String role;
}
