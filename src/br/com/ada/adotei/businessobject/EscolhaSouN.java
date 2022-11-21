package br.com.ada.adotei.businessobject;

import java.util.Scanner;

public class EscolhaSouN<T> {

    char x;

    public void escolhaBinaria(T escolhe) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite S ou N");
            x = sc.next().charAt(0);
            if (x != 'S' && x != 's' && x != 'N' && x != 'n') {
                System.out.println("Por favor, digite apenas S ou N");
                escolhaBinaria(escolhe);
            } else {
                break;
            }
            break;
        }
    }

    @Override
    public String toString() {
        return "" + x ;
    }
}
