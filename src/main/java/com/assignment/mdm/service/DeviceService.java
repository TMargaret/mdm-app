package com.assignment.mdm.service;

import com.assignment.mdm.DTO.DeviceDTO;
import com.assignment.mdm.mapper.DeviceMapper;
import com.assignment.mdm.mapper.EmployeeMapper;
import com.assignment.mdm.model.Device;
import com.assignment.mdm.model.Employee;
import com.assignment.mdm.repository.DeviceRepository;
import com.assignment.mdm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    private final DeviceMapper mapper;
    private final EmployeeMapper employeeMapper;
    private final DeviceRepository repository;
    private final EmployeeService employeeService;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public DeviceService(DeviceMapper mapper, EmployeeMapper employeeMapper, DeviceRepository repository, EmployeeService employeeService, EmployeeRepository employeeRepository) {
        this.mapper = mapper;
        this.employeeMapper = employeeMapper;
        this.repository = repository;
        this.employeeService = employeeService;
        this.employeeRepository = employeeRepository;
    }

    public ResponseEntity<Page<DeviceDTO>> findAllDevices() {
        List<Device> devices = repository.findAll();
        return ResponseEntity.ok(new PageImpl<>(mapper.mapToDTO(devices)));
    }

    public ResponseEntity<DeviceDTO> findDeviceById(String deviceId) {
        return ResponseEntity.ok(mapper.mapToDTO(repository.fetchById(deviceId)));
    }

    public ResponseEntity<DeviceDTO> saveDevice(DeviceDTO deviceDTO) {
        Device deviceToSave;
        Employee employee = employeeRepository.fetchById(deviceDTO.getEmployeeId());
        if (deviceDTO.getId() != null) {
            deviceToSave = repository.fetchById(deviceDTO.getId());
            mapper.mapToExistingEntity(deviceDTO, deviceToSave);
        } else {
            deviceToSave = mapper.mapToEntity(deviceDTO);
        }
        deviceToSave.setEmployee(employee);
        deviceToSave.setCompanyId(employee.getCompany().getId());
        deviceToSave = repository.save(deviceToSave);
        return ResponseEntity.ok(mapper.mapToDTO(deviceToSave));
    }

    public ResponseEntity<String> deleteDevice(String id) {
        Device device = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid device Id:" + id));
        repository.delete(device);
        return ResponseEntity.ok("Device deleted");
    }

    public ResponseEntity<Page<DeviceDTO>> findDevicesByEmployeeId(String employeeId) {
        Page<DeviceDTO> devices = new PageImpl(repository.findByEmployeeId(employeeId));
        return ResponseEntity.ok(devices);
    }
}
