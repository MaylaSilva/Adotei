package br.com.ada.adotei.modelo.pessoa;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.repository.PessoaRepository;

import java.util.Scanner;

public class CadastroPF {
    public void cadastraPF(Scanner sc, PessoaRepository pessoaRepository) {
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        String pulaLinha = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o nome da sua rua, número da residência e complemento:");
        String rua = sc.nextLine();
        System.out.println("Digite o CEP: ");
        String cep = sc.nextLine();
        System.out.println("Digite a sua cidade: ");
        String cidade = sc.nextLine();
        System.out.println("Digite o seu estado: ");
        String estado = sc.nextLine();
        System.out.println("Digite seu número de telefone: ");
        String telefone = sc.nextLine();
        System.out.println("Digite seu email: ");
        String email = sc.nextLine();
        System.out.println("Sua casa é protegida? Digite S ou N");
        System.out.println("Exemplo: se for adotar gatos, precisa de tela na janela");
        System.out.println("Exemplo: se for adotar cães, o cachorro não pode ter acesso a rua");
        EscolhaSouN casaProtegida = new EscolhaSouN();
        casaProtegida.escolhaBinaria(sc);

        Adotante cadastrarPessoa = new Adotante(nome, cpf, new Endereco(rua, cep, cidade, estado),
                telefone, email, casaProtegida);

        PessoaRepository pessoaRepository1 = new PessoaRepository();
        pessoaRepository1.cadastro(cadastrarPessoa);
        sc.close();
    }
}
