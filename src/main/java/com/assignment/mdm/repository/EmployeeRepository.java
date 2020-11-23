package com.assignment.mdm.repository;

import com.assignment.mdm.model.Employee;

import java.util.List;

public interface EmployeeRepository extends BaseRepository<Employee, String> {

    List<Employee> findByCompanyName(String companyName);
}
