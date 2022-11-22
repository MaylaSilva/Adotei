package br.com.ada.adotei.repository;

import br.com.ada.adotei.modelo.animal.Animal;
import br.com.ada.adotei.modelo.ImprimeCadastro;

import java.util.*;

public class AnimalRepository {
    Scanner sc = new Scanner(System.in);

    private static int sequence = 1;
    private static List<Animal> cadastra = new ArrayList();

    public void limpaPosicao (){
        int index = sc.nextInt();
        index = index - 1;
        this.cadastra.remove(index);
        sc.close();
    }

    public void cadastro(Animal animal) {
        setId(animal);
        if (Objects.nonNull(animal)) {
            cadastra.add(animal);
        } else {
            System.err.println("O nome do animal não pode ser nulo");
        }
    }

    private void setId(Animal animal) {
        animal.setId(sequence);
        sequence++;
    }
    public void impressao(){
        ImprimeCadastro<Animal> imprime = new ImprimeCadastro();
        imprime.imprimeCadastro(cadastra);
    }

}
