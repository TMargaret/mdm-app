package com.assignment.mdm.mapper;

import com.assignment.mdm.DTO.DeviceDTO;
import com.assignment.mdm.model.Device;
import liquibase.pro.packaged.D;
import liquibase.pro.packaged.E;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface DeviceMapper extends BaseMapper<Device, DeviceDTO>{

    @Override
    @Mapping(target = "employee", ignore = true)
    DeviceDTO mapToDTO(Device entity);
}
