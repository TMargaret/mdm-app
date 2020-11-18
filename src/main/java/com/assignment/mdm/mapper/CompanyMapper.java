package com.assignment.mdm.mapper;

import com.assignment.mdm.DTO.CompanyDTO;
import com.assignment.mdm.model.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper extends BaseMapper<Company, CompanyDTO> {

}
