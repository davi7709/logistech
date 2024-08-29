package com.logistech.logistech.repository;

import com.logistech.logistech.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository <Pessoa, Long> {
    boolean existsByCpf(String cpf);
}
