package com.logistech.logistech.repository;

import com.logistech.logistech.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository <Employee, Long> {
    boolean existsByCpf(String cpf);
}
