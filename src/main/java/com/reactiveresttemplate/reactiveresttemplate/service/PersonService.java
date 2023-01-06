package com.reactiveresttemplate.reactiveresttemplate.service;

import com.reactiveresttemplate.reactiveresttemplate.model.Person;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;


@Service
@Log4j2
public class PersonService {
    private final WebClient.Builder webClient;

//    public PersonService(WebClient.Builder webClientBuilder) {
//        this.webClient = webClientBuilder.baseUrl(baseurl).build();
//    }

    @Value("${base.url}")
    private String baseurl;

    public PersonService(WebClient.Builder webClient) {
        this.webClient = webClient;
    }

    public Mono<Person> getById(Long id) {

  return webClient.build().get()
           .uri(baseurl+"/person/{id}",id)
           .retrieve()
           .bodyToMono(Person.class);
    }


    public Flux<Person> findAll() {
        return webClient.build().get()
                .uri(baseurl+"/person/{id}")
                .retrieve()
                .bodyToFlux(Person.class);
    }


//    public Flux<Person> getAllPerson() {
//        return webClient.build().get().uri(baseurl+"/person")
//                .retrieve().bodyToFlux(Person.class);
//    }
}
