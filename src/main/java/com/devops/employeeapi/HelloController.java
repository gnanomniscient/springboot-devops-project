package com.devops.employeeapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/employees")
    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ram", "DevOps"));
        employees.add(new Employee(102, "John", "AWS"));
        employees.add(new Employee(103, "David", "Docker"));

        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {

        return new Employee(id, "Ram", "DevOps");
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {

        return employee;
    }
}