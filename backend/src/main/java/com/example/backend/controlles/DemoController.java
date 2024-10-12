package com.example.backend.controlles;

import com.example.backend.entites.DemoEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/demo")
public class DemoController {

    public DemoEntity update(@PathVariable Long id){
        return null;
    }
}
