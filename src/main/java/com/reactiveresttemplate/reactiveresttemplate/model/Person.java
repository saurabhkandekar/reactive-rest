package com.reactiveresttemplate.reactiveresttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends PersonResponse {

    private String firstname;
    private String lastname;
    private String dob;
}
