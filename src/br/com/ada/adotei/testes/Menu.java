package br.com.ada.adotei.testes;

import br.com.ada.adotei.modelo.animal.CadastroCachorro;
import br.com.ada.adotei.modelo.animal.CadastroGato;
import br.com.ada.adotei.modelo.pessoa.CadastroPF;
import br.com.ada.adotei.modelo.pessoa.CadastroPJ;
import br.com.ada.adotei.repository.AnimalRepository;
import br.com.ada.adotei.repository.PessoaRepository;

import java.util.Scanner;

public class Menu {

    private static AnimalRepository animalRepository = new AnimalRepository();
    private static PessoaRepository pessoaRepository = new PessoaRepository();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolhaMenu;
        final int SAIR = 9;

        System.out.println("Bem-vindo ao Adotei");
        do{
            System.out.println("--------------------------------------------");
            System.out.println("             Selecione uma opção:           ");
            System.out.println("--------------------------------------------");
            System.out.println("1 - Sou uma ONG e quero me cadastrar");
            System.out.println("2 - Sou uma ONG e quero cadastrar um gato");
            System.out.println("3 - Sou uma ONG e quero cadastrar um cachorro");
            System.out.println("4 - Sou um adotante e quero me cadastrar");
            System.out.println("5 - Sou um adotante e quero adotar um animal");
            System.out.println("6 - Quero ver a lista de animais disponíveis");
            System.out.println("7 - Quero ver a lista de pessoas e ONGs cadastradas");
            System.out.println("9 - Sair");
            System.out.println("--------------------------------------------");


            System.out.print("Digite sua opcao: ");
            escolhaMenu = sc.nextInt();

            switch (escolhaMenu){
                case 1:
                    CadastroPJ cadastroPJ = new CadastroPJ();
                    cadastroPJ.cadastraPJ(sc, pessoaRepository);
                    break;
                case 2:
                    CadastroGato cadastroGato = new CadastroGato();
                    cadastroGato.cadastrarGato(sc, animalRepository);
                    break;
                case 3:
                    CadastroCachorro cadastroCachorro = new CadastroCachorro();
                    cadastroCachorro.cadastrarCachorro(sc, animalRepository);
                    break;
                case 4:
                    CadastroPF cadastroPF = new CadastroPF();
                    cadastroPF.cadastraPF(sc, pessoaRepository);
                    break;
                case 5:
                    System.out.println("Digite o id do animal que pretende adotar");
                    animalRepository.limpaPosicao();
                    break;
                case 6:
                    animalRepository.impressao();
                    break;
                case 7:
                    pessoaRepository.impressao();
                    break;
                case 9:
                    System.out.println("Saindo do aplicativo");
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente uma opção.");
            }
        }while(escolhaMenu != SAIR);
        sc.close();
    }
}
