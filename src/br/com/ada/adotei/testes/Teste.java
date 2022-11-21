package br.com.ada.adotei.testes;

import br.com.ada.adotei.businessobject.EnumPorte;
import br.com.ada.adotei.businessobject.EnumRacaCachorro;
import br.com.ada.adotei.modelo.Animal;
import br.com.ada.adotei.modelo.Cachorro;
import br.com.ada.adotei.modelo.Ong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {


    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
        System.out.println(al);
        al.remove(1);
        System.out.println(al);

    }
    Scanner sc = new Scanner(System.in);
    private static List<Animal> cadastra = new ArrayList();
    public void limpaPosicao (){
        Integer index = sc.nextInt();
        cadastra.remove(index);
    }


}
