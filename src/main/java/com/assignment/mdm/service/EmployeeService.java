package com.assignment.mdm.service;

import com.assignment.mdm.DTO.EmployeeDTO;
import com.assignment.mdm.mapper.EmployeeMapper;
import com.assignment.mdm.repository.EmployeeRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

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

}
