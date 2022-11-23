package com.Prograd.springjwt.models;

import lombok.Data;

import javax.persistence.*;

@Data//getters and setters are generated
@Entity
@Table(name = "JobDetails")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private  String companyName;
    @Column(nullable = false)
    private  String jobRole;
    @Column(nullable = false)
    private  String experience;
    @Column(nullable = false)
    private String salary;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String skillRequired;
    @Lob
    @Column
    private String image;

    public Job()
    {

    }
}
