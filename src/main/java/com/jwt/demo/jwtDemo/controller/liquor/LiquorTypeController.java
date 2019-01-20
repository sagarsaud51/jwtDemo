package com.jwt.demo.jwtDemo.controller.liquor;

import com.jwt.demo.jwtDemo.model.Response.ApiResponse;
import com.jwt.demo.jwtDemo.model.liquor.LiquorType;
import com.jwt.demo.jwtDemo.repository.liquor.LiquorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

/**
 * Created by SAUD on 1/20/2019.
 */

@RestController
@RequestMapping("/api/liquor-type")
public class LiquorTypeController {

    @Autowired
    LiquorRepository liquorRepository;

    @PostMapping("/add")
    public ResponseEntity<?> addLiquorType(@Valid @RequestBody LiquorType liquorType){
        LiquorType result = liquorRepository.save(liquorType);
        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/api/liquor-type/add")
                .buildAndExpand(result.getName()).toUri();
        return ResponseEntity.created(location).body(new ApiResponse(true, "Liquor"+liquorType.getName()+" added successfully"));
    }
}
