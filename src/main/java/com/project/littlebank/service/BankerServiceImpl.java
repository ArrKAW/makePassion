package com.project.littlebank.service;

import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.entity.Banker;
import com.project.littlebank.repository.BankerRepository;
import jakarta.servlet.http.HttpSession;
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

    @Override
    public Banker bankerProfile(String bankerId){

        Banker findBanker = bankerRepository.findByBid(bankerId);

        return findBanker;
    }

    @Override
    public void bankerUpdate(String bankerId, BankerDTO bankerDTO){

        Banker findBanker = bankerRepository.findByBid(bankerId);
        BankerDTO updateBankerDTO = new BankerDTO(findBanker);

        updateBankerDTO.setBankerName(bankerDTO.getBankerName());
        updateBankerDTO.setBankerPosition(bankerDTO.getBankerPosition());
        updateBankerDTO.setBankerTel(bankerDTO.getBankerTel());
        updateBankerDTO.setBanker_dept(bankerDTO.getBanker_dept());

        Banker updateBanker = new Banker(updateBankerDTO);

        bankerRepository.save(updateBanker);
    }
}
