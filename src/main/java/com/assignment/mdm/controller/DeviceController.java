package com.assignment.mdm.controller;

import com.assignment.mdm.DTO.DeviceDTO;
import com.assignment.mdm.service.DeviceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path = "/{deviceId}")
    public ResponseEntity<DeviceDTO> getDeviceById(@PathVariable("deviceId") String deviceId) {
        return deviceService.findDeviceById(deviceId);
    }

}
