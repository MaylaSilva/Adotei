package br.com.ada.adotei.modelo.animal;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.businessobject.escolhe.EscolheRacaGato;
import br.com.ada.adotei.repository.AnimalRepository;

import java.util.Scanner;

public class CadastroGato {
    public void cadastrarGato(Scanner sc, AnimalRepository animalRepositoryRepository) {
        System.out.println("Digite o nome do gato: ");
        String nome = sc.next();
        String pulaLinha = sc.nextLine();
        System.out.println("Qual é a raça do gato? Escolha dentre as opções");
        EscolheRacaGato escolheRacaGato = new EscolheRacaGato();
        escolheRacaGato.escolhaGatinho(sc);
        System.out.println("Digite a idade do gato: ");
        Integer idade = sc.nextInt();
        String pulaLinha1 = sc.nextLine();
        System.out.println("Digite as características do gato: ");
        String caracteristicas = sc.nextLine();
        System.out.println("O gato está saudável?");
        EscolhaSouN estaSaudavel = new EscolhaSouN();
        estaSaudavel.escolhaBinaria(sc);
        System.out.println("O gato está castrado?");
        EscolhaSouN castrado = new EscolhaSouN();
        castrado.escolhaBinaria(sc);
        System.out.println("O gato usa a caixinha?");
        EscolhaSouN usaCaixa = new EscolhaSouN();
        usaCaixa.escolhaBinaria(sc);
        Gato gato = new Gato(nome, escolheRacaGato, idade, caracteristicas, estaSaudavel,
                castrado, usaCaixa);

        AnimalRepository animalRepository = new AnimalRepository();
        animalRepository.cadastro(gato);
        sc.close();
    }
}