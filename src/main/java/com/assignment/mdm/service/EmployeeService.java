package com.assignment.mdm.service;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.mapper.EmployeeMapper;
import com.assignment.mdm.model.Employee;
import com.assignment.mdm.repository.EmployeeRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Log
@Service
@Validated
public class EmployeeService {

    private final EmployeeMapper mapper;
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeMapper mapper, EmployeeRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public ResponseEntity<Page<EmployeeDTO>> findAllEmployees() {
        Page<EmployeeDTO> employeeDTOS = new PageImpl(
                repository.findAll());
        return ResponseEntity.ok(employeeDTOS);
    }

    public ResponseEntity<EmployeeDTO> findEmployeeById(String id) {
        return ResponseEntity.ok(mapper.mapToDTO(repository.fetchById(id)));
    }

    public ResponseEntity<EmployeeDTO> saveEmployee(EmployeeDTO employeeDTO) {
        Employee newEmployee;
        if (employeeDTO.getId() != null) {
            Employee employee = repository.fetchById(employeeDTO.getId());
            mapper.mapToExistingEntity(employeeDTO, employee);
            newEmployee = repository.save(employee);
        } else {
            newEmployee = repository.save(mapper.mapToEntity(employeeDTO));
        }
        return ResponseEntity.ok(mapper.mapToDTO(newEmployee));
    }

    public ResponseEntity<String> deleteEmployee(String id) {
        Employee employee = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee Id:" + id));
        repository.delete(employee);
        return ResponseEntity.ok("Employee deleted");
    }

    public ResponseEntity<List<EmployeeDTO>> findEmployeesByCompanyName(String companyName) {
        return ResponseEntity.ok(mapper.mapToDTO(repository.findByCompanyName(companyName)));
    }
}
