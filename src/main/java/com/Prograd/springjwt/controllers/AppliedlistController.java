package com.Prograd.springjwt.controllers;

import com.Prograd.springjwt.models.Appliedlist;
import com.Prograd.springjwt.payload.security.services.AppliedlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/applied")
public class AppliedlistController {
    @Autowired
    AppliedlistService appliedlistService;

      public AppliedlistController( AppliedlistService appliedlistService) {
        this.appliedlistService = appliedlistService;
    }

    @PostMapping("/addjob")
    public ResponseEntity<Appliedlist> saveHome(@RequestBody Appliedlist appliedlist)
    {
        return new ResponseEntity<Appliedlist>(appliedlistService.saveHome(appliedlist), HttpStatus.CREATED);
    }
    @GetMapping("{userId}")
    public List<Appliedlist> getAllHomesByUserId(@PathVariable("userId") int userId)
    {
        return appliedlistService.getAllHomesByUserId(userId);
    }
    @DeleteMapping("{appliedlistId}")
    public ResponseEntity<String> deleteJob(@PathVariable("appliedlistId")int appliedlistId)
    {
        appliedlistService.deleteHome(appliedlistId);
        return new ResponseEntity<String>("Job deleted successfully",HttpStatus.OK);
    }

}
