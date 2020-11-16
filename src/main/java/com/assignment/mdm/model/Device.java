package com.assignment.mdm.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mdmdevice")
@Getter
@Setter
public class Device extends QBaseModel {

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "serial_number", length = 80)
    private String serialNumber;

    @Column(name = "type", length = 50)
    private String type;
}
