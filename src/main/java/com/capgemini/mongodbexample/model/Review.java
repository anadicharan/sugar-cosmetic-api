package com.capgemini.mongodbexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private String firstName;
    private String lastName;
    private String rating;
    private String comment;
    private String date;
}
