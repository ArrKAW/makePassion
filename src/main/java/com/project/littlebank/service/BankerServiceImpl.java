package com.project.littlebank.service;

import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.entity.Banker;
import com.project.littlebank.repository.BankerMyBatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BankerServiceImpl implements BankerService{

    private final BankerMyBatisRepository bankerMyBatisRepository;


    @Override
    public boolean login(BankerDTO bankerDTO){

        Banker findBanker = bankerMyBatisRepository.login(bankerDTO);

        if(findBanker == null){
            return false;
        }
        return true;
    }

    @Override
    public Banker bankerProfile(String bankerId){

        Banker findBanker = bankerMyBatisRepository.find(bankerId);

        return findBanker;
    }

    @Override
    public void bankerUpdate(String bankerId, BankerDTO bankerDTO){

        Banker findBanker = bankerMyBatisRepository.find(bankerId);
        BankerDTO updateBankerDTO = new BankerDTO(findBanker);

        updateBankerDTO.setName(bankerDTO.getName());
        updateBankerDTO.setPosition(bankerDTO.getPosition());
        updateBankerDTO.setTel(bankerDTO.getTel());
        updateBankerDTO.setDept(bankerDTO.getDept());

        Banker updateBanker = new Banker(updateBankerDTO);
        bankerMyBatisRepository.update(updateBanker);
    }
}
