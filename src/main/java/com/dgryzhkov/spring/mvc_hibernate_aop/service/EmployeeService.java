package com.dgryzhkov.spring.mvc_hibernate_aop.service;

import com.dgryzhkov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

/**
 * @author Dgryzhkov
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
