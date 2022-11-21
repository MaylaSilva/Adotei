package br.com.ada.adotei.modelo;

import br.com.ada.adotei.businessobject.EnumRacaCachorro;

import java.util.Scanner;

public class EscolheRacaCachorro <T> {
    EnumRacaCachorro racaCachorro;
    public void escolheCachorro(T t) {
        System.out.println("1 - BASSET" + '\n' + "2 - CHIHUAHUA" + '\n' + "3 - CHOW CHOW");
        System.out.println("4 - CORGI" + '\n' + "5 - DALMATA" + '\n' + "6 - DOBERMAN");
        System.out.println("7 - GOLDEN RETRIEVER" + '\n' + "8 - HUSKY" + '\n' + "9 - LABRADOR");
        System.out.println("10 - PASTOR_ALEMAO" + '\n' + "11 - PINSCHER" + '\n' + "12 - PITBULL");
        System.out.println("13 - POODLE" + '\n' + "14 - ROTTWEILER" + '\n' + "15 - YORKSHIRE");
        System.out.println("Ou digite qualquer outro número para escolher o Sem Raça Definida: ");
        Scanner sc = new Scanner(System.in);
        int raca = sc.nextInt();
        while (true) {
            switch (raca) {
                case 1:
                    racaCachorro = EnumRacaCachorro.BASSET;
                    break;
                case 2:
                    racaCachorro = EnumRacaCachorro.CHIHUAHUA;
                    break;
                case 3:
                    racaCachorro = EnumRacaCachorro.CHOW_CHOW;
                    break;
                case 4:
                    racaCachorro = EnumRacaCachorro.CORGI;
                    break;
                case 5:
                    racaCachorro = EnumRacaCachorro.DALMATA;
                    break;
                case 6:
                    racaCachorro = EnumRacaCachorro.DOBERMAN;
                    break;
                case 7:
                    racaCachorro = EnumRacaCachorro.GOLDEN_RETRIEVER;
                    break;
                case 8:
                    racaCachorro = EnumRacaCachorro.HUSKY;
                    break;
                case 9:
                    racaCachorro = EnumRacaCachorro.LABRADOR;
                    break;
                case 10:
                    racaCachorro = EnumRacaCachorro.PASTOR_ALEMAO;
                    break;
                case 11:
                    racaCachorro = EnumRacaCachorro.PINSCHER;
                    break;
                case 12:
                    racaCachorro = EnumRacaCachorro.PITBULL;
                    break;
                case 13:
                    racaCachorro = EnumRacaCachorro.POODLE;
                    break;
                case 14:
                    racaCachorro = EnumRacaCachorro.ROTTWEILER;
                    break;
                case 15:
                    racaCachorro = EnumRacaCachorro.YORKSHIRE;
                    break;
                default:
                    System.out.println(EnumRacaCachorro.SRD);
                    break;
            }
            break;
        }
    }

    @Override
    public String toString() {
        return "" + racaCachorro;
    }
}

