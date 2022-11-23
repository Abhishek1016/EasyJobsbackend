package com.Prograd.springjwt.repository;

import com.Prograd.springjwt.models.Appliedlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppliedlistRepo extends JpaRepository<Appliedlist,Integer> {
    List<Appliedlist> findAllByUserId(int userId);
}
