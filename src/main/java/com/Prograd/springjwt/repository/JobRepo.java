package com.Prograd.springjwt.repository;

import com.Prograd.springjwt.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job,Integer> {
}
