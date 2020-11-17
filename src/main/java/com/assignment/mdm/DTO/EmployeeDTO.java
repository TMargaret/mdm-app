package com.assignment.mdm.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class EmployeeDTO extends BaseDTO {

    private String id;
    private String name;
    private String email;
    private Set<DeviceDTO> deviceDTOS;

}
