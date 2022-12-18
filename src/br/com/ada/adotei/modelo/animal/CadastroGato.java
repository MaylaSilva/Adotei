package br.com.ada.adotei.modelo.animal;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.businessobject.escolhe.EscolheRacaGato;
import br.com.ada.adotei.modelo.CalculaIdade;
import br.com.ada.adotei.repository.AnimalRepository;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroGato {
    public void cadastrarGato(Scanner sc, AnimalRepository animalRepository) {
        try {
            System.out.println("Digite o nome do gato: ");
            String nome = sc.next();
            String pulaLinha = sc.nextLine();
            System.out.println("Qual é a raça do gato? Escolha dentre as opções");
            EscolheRacaGato escolheRacaGato = new EscolheRacaGato();
            escolheRacaGato.escolhaGatinho(sc);
            int idade = CalculaIdade.addDate();
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

            Gato gato = new GatoBuilder()
                    .nome(nome)
                    .raca(escolheRacaGato)
                    .idade(idade)
                    .caracteristicas(caracteristicas)
                    .estaSaudavel(estaSaudavel)
                    .castrado(castrado)
                    .usaCaixa(usaCaixa)
                    .build();

            animalRepository.cadastro(gato);
            System.out.println("O gatinho foi cadastrado com sucesso. Logo ele encontrará um lar");
        } catch (InputMismatchException e) {
            System.out.println("Você digitou algo incorretamente no cadastro do gato, será necessário refazer o processo");
            cadastrarGato(sc, animalRepository);
        }
    }
}