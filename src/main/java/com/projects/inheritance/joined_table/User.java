package com.projects.inheritance.joined_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jt_users")
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}
