package com.example.TPO_Programacion3.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TPO_Programacion3.entity.RedSocialEntity;
import com.example.TPO_Programacion3.repositories.RedSocialRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/redesSociales")
public class RedSocialController {
    private final RedSocialRepository redSocialRepository;
    
    public RedSocialController(RedSocialRepository redSocialRepository) {
        this.redSocialRepository = redSocialRepository;
    }
    //method implementations with walkthroughs below
    @PutMapping
    Mono<RedSocialEntity> createOrUpdateRedSocial(@RequestBody RedSocialEntity newRedSocial) {
        return redSocialRepository.save(newRedSocial);
    }
    @GetMapping(value = { "", "/" }, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<RedSocialEntity> getRedesSociales() {
        return redSocialRepository.findAll();
    }

 }
