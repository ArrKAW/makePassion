package com.project.littlebank.service;

import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.entity.Banker;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;


public interface BankerService {
    boolean login(BankerDTO bankerDTO);

    Banker bankerProfile(String bankerId);
    void bankerUpdate(String bankerId, BankerDTO bankerDTO);
}

