package com.Prograd.springjwt.payload.security.services;

import com.Prograd.springjwt.models.Appliedlist;
import com.Prograd.springjwt.repository.AppliedlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AppliedlistService {

    Appliedlist saveHome(Appliedlist appliedlist);
    List<Appliedlist> getAllHomesByUserId(int userId);
    void deleteHome(int appliedListId);
}
