package com.example.personalinfo.controller;

import com.example.personalinfo.model.PersonalInfo;
import com.example.personalinfo.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * REST controller for managing personal information using reactive endpoints.
 */
@RestController
@RequestMapping("/api/personal-info")
public class PersonalInfoController {
    private final PersonalInfoService service;

    @Autowired
    public PersonalInfoController(PersonalInfoService service) {
        this.service = service;
    }

    /**
     * Create or update personal information.
     * @param info PersonalInfo object
     * @return Mono of saved PersonalInfo
     */
    @PostMapping
    public Mono<PersonalInfo> save(@RequestBody PersonalInfo info) {
        return service.save(info);
    }

    /**
     * Get personal information by email.
     * @param email Email address
     * @return Mono of PersonalInfo or empty if not found
     */
    @GetMapping("/{email}")
    public Mono<PersonalInfo> getByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    /**
     * Get all personal information records.
     * @return Flux of PersonalInfo
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<PersonalInfo> getAll() {
        return service.findAll();
    }

    /**
     * Delete personal information by email.
     * @param email Email address
     * @return Mono of removed PersonalInfo or empty if not found
     */
    @DeleteMapping("/{email}")
    public Mono<PersonalInfo> deleteByEmail(@PathVariable String email) {
        return service.deleteByEmail(email);
    }
} 