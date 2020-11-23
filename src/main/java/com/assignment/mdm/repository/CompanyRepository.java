package com.assignment.mdm.repository;

import com.assignment.mdm.model.Company;
import com.assignment.mdm.model.Employee;

import java.util.List;

public interface CompanyRepository extends BaseRepository<Company, String> {

    Company findByName(String companyName);

}
