package com.jwt.demo.jwtDemo.repository.liquor;

import com.jwt.demo.jwtDemo.model.liquor.Company;
import com.jwt.demo.jwtDemo.model.liquor.LiquorType;
import com.jwt.demo.jwtDemo.model.liquor.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by SAUD on 1/20/2019.
 */
@Repository
public interface NameRepository extends JpaRepository<Name,Long> {

    @Modifying
    @Query("update Name n set n.company = ?1, n.liquorType = ?2, n.name = ?3,n.price = ?4 where  n.id = ?4")
    Name setNameById(Company  company, LiquorType liquorType, String name,Long price, Long id );
}
