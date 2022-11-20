package br.com.ada.adotei.modelo;

import br.com.ada.adotei.businessobject.EnumRacaGato;
import br.com.ada.adotei.repository.AnimalRepository;
import br.com.ada.adotei.repository.PessoaRepository;

import java.util.Scanner;

public class CadastroGato {
    public void cadastrarGato(Scanner sc, AnimalRepository animalRepositoryRepository) {
        System.out.println("Digite o nome do gato: ");
        String nome = sc.next();
        String pulaLinha = sc.nextLine();
        System.out.println("Qual é a raça do gato? Escolha dentre as opções");

        char raca = sc.next().charAt(0);
        EnumRacaGato racaGato = null;
        while(true){
        switch (raca){
            case 1:
                racaGato = EnumRacaGato.SRD;
                break;
            case 2:
                racaGato = EnumRacaGato.SIAMES;
                break;
            case 3:
                racaGato = EnumRacaGato.ANGORA;
                break;
            case 4:
                racaGato = EnumRacaGato.PERSA;
                break;
            case 5:
                racaGato = EnumRacaGato.PELO_CURTO;
                break;
            case 6:
                racaGato = EnumRacaGato.TIGRADO;
                break;
            case 7:
                racaGato = EnumRacaGato.SPHYNX;
                break;
            case 8:
                racaGato = EnumRacaGato.FRAJOLA;
                break;
            case 9:
                racaGato = EnumRacaGato.ALARANJADO;
                break;
            case 10:
                racaGato = EnumRacaGato.PRETO;
                break;
            case 11:
                racaGato = EnumRacaGato.BRANCO;
                break;
            case 12:
                racaGato = EnumRacaGato.TRICOLOR;
                break;
            case 13:
                racaGato = EnumRacaGato.CINZA;
                break;
            default:
                System.out.println(EnumRacaGato.SRD);
        } break;
        }


        System.out.println("Digite a idade do gato: ");
        Integer idade = sc.nextInt();
        System.out.println("Digite as características do gato: ");
        String caracteristicas = sc.nextLine();

        char estaSaudavel;
        while(true) {
            System.out.println("O gato está saudável? Digite S ou N");
            estaSaudavel = sc.next().charAt(0);
            if (estaSaudavel != 'S' && estaSaudavel != 's' && estaSaudavel != 'N' && estaSaudavel != 'n') {
                System.out.println("Por favor, digite apenas S ou N");
            } else {
                break;
            }
        }
            char filhote;
            while (true) {
                System.out.println("O gato é filhote? Digite S ou N");
                filhote = sc.next().charAt(0);
                if (filhote != 'S' && filhote != 's' && filhote != 'N' && filhote != 'n') {
                    System.out.println("Por favor, digite apenas S ou N");
                } else {
                    break;
                }
            }
                char castrado;
                while (true) {
                    System.out.println("O gato está castrado? Digite S ou N");
                    castrado = sc.next().charAt(0);
                    if (castrado != 'S' && castrado != 's' && castrado != 'N' && castrado != 'n') {
                        System.out.println("Por favor, digite apenas S ou N");
                    } else {
                        break;
                    }
                }
                    char usaCaixa;
                    while (true) {
                        System.out.println("O gato usa a caixinha de areia? Digite S ou N");
                        usaCaixa = sc.next().charAt(0);
                        if (usaCaixa != 'S' && usaCaixa != 's' && usaCaixa != 'N' && usaCaixa != 'n') {
                            System.out.println("Por favor, digite apenas S ou N");
                        } else {
                            break;
                        }
                    }
                        Gato gato = new Gato(nome, racaGato, idade, caracteristicas, estaSaudavel, filhote,
                                castrado, usaCaixa);

                        AnimalRepository animalRepository = new AnimalRepository();
                        animalRepository.cadastro(gato);
                    }
                }