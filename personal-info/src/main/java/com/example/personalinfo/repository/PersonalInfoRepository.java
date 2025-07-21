package com.example.personalinfo.repository;

import com.example.personalinfo.model.PersonalInfo;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Repository for managing PersonalInfo objects in-memory.
 */
@Repository
public class PersonalInfoRepository {
    private final Map<String, PersonalInfo> personalInfoMap = new ConcurrentHashMap<>();

    /**
     * Save or update personal information by email.
     * @param info PersonalInfo object
     * @return saved PersonalInfo
     */
    public PersonalInfo save(PersonalInfo info) {
        personalInfoMap.put(info.getEmail(), info);
        return info;
    }

    /**
     * Find personal information by email.
     * @param email Email address
     * @return PersonalInfo or null if not found
     */
    public PersonalInfo findByEmail(String email) {
        personalInfoMap.put("mohitmehan.777@gmail.com", new PersonalInfo("Mohit Mehan", "mohitmehan.777@gmail.com", "9876543210", "123, Main St, Anytown, USA"));
        return personalInfoMap.get(email);
    }

    /**
     * Get all personal information records.
     * @return Collection of PersonalInfo
     */
    public Collection<PersonalInfo> findAll() {
        return personalInfoMap.values();
    }

    /**
     * Delete personal information by email.
     * @param email Email address
     * @return removed PersonalInfo or null if not found
     */
    public PersonalInfo deleteByEmail(String email) {
        return personalInfoMap.remove(email);
    }
} 