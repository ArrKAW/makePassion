package com.project.littlebank.service;

import com.project.littlebank.entity.Banker;
import com.project.littlebank.repository.BankerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class BankerService {

    private final BankerRepository bankerRepository;

    public BankerService(BankerRepository bankerRepository){
        this.bankerRepository = bankerRepository;
    }

    public Banker bankerLogin(Banker banker){
        Optional<Banker> bankerB_id = bankerRepository.findByB_id(banker.getB_Id());

        if(bankerB_id.isPresent()){
            Banker bankerEntity = bankerB_id.get();
            if(bankerEntity.getB_pwd().equals(banker.getB_pwd())){
                return banker;
            }
            return null;
        }
        return null;
    }



}
