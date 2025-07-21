package com.example.personalinfo.service;

import com.example.personalinfo.model.PersonalInfo;
import com.example.personalinfo.repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Service layer for handling business logic related to PersonalInfo.
 */
@Service
public class PersonalInfoService {
    private final PersonalInfoRepository repository;

    @Autowired
    public PersonalInfoService(PersonalInfoRepository repository) {
        this.repository = repository;
    }

    /**
     * Save or update personal information.
     * @param info PersonalInfo object
     * @return Mono of saved PersonalInfo
     */
    public Mono<PersonalInfo> save(PersonalInfo info) {
        return Mono.just(repository.save(info));
    }

    /**
     * Find personal information by email.
     * @param email Email address
     * @return Mono of PersonalInfo or empty if not found
     */
    public Mono<PersonalInfo> findByEmail(String email) {
        PersonalInfo info = repository.findByEmail(email);
        return info != null ? Mono.just(info) : Mono.empty();
    }

    /**
     * Get all personal information records.
     * @return Flux of PersonalInfo
     */
    public Flux<PersonalInfo> findAll() {
        return Flux.fromIterable(repository.findAll());
    }

    /**
     * Delete personal information by email.
     * @param email Email address
     * @return Mono of removed PersonalInfo or empty if not found
     */
    public Mono<PersonalInfo> deleteByEmail(String email) {
        PersonalInfo removed = repository.deleteByEmail(email);
        return removed != null ? Mono.just(removed) : Mono.empty();
    }
} 