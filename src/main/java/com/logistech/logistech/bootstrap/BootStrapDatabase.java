package com.logistech.logistech.bootstrap;

import com.logistech.logistech.model.Pessoa;
import com.logistech.logistech.repository.PessoaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapDatabase implements CommandLineRunner{
    private final PessoaRepository pessoaRepository;

    public BootStrapDatabase(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }
    @Override
    public void run(String... args) {
        try {
            Pessoa pessoa = new Pessoa("Davi", "43721789806", "davi@gmail", "098390120");
            Pessoa pessoa2 = new Pessoa("jonas", "8920348532", "jonas@gmail", "98348759");
            pessoaRepository.save(pessoa);
            pessoaRepository.save(pessoa2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
