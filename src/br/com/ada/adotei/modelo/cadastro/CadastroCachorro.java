package br.com.ada.adotei.modelo.cadastro;

import br.com.ada.adotei.modelo.Cachorro;
import br.com.ada.adotei.businessobject.EscolhaSouN;
import br.com.ada.adotei.businessobject.EscolhePorteCachorro;
import br.com.ada.adotei.businessobject.EscolheRacaCachorro;
import br.com.ada.adotei.repository.AnimalRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroCachorro {
    public void cadastrarCachorro(Scanner sc, AnimalRepository animalRepositoryRepository) {
        System.out.println("Digite o nome do cachorro: ");
        String nome = sc.next();
        String pulaLinha = sc.nextLine();
        System.out.println("Qual é a raça do cachorro? Escolha dentre as opções");
        EscolheRacaCachorro escolheRacaCachorro = new EscolheRacaCachorro();
        escolheRacaCachorro.escolheCachorro(sc);
        System.out.println("Qual é o porte do cachorro?");
        EscolhePorteCachorro escolhePorteCachorro = new EscolhePorteCachorro();
        escolhePorteCachorro.escolhePorte(sc);
        System.out.println("Digite a idade do cachorro: ");
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
        Cachorro cachorro = new Cachorro(nome, escolheRacaCachorro, escolhePorteCachorro, idade,caracteristicas, estaSaudavel, castrado);

        AnimalRepository animalRepository = new AnimalRepository();
        animalRepository.cadastro(cachorro);
    }
}
