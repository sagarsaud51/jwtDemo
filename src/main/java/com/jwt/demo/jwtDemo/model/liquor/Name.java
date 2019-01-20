package com.jwt.demo.jwtDemo.model.liquor;

import com.jwt.demo.jwtDemo.model.audit.DateUserAudit;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

/**
 * Created by SAUD on 1/20/2019.
 */
@Entity
@Table(name = "liquorName")
public class Name extends DateUserAudit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    @OneToOne
    private LiquorType liquorType;

    @OneToOne
    private Company company;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public LiquorType getLiquorType() {
        return liquorType;
    }

    public void setLiquorType(LiquorType liquorType) {
        this.liquorType = liquorType;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
