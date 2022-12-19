package com.project1.SpringProjectWithMySql.repository;

import com.project1.SpringProjectWithMySql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
