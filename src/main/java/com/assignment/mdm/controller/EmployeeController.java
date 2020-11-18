package com.assignment.mdm.controller;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    /**
     * Get all employees.
     *
     * @return all employees.
     */
    @GetMapping(path = "")
    public ResponseEntity<Page<EmployeeDTO>> getEmployees() {
        return employeeService.findAllEmployees();
    }

    /**
     * Get employee by id.
     * @param employeeId
     * @return the employee that has been found.
     */
    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("employeeId") String employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

    /**
     * Create or update an employee.
     * @param employeeDTO
     * @return the id of the created or updated employee.
     */
    @PostMapping(path = "/employee")
    public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.saveEmployee(employeeDTO);
    }

    /**
     * Delete an employee.
     * @param id
     * @return a proper message.
     */
    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") String id) {
        return employeeService.deleteEmployee(id);
    }

}
