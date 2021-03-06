package com.assignment.mdm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "mdmemployee")
@Getter
@Setter
@Data
public class Employee extends QBaseModel {

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 100)
    private String email;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Device> devices;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_company_id")
    @JsonIgnore
    private Company company;

}
