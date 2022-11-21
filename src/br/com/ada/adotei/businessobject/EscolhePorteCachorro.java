package br.com.ada.adotei.businessobject;

import br.com.ada.adotei.businessobject.EnumPorte;

import java.util.Scanner;

public class EscolhePorteCachorro <T>{
    EnumPorte porteCachorro;


    @Override
    public String toString() {
        return "Porte do cãozinho: " + porteCachorro;
    }

    public void escolhePorte(T t) {
        System.out.println("1 - Pequeno " + '\n' + "2 - Médio" + '\n' + "3 - Grande");
        System.out.println("Caso digite outro número, o padrão será médio");
        Scanner sc = new Scanner(System.in);
        int porte = sc.nextInt();
        while (true) {
            switch (porte) {
                case 1:
                    porteCachorro = EnumPorte.PEQUENO;
                    break;
                case 2:
                    porteCachorro = EnumPorte.MEDIO;
                    break;
                case 3:
                    porteCachorro = EnumPorte.GRANDE;
                    break;
                default:
                    porteCachorro = EnumPorte.MEDIO;
                    break;
            }
            break;
        }

    }
}
