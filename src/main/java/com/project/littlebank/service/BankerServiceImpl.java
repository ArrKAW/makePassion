package com.project.littlebank.service;

import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.entity.Banker;
import com.project.littlebank.repository.BankerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class BankerServiceImpl implements BankerService{

    private final BankerRepository bankerRepository;


    @Override
    public boolean login(BankerDTO bankerDTO){

        Banker findBanker = bankerRepository.findByBidAndBpwd(bankerDTO.getBankerId(), bankerDTO.getBankerPwd());

        if(findBanker == null){
            return false;
        }

        return true;

    }
}
