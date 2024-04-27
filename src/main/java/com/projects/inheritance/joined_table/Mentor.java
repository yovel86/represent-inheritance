package com.projects.inheritance.joined_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "jt_mentors")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    private String company;
    private double avgRating;
    private int noOfSessionsAttended;
}
