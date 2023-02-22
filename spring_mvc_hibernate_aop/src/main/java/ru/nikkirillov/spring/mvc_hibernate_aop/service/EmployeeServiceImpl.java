package ru.nikkirillov.spring.mvc_hibernate_aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nikkirillov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import ru.nikkirillov.spring.mvc_hibernate_aop.entity.Employee;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Transactional
    @Override
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Transactional
    @Override
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }
}
