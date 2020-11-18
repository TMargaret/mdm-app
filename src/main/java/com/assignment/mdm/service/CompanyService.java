package com.assignment.mdm.service;

import com.assignment.mdm.DTO.CompanyDTO;
import com.assignment.mdm.mapper.CompanyMapper;
import com.assignment.mdm.model.Company;
import com.assignment.mdm.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyMapper companyMapper;
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyMapper companyMapper, CompanyRepository companyRepository) {
        this.companyMapper = companyMapper;
        this.companyRepository = companyRepository;
    }


    public List<CompanyDTO> findAllCompanies() {
        List<Company> companies = companyRepository.findAll();
        return companyMapper.mapToDTO(companies);
    }
}
