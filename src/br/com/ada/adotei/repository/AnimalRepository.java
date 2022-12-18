package br.com.ada.adotei.repository;

import br.com.ada.adotei.modelo.animal.Animal;
import br.com.ada.adotei.testes.Menu;

import java.util.*;

public class AnimalRepository {
    Scanner sc = new Scanner(System.in);

    private static List<Animal> cadastra = new ArrayList();


    public void limpaPosicao (){
        int index = sc.nextInt();
        index = index - 1;
        System.out.println(this.cadastra.get(index));
        this.cadastra.remove(index);
        System.out.println("O animal do foi adotado");
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
        animal.setId(Menu.sequenceAnimal);
        Menu.sequenceAnimal++;
    }
    public void imprime (){
        cadastra.stream().forEach(System.out::println);
    }
//    public void impressao() {
//        for (Animal obj : cadastra) {
//            System.out.println(cadastra);
//        }
//    }
}
