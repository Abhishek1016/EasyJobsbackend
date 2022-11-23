package com.Prograd.springjwt.controllers;

import com.Prograd.springjwt.models.Job;
import com.Prograd.springjwt.payload.security.services.JobService;
;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    private JobService jobService;

    public JobController(JobService jobService){this.jobService=jobService;}


    @PostMapping
    public ResponseEntity<Job> saveStudent(@RequestBody Job job)
    {
        return new ResponseEntity<Job>(jobService.saveJob(job), HttpStatus.CREATED);

    }

    @GetMapping
    public List<Job> getAllJobs()
    {
        return jobService.getAllJobs();
    }
    @GetMapping("{id}")
    public ResponseEntity<Job> getJobById(@PathVariable("id") int id)
    {
        return new ResponseEntity<Job>(jobService.getJobById(id),HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Job> updateJob(@PathVariable("id")int id,@RequestBody Job job)
    {
        return new ResponseEntity<Job>(jobService.updateJob(job,id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteJob(@PathVariable("id")int id)
    {
        jobService.deleteJob(id);
        return new ResponseEntity<String>("Job deleted successfully",HttpStatus.OK);
    }

}
