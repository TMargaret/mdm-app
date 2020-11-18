package com.assignment.mdm.controller;

import com.assignment.mdm.DTO.CompanyDTO;
import com.assignment.mdm.service.CompanyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log
@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompanyController {

    @Autowired
    private final CompanyService companyService;

    @GetMapping("")
    public List<CompanyDTO> getCompanies() {
        return companyService.findAllCompanies();
    }
}
