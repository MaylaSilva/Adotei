package br.com.ada.adotei.repository;

import br.com.ada.adotei.modelo.pessoa.Pessoa;
import br.com.ada.adotei.testes.Menu;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PessoaRepository {
    public static List<Pessoa> cadastra = new ArrayList<>();

    public void cadastro(Pessoa pessoa) {
        setId(pessoa);
        if (Objects.nonNull(pessoa)) {
            cadastra.add(pessoa);
        } else {
            System.err.println("O nome não pode ser nulo!");
        }
    }

    private void setId(Pessoa pessoa) {
        pessoa.setId(Menu.sequencePessoa);
        Menu.sequencePessoa++;
    }
    public void imprime (){
        cadastra.stream().forEach(System.out::println);
    }
    public void cadastrarContato(Pessoa pessoa) {
        Path testePath = Path.of("src/resources/pessoa.txt");
        File arquivo = testePath.toFile();
        cadastra.add(pessoa);
        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(arquivo)))) {
            for(Pessoa i : cadastra) {
                out.writeObject(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
