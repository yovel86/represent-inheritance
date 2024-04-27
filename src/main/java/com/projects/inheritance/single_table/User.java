package com.projects.inheritance.single_table;

import com.projects.inheritance.table_per_class.BaseModel;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "st_users")
@Inheritance
@DiscriminatorColumn(
        name = "user_type",
        discriminatorType = DiscriminatorType.INTEGER
)
@DiscriminatorValue(value = "0")
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}
