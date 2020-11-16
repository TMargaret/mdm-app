package com.assignment.mdm.controller;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
