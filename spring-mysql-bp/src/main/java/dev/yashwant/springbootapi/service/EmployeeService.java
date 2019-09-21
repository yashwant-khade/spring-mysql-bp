package dev.yashwant.springbootapi.service;

import dev.yashwant.springbootapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
