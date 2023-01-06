package com.reactiveresttemplate.reactiveresttemplate.controller;

import com.reactiveresttemplate.reactiveresttemplate.model.Person;
import com.reactiveresttemplate.reactiveresttemplate.service.PersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Log4j2
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/{id}")
    public Mono<Person> getById(@PathVariable Long id) {
        log.info("start getting by id");
        return personService.getById(id);
    }

//    @GetMapping("/person")
//    public Flux<Person> getAllPerson() {
//        log.info("start getting all");
//        return personService.getAllPerson();
//    }
}
