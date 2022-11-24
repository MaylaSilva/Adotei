package br.com.ada.adotei.modelo.animal;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.businessobject.escolhe.EscolhePorteCachorro;
import br.com.ada.adotei.businessobject.escolhe.EscolheRacaCachorro;
import br.com.ada.adotei.repository.AnimalRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroCachorro {
    public void cadastrarCachorro(Scanner sc, AnimalRepository animalRepository) {
        try {
            System.out.println("Digite o nome do cachorro: ");
            String nome = sc.next();
            String pulaLinha = sc.nextLine();
            System.out.println("Qual é a raça do cachorro? Escolha dentre as opções");
            EscolheRacaCachorro escolheRacaCachorro = new EscolheRacaCachorro();
            escolheRacaCachorro.escolheCachorro(sc);
            System.out.println("Qual é o porte do cachorro?");
            EscolhePorteCachorro escolhePorteCachorro = new EscolhePorteCachorro();
            escolhePorteCachorro.escolhePorte(sc);
            System.out.println("Digite a idade do cachorro, apenas números: ");
            Integer idade = sc.nextInt();
            String pulaLinha1 = sc.nextLine();
            System.out.println("Digite as características do cachorro: ");
            String caracteristicas = sc.nextLine();
            System.out.println("O cachorro está saudável?");
            EscolhaSouN estaSaudavel = new EscolhaSouN();
            estaSaudavel.escolhaBinaria(sc);
            System.out.println("O cachorro está castrado?");
            EscolhaSouN castrado = new EscolhaSouN();
            castrado.escolhaBinaria(sc);

            Cachorro cachorro1 = new CachorroBuilder()
                    .nome(nome)
                    .raca(escolheRacaCachorro)
                    .porte(escolhePorteCachorro)
                    .idade(idade)
                    .caracteristicas(caracteristicas)
                    .estaSaudavel(estaSaudavel)
                    .castrado(castrado)
                    .build();


            System.out.println("O cãozinho foi cadastrado com sucesso! Logo ele encontrará um lar!");
            AnimalRepository animalRepository1 = new AnimalRepository();
            animalRepository1.cadastro(cachorro1);

        } catch (InputMismatchException e) {
            System.out.println("Você digitou algo incorretamente no cadastro do cachorro, será necessário refazer o processo");
            cadastrarCachorro(sc, animalRepository);
        }
    }
}
