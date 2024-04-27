package com.projects.inheritance.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data @Entity(name = "tpc_tas")
public class TA extends User {
    private String college;
    private double avgRating;
    private int noOfQuestionsResolved;
}
