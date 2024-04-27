package com.projects.inheritance.single_table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
