package com.enoca.Enoca.service;

import com.enoca.Enoca.entity.Employee;
import com.enoca.Enoca.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Çalışan Ekleme
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Çalışan Güncelleme
    public Employee updateEmployee(Long employeeId, Employee updatedEmployee) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new IllegalArgumentException("Çalışan bulunamadı: " + employeeId));

        employee.setName(updatedEmployee.getName());
        employee.setPosition(updatedEmployee.getPosition());


        return employeeRepository.save(employee);
    }

    // Çalışan Silme
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    // Tüm Çalışanları Listeleme
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
