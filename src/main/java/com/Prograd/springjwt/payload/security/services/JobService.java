package com.Prograd.springjwt.payload.security.services;



import com.Prograd.springjwt.models.Job;

import java.util.List;

public interface JobService {

    Job saveJob(Job job);

    List<Job> getAllJobs();

    Job getJobById(int id);

    Job updateJob(Job job,int id);

    void deleteJob(int id );
}
