package com.Prograd.springjwt.payload.security.services;

import com.Prograd.springjwt.models.Appliedlist;
import com.Prograd.springjwt.repository.AppliedlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppliedlistServiceImpl implements AppliedlistService{

    @Autowired
    AppliedlistRepo appliedlistRepo;
    @Override
    public Appliedlist saveHome(Appliedlist appliedlist) {
        return appliedlistRepo.save(appliedlist) ;
    }

    @Override
    public List<Appliedlist> getAllHomesByUserId(int userId) {
        return appliedlistRepo.findAllByUserId(userId);
    }

    @Override
    public void deleteHome(int appliedListId) {
          appliedlistRepo.findById(appliedListId).orElseThrow();
          appliedlistRepo.deleteById(appliedListId);
    }
}
