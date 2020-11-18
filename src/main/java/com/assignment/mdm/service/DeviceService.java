package com.assignment.mdm.service;

import com.assignment.mdm.DTO.DeviceDTO;
import com.assignment.mdm.mapper.DeviceMapper;
import com.assignment.mdm.model.Device;
import com.assignment.mdm.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    private final DeviceMapper mapper;
    private final DeviceRepository repository;

    @Autowired
    public DeviceService(DeviceMapper mapper, DeviceRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public ResponseEntity<Page<DeviceDTO>> findAllDevices() {
        List<Device> devices = repository.findAll();
        return ResponseEntity.ok(new PageImpl<>(mapper.mapToDTO(devices)));
    }

    public ResponseEntity<DeviceDTO> findDeviceById(String deviceId) {
        return ResponseEntity.ok(mapper.mapToDTO(repository.fetchById(deviceId)));
    }
}
