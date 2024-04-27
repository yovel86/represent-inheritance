package com.projects.inheritance.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data @Entity(name = "tpc_mentors")
public class Mentor extends User {
    private String company;
    private double avgRating;
    private int noOfSessionsAttended;
}
