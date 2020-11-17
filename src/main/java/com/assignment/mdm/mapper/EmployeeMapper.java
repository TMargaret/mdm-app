package com.assignment.mdm.mapper;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper extends BaseMapper<Employee, EmployeeDTO> {

}
