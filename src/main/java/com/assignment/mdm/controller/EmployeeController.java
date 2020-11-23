package com.assignment.mdm.controller;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping(path = "/employee/{employeeId}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("employeeId") String employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

    /**
     * Get all employees that belong to a company.
     * @param companyName
     * @return all employees that belong to a specific company.
     */
    @GetMapping(path = "/{companyName}")
    public ResponseEntity<List<EmployeeDTO>> getEmployeesByCompanyName(@PathVariable("companyName") String companyName) {
        return employeeService.findEmployeesByCompanyName(companyName);
    }

    /**
     * Create or update an employee.
     * @param employeeDTO
     * @return the id of the created or updated employee.
     */
    @PostMapping(path = "/employee")
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.saveEmployee(employeeDTO);
    }

    /**
     * Delete an employee.
     * @param id
     * @return a proper message.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") String id) {
        return employeeService.deleteEmployee(id);
    }

}
