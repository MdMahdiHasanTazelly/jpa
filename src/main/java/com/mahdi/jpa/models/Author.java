package com.mahdi.jpa.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=true)
//@Data
@Getter
@Setter
@ToString(exclude="courses")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity{
  
    @Column(
        name="f_name",
        length=35
    )
    private String firstName;

    private String lastName;

    @Column(
        unique=true,
        nullable=false
    )
    private String email;

    private int age;

    @Column(
        updatable=false
        //nullable=false
    )
    private LocalDateTime createdAt;

    @Column(
        insertable=false
    )
    private LocalDateTime lastModified;

    @ManyToMany(mappedBy="authors")
    private List<Course> courses;
    
}
