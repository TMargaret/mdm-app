package com.assignment.mdm.mapper;

import com.assignment.mdm.DTO.DeviceDTO;
import com.assignment.mdm.model.Device;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DeviceMapper extends BaseMapper<Device, DeviceDTO>{
}
