package com.assignment.mdm.DTO;

import com.assignment.mdm.model.Company;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeDTO {

    private String id;
    private String name;
    private String email;
    private List<DeviceDTO> devices;
    private CompanyDTO company;
    private String companyName;

}
