package com.jwt.demo.jwtDemo.repository.liquor;

import com.jwt.demo.jwtDemo.model.liquor.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SAUD on 1/20/2019.
 */

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long>{
}
