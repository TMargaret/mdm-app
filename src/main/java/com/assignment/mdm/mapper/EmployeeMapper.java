package com.assignment.mdm.mapper;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends BaseMapper<Employee, EmployeeDTO> {

}
