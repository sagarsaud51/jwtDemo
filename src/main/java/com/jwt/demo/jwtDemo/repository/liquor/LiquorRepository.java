package com.jwt.demo.jwtDemo.repository.liquor;

import com.jwt.demo.jwtDemo.model.liquor.LiquorType;
import com.jwt.demo.jwtDemo.model.liquor.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SAUD on 1/20/2019.
 */

@Repository
public interface LiquorRepository  extends JpaRepository<LiquorType,Long>{
}
