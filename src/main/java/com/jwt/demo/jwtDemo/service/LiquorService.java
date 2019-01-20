package com.jwt.demo.jwtDemo.service;

import com.jwt.demo.jwtDemo.repository.liquor.NameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAUD on 1/20/2019.
 */
@Service
public class LiquorService {

    @Autowired
    NameRepository nameRepository;

    private static final Logger logger = LoggerFactory.getLogger(LiquorService.class);

//    public setNameById
}
