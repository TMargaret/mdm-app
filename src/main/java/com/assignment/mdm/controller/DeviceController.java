package com.assignment.mdm.controller;

import com.assignment.mdm.DTO.DeviceDTO;
import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.service.DeviceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@RestController
@RequestMapping("/devices")
@RequiredArgsConstructor
public class DeviceController {

    @Autowired
    private final DeviceService deviceService;

    /**
     * Get all devices.
     *
     * @return all devices.
     */
    @GetMapping(path = "")
    public ResponseEntity<Page<DeviceDTO>> getDevices() {
        return deviceService.findAllDevices();
    }

    /**
     * Get device by id.
     * @param deviceId
     * @return the device that has been found.
     */
    @GetMapping(path = "/device/{deviceId}")
    public ResponseEntity<DeviceDTO> getDeviceById(@PathVariable("deviceId") String deviceId) {
        return deviceService.findDeviceById(deviceId);
    }

    /**
     * Get device by employee id.
     * @param employeeId
     * @return the devices that has been found.
     */
    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<Page<DeviceDTO>> getDevicesByEmployeeId(@PathVariable("employeeId") String employeeId) {
        return deviceService.findDevicesByEmployeeId(employeeId);
    }

    /**
     * Create or update a device.
     * @param deviceDTO
     * @return the id of the created or updated employee.
     */
    @PostMapping(path = "/device")
    public ResponseEntity<DeviceDTO> saveDevice(@RequestBody DeviceDTO deviceDTO) {
        return deviceService.saveDevice(deviceDTO);
    }

    /**
     * Delete a device.
     * @param id
     * @return a proper message.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDevice(@PathVariable("id") String id) {
        return deviceService.deleteDevice(id);
    }

}
