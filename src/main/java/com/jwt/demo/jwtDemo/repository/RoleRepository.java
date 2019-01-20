package com.jwt.demo.jwtDemo.repository;

import com.jwt.demo.jwtDemo.model.Role;
import com.jwt.demo.jwtDemo.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by SAUD on 1/20/2019.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
