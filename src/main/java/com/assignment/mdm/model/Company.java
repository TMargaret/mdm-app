package com.assignment.mdm.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "mdmcompany")
@Getter
@Setter
public class Company extends QBaseModel {

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "address", length = 150)
    private String address;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Employee> employees;
}