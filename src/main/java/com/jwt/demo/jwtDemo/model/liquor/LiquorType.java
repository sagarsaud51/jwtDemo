package com.jwt.demo.jwtDemo.model.liquor;

import com.jwt.demo.jwtDemo.model.audit.DateUserAudit;

import javax.persistence.*;

/**
 * Created by SAUD on 1/20/2019.
 */

@Entity
@Table(name = "LIQUOR_TYPE")
public class LiquorType extends DateUserAudit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
