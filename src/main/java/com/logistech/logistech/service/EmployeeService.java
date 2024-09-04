package com.logistech.logistech.service;

import com.logistech.logistech.model.Employee;
import com.logistech.logistech.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAllEmployee(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    public Optional<Employee> findEmployeeById(Long id){
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(Employee employee) {
        employeeValidate(employee);
        return employeeRepository.save(employee);
    }

    private void employeeValidate(Employee employee) {

        if (employeeRepository.existsByCpf(employee.getCpf())) {
            throw new IllegalArgumentException("CPF já cadastrado.");
        }

        if (!isEmailValid(employee.getEmail())) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }

    private boolean isEmailValid(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

}
