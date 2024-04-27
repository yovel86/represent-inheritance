package com.projects.inheritance.table_per_class;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseModel {
    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
