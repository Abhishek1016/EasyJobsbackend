package com.Prograd.springjwt.models;


import lombok.Data;
import javax.persistence.*;
@Data//getters and setters are generated
@Entity
@Table(name = "AppliedList")
public class Appliedlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int appliedListId;
    @Column(nullable = false)
    private  int jobId;
    @Column(nullable = false)
    private  int userId;
    @Column(nullable = false)
    private  String companyName;
    @Column(nullable = false)
    private  String jobRole;
    @Column(nullable = false)
    private String experience;
    @Column(nullable = false)
    private  String salary;
    @Column(nullable = false)
    private String location;
    @Lob
    @Column(nullable = false)
    private String image;
}
