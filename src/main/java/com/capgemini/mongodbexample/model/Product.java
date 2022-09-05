package com.capgemini.mongodbexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "product_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Field("id")
    private Integer id;
    private String title;
    private String type;
    private List<Image> images;
    private List<String> availableOffers;
    private String description;
    private String howToApply;
    private String benefits;
    private List<CommanlyAskedQuestion> commanlyAskedQuestions;
    private String avg_rating;
    private Integer mrp;
    private Integer noOfReviewers;
    private List<Review> reviews;
}
