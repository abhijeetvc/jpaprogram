package com.jpademo.jpaprogram.controller;

import com.jpademo.jpaprogram.model.Employee;
import com.jpademo.jpaprogram.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

//    @PostMapping(value="/save")
//    public String saveEmployee(@RequestBody List<Employee> employee){
//        employeeRepository.saveAll(employee);
//        return "Employee saved";
//    }

    @PostMapping(value="/save")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }
}
