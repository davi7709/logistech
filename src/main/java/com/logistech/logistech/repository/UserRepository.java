package com.logistech.logistech.repository;

import com.logistech.logistech.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    boolean existsByCpf(String cpf);
}
