package br.com.ada.adotei.repository;

import br.com.ada.adotei.modelo.*;
import br.com.ada.adotei.modelo.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PessoaRepository {
    private static int sequence = 1;
    private static List<Pessoa> cadastra = new ArrayList<>();

    public void cadastro(Pessoa pessoa) {
        setId(pessoa);
        if (Objects.nonNull(pessoa)) {
            cadastra.add(pessoa);
        } else {
            System.err.println("O nome não pode ser nulo!");
        }
    }

    private void setId(Pessoa pessoa) {
        pessoa.setId(sequence);
        sequence++;
    }
    public void impressao(){
        ImprimeCadastro<Pessoa> imprime = new ImprimeCadastro();
        imprime.imprimeCadastro(cadastra);
    }
}
