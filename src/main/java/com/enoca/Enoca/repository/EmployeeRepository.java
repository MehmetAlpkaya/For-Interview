package com.enoca.Enoca.repository;

import com.enoca.Enoca.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository extends JpaRepository<Employee,Long> {
}