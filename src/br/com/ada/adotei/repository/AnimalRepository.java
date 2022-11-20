package br.com.ada.adotei.repository;

import br.com.ada.adotei.modelo.Animal;
import br.com.ada.adotei.modelo.ImprimeCadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AnimalRepository {

    private static int sequence = 1;
    private static List<Animal> cadastra = new ArrayList();

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
