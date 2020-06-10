package com.jpademo.jpaprogram.repository;

import com.jpademo.jpaprogram.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
