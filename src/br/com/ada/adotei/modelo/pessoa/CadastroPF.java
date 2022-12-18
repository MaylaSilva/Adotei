package br.com.ada.adotei.modelo.pessoa;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.repository.PessoaRepository;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroPF {
    public void cadastraPF(Scanner sc, PessoaRepository pessoaRepository) {
        try {
            System.out.println("Digite seu nome: ");
            String nome = sc.next();
            String pulaLinha = sc.nextLine();
            LocalDate aniversario = addDate();
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

            Adotante cadastrarPessoa = new PFBuilder()
                    .nome(nome)
                    .dataDeNascimento(aniversario)
                    .cpf(cpf)
                    .endereco(new EnderecoBuilder().nomeDaRua(rua).cep(cep).cidade(cidade).estado(estado).build())
                    .telefone(telefone)
                    .email(email)
                    .casaProtegida(casaProtegida)
                    .build();

            pessoaRepository.cadastrarContato(cadastrarPessoa);
            System.out.println("Parabéns, você já está cadastrado!");
        } catch (InputMismatchException e) {
            System.out.println("Você digitou algo incorretamente no seu cadastro, será necessário refazer o processo");
            cadastraPF(sc, pessoaRepository);
        }
    }

    public static LocalDate addDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua data de nascimento (Formato: dd/mm/aaaa): ");
        String dataDeNascimento = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataDeNascimento,dtf);        ;
        LocalDate hoje = LocalDate.now();
        if (Period.between(data,hoje).getYears() < 18){
            System.out.println("Infelizmente só podemos doar nossos animais para maiores de idade");
            return data;
        }
        return LocalDate.parse(dataDeNascimento, dtf);
    }
}
