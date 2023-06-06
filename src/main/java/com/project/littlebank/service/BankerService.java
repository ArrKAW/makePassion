package com.project.littlebank.service;

import com.project.littlebank.dto.BankerDTO;
import org.springframework.stereotype.Service;


public interface BankerService {
    boolean login(BankerDTO bankerDTO);
}
