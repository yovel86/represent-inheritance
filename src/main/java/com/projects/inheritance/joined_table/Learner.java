package com.projects.inheritance.joined_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "jt_learners")
@PrimaryKeyJoinColumn(name = "user_id")
public class Learner extends User {
    private String college;
    private String company;
    private double psp;
}
