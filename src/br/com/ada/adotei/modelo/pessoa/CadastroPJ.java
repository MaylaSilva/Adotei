package br.com.ada.adotei.modelo.pessoa;

import br.com.ada.adotei.repository.PessoaRepository;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroPJ {
    public void cadastraPJ(Scanner sc, PessoaRepository pessoaRepository) {
        try {
            System.out.println("Digite o nome da sua ONG: ");
            String nome = sc.next();
            String pulalinha = sc.nextLine();
            System.out.println("Digite seu CNPJ: ");
            String cnpj = sc.nextLine();
            System.out.println("Digite o nome da sua rua, número e complemento:");
            String rua = sc.nextLine();
            System.out.println("Digite o CEP: ");
            String cep = sc.nextLine();
            System.out.println("Digite a sua cidade: ");
            String cidade = sc.nextLine();
            System.out.println("Digite o seu estado: ");
            String estado = sc.nextLine();
            LocalDate data = addDate();
            System.out.println("Digite o número de telefone ONG: ");
            String telefone = sc.nextLine();
            System.out.println("E o email: ");
            String email = sc.nextLine();
            System.out.println("Digite o site da ONG: ");
            String site = sc.nextLine();

            Ong cadastrarPessoa = new PJBuilder()
                    .nome(nome)
                    .cnpj(cnpj)
                    .endereco(new EnderecoBuilder().nomeDaRua(rua).cep(cep).cidade(cidade).estado(estado).build())
                    .dataAbertura(data)
                    .telefone(telefone)
                    .email(email)
                    .site(site)
                    .build();

            pessoaRepository.cadastrarContato(cadastrarPessoa);
            System.out.println("ONG Cadastrada! Voltaremos ao menu.");

        } catch (InputMismatchException e) {
            System.out.println("Você digitou algo incorretamente no cadastro da sua ONG, será necessário refazer o processo");
            cadastraPJ(sc, pessoaRepository);
        }
    }

    public static LocalDate addDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data de abertura da ONG (Formato: dd/mm/aaaa): ");
        String dataDeAbertura = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataDeAbertura, dtf);
    }
}
