package com.logistech.logistech.controller;

import com.logistech.logistech.model.Employee;
import com.logistech.logistech.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController("/cadastro")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/cadastro")
    public String exibirFormulario(Model model) {
        model.addAttribute("employee", new Employee());
        return "cadastro";
    }
    @GetMapping
    public List<Employee> findAllEmployee(Employee employee) {
        return employeeService.findAllEmployee();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable Long id) {
        return employeeService.findEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
