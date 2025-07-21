package com.example.personalinfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents personal information for an individual.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfo {
    /** Full name of the person */
    private String name;
    /** Email address */
    private String email;
    /** Phone number */
    private String phone;
    /** Physical address */
    private String address;
} 