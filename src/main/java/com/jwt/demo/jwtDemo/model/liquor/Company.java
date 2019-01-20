package com.jwt.demo.jwtDemo.model.liquor;

import com.jwt.demo.jwtDemo.model.audit.DateUserAudit;

import javax.persistence.*;

/**
 * Created by SAUD on 1/20/2019.
 */

@Entity
@Table(name = "COMPANY")
public class Company extends DateUserAudit{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
