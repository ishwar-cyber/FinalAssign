package com.example.backend.services;

import com.example.backend.entites.DemoEntity;
import com.example.backend.repositorys.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;
    public String updateDemo(DemoEntity demo,Long id){
        Optional<DemoEntity> optional = demoRepository.findById(id);
        if(optional.isPresent()){
            DemoEntity demoEntity = optional.get();
            demoEntity.setName(demo.getName());
            return demoRepository.save(demoEntity);
        }

    }
}
