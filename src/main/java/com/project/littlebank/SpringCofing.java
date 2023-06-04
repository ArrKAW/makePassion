package com.project.littlebank;


import com.project.littlebank.repository.BankerRepository;
import com.project.littlebank.repository.JpaBankerRepository;
import com.project.littlebank.service.BankerService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.swing.*;

@Configuration
public class SpringCofing {

    private final DataSource dataSource;
    private final EntityManager em;

    @Autowired
    public SpringCofing(DataSource dataSource, EntityManager em){
        this.dataSource = dataSource;
        this.em = em;
    }


    @Bean
    public BankerRepository bankerRepository(){
        return new JpaBankerRepository(em);
    }
}
