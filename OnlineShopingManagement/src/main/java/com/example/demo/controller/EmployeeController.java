package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeService.getEmployeeById(id);
        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setDob(employee.getDob());
            existingEmployee.setSalary(employee.getSalary());
            existingEmployee.setAddress(employee.getAddress());
            existingEmployee.setDesignation(employee.getDesignation());
            existingEmployee.setShop(employee.getShop());
            return employeeService.updateEmployee(existingEmployee);
        }
        return null;
    }

    @PatchMapping("/{id}")
    public Employee partiallyUpdateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeService.getEmployeeById(id);
        if (existingEmployee != null) {
            if (employee.getName() != null) {
                existingEmployee.setName(employee.getName());
            }
            if (employee.getDob() != null) {
                existingEmployee.setDob(employee.getDob());
            }
            if (employee.getSalary() != 0) {
                existingEmployee.setSalary(employee.getSalary());
            }
            if (employee.getAddress() != null) {
                existingEmployee.setAddress(employee.getAddress());
            }
            if (employee.getDesignation() != null) {
                existingEmployee.setDesignation(employee.getDesignation());
            }
            if (employee.getShop() != null) {
                existingEmployee.setShop(employee.getShop());
            }
            return employeeService.updateEmployee(existingEmployee);
        }
        return null;
    }
}
