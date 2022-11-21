package br.com.ada.adotei.modelo.cadastro;

import br.com.ada.adotei.modelo.Endereco;
import br.com.ada.adotei.modelo.Ong;
import br.com.ada.adotei.repository.PessoaRepository;

import java.util.Scanner;

public class CadastroPJ {
    public void cadastraPJ(Scanner sc, PessoaRepository pessoaRepository){
        System.out.println("Digite o nome da sua ONG: ");
        String nome = sc.next();
        String pulalinha = sc.nextLine();
        System.out.println("Digite seu CNPJ: ");
        String cnpj = sc.nextLine();
        System.out.println("Digite o nome da sua rua, número da residência e complemento:");
        String rua = sc.nextLine();
        System.out.println("Digite o CEP: ");
        String cep = sc.nextLine();
        System.out.println("Digite a sua cidade: ");
        String cidade = sc.nextLine();
        System.out.println("Digite o seu estado: ");
        String estado = sc.nextLine();
        System.out.println("Digite a data de abertura da ONG: ");
        Integer dataDeAbertura = sc.nextInt();
        String pulalinha1 = sc.nextLine();
        System.out.println("Digite o número de telefone ONG: ");
        String telefone = sc.nextLine();
        System.out.println("E o email: ");
        String email = sc.nextLine();
        System.out.println("Digite o site da ONG: ");
        String site = sc.nextLine();

        Ong cadastrarPessoa = new Ong(nome,cnpj,new Endereco(rua,cep,cidade,estado),
                dataDeAbertura,telefone,email, site);
        System.out.println("ONG Cadastrada! Voltaremos ao menu.");

        PessoaRepository pessoaRepository1 = new PessoaRepository();
        pessoaRepository1.cadastro(cadastrarPessoa);
    }
}
