package com.capgemini.mongodbexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommanlyAskedQuestion {
    private String question;
    private String answer;
}
