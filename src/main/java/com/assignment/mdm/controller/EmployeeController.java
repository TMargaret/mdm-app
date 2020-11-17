package com.assignment.mdm.controller;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Log
@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    /**
     * Get all employees.
     *
     * @return all employees.
     */
    @CrossOrigin("http://localhost:4200/")
    @GetMapping(path = "")
    public ResponseEntity<Page<EmployeeDTO>> getApplications() {
        return employeeService.findAllEmployees();
    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("employeeId") String employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }
}
