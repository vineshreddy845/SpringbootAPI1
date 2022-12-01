package com.example.SpringbootAPI1.model;

import lombok.Data;

import javax.persistence.*;

@Data // using @Data annotation(lombok) it will generate setter and getter, toString methods
@Entity// et that collectively represents a group of entities of a similar type. For Example: An entity set of cars, an entity set of bank accounts, etc
@Table(name="employees") // if you not provide table name. spring automtically use class name Employee has table name.
public class Employee {

    @Id // primary key//What is a primary key in the database?
   // A primary key is the column or columns that contain values that uniquely identify each row in a table
    @GeneratedValue(strategy = GenerationType.IDENTITY)// these annotation generates primary keys value automatically(see in controller save method example).
    private long id;
    @Column(name="first_name")//if you not provide column name. spring automatically use column name has firstname.
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    @Column(name="e_mail")
    private String email;
}
