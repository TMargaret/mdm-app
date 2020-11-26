package com.assignment.mdm.DTO;

import com.assignment.mdm.model.Employee;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeviceDTO {

    private String id;
    private String name;
    private String serialNumber;
    private String type;
    private String employeeId;
    private String companyId;
    private Employee employee;
}
