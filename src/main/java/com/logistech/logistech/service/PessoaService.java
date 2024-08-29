package com.logistech.logistech.service;

import com.logistech.logistech.model.Pessoa;
import com.logistech.logistech.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodas(){
        return (List<Pessoa>) pessoaRepository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public void deletar(Long id){
        pessoaRepository.deleteById(id);
    }

    public Optional<Pessoa> buscaPorId(Long id){
        return pessoaRepository.findById(id);
    }

    public Pessoa atualizar(Pessoa pessoa) {
        validarPessoa(pessoa);
        return pessoaRepository.save(pessoa);
    }

    private void validarPessoa(Pessoa pessoa) {

        if (pessoaRepository.existsByCpf(pessoa.getCpf())) {
            throw new IllegalArgumentException("CPF já cadastrado.");
        }

        if (!isEmailValido(pessoa.getEmail())) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }

    private boolean isEmailValido(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

}
