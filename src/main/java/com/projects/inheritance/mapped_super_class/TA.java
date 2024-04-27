package com.projects.inheritance.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data @Entity(name = "msc_tas")
public class TA extends User {
    private String college;
    private double avgRating;
    private int noOfQuestionsResolved;
}
