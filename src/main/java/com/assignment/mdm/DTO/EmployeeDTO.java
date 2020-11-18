package com.assignment.mdm.DTO;

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

}
