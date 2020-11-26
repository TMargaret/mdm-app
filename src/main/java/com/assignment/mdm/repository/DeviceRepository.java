package com.assignment.mdm.repository;

import com.assignment.mdm.model.Device;
import com.assignment.mdm.model.Employee;

import java.util.List;

public interface DeviceRepository extends BaseRepository<Device, String>{

    List<Device> findByEmployeeId(String id);
}
