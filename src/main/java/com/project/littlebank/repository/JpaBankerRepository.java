package com.project.littlebank.repository;

import com.project.littlebank.entity.Banker;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class JpaBankerRepository implements BankerRepository{

    private final EntityManager em;

    public JpaBankerRepository(EntityManager em){
        this.em = em;
    }


    @Override
    public Optional<Banker> findByB_id(String b_id){
        List<Banker> result = em.createQuery("select m from Banker m where m.b_id = :b_id").setParameter("b_id", b_id).getResultList();
        return result.stream().findAny();
    }

    @Override
    public Banker findByB_pwd(String b_pwd) {
        return null;
    }
}
