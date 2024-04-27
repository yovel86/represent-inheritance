package com.projects.inheritance.table_per_class;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tpc_users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}
