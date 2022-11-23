package com.Prograd.springjwt.payload.security.services;


import com.Prograd.springjwt.models.Job;
import com.Prograd.springjwt.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImp implements  JobService {

    @Autowired
    private JobRepo jobRepo;
    public JobServiceImp(JobRepo jobRepo){this.jobRepo=jobRepo;}

    @Override
    public Job saveJob(Job job){return jobRepo.save(job);};

    @Override
    public List<Job> getAllJobs(){return jobRepo.findAll();}

    @Override
    public Job getJobById(int id ){return jobRepo.findById(id).orElseThrow();}

    @Override
    public Job updateJob(Job job ,int id )
    {
        Job existingJob = jobRepo.findById(id).orElseThrow();
        existingJob.setCompanyName(job.getCompanyName());
        existingJob.setJobRole(job.getJobRole());
        existingJob.setSalary(job.getSalary());
        existingJob.setLocation(job.getLocation());
        existingJob.setExperience(job.getExperience());
        existingJob.setSkillRequired(job.getSkillRequired());

        jobRepo.save(existingJob);
        return existingJob;
    }

    @Override
    public void deleteJob(int id){
        jobRepo.findById(id).orElseThrow();
        jobRepo.deleteById(id);
    }
}
