package com.projects.inheritance.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data @Entity
@DiscriminatorValue(value = "3")
public class TA extends User {
    private String college;
    private double avgRating;
    private int noOfQuestionsResolved;
}
