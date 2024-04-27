package com.projects.inheritance.joined_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User {
    private String college;
    private double avgRating;
    private int noOfQuestionsResolved;
}
