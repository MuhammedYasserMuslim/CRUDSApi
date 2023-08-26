package com.spring.person.model;

import com.spring.person.model.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private double salary;

    @CreationTimestamp
    private Date dateCreated;

    @UpdateTimestamp
    private Date dateUpdated;
}
