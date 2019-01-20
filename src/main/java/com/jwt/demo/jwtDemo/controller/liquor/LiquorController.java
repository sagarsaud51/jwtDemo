package com.jwt.demo.jwtDemo.controller.liquor;

import com.jwt.demo.jwtDemo.model.liquor.Name;
import com.jwt.demo.jwtDemo.repository.liquor.NameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by SAUD on 1/20/2019.
 */

@RestController
@RequestMapping("/api/liquor")
public class LiquorController {


    @Autowired
    NameRepository nameRepository;


    private static final Logger logger = LoggerFactory.getLogger(LiquorController.class);

    @GetMapping("/get/liquors")
    public List<Name> getLiquors(){
        return nameRepository.findAll();
    }

    @GetMapping("/get/liqour/{id}")
    public Name getLiquorById(@PathVariable(value = "id") Long id){
        return nameRepository.getOne(id);
    }

    @PutMapping("/put/liqour")
    public Name updateLiquorById(Name name){
        return nameRepository.setNameById(name.getCompany(),name.getLiquorType(),name.getName(),name.getPrice(),name.getId());
    }
}
