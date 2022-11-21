package br.com.ada.adotei.businessobject;

import br.com.ada.adotei.businessobject.EnumRacaGato;

import java.util.Scanner;

public class EscolheRacaGato <T> {
    EnumRacaGato racaGato;
    public void escolhaGatinho(T t) {
        System.out.println("1 - Siames" + '\n' + "2 - Tigrado" + '\n' + "3 - Sphynx");
        System.out.println("4 - Frajola" + '\n' + "5 - Alaranjado" + '\n' + "6 - Preto");
        System.out.println("7 - Branco" + '\n' + "8 - Tricolor" + '\n' + "9 - Cinza");
        System.out.println("Ou digite qualquer outro número para escolher o Sem Raça Definida: ");
        Scanner sc = new Scanner(System.in);
        int raca = sc.nextInt();
        while (true) {
            switch (raca) {
                case 1:
                    racaGato = EnumRacaGato.SIAMES;
                    break;
                case 2:
                    racaGato = EnumRacaGato.TIGRADO;
                    break;
                case 3:
                    racaGato = EnumRacaGato.SPHYNX;
                    break;
                case 4:
                    racaGato = EnumRacaGato.FRAJOLA;
                    break;
                case 5:
                    racaGato = EnumRacaGato.ALARANJADO;
                    break;
                case 6:
                    racaGato = EnumRacaGato.PRETO;
                    break;
                case 7:
                    racaGato = EnumRacaGato.BRANCO;
                    break;
                case 8:
                    racaGato = EnumRacaGato.TRICOLOR;
                    break;
                case 9:
                    racaGato = EnumRacaGato.CINZA;
                    break;
                default:
                    System.out.println(EnumRacaGato.SRD);
                    break;
            }
            break;
        }
    }

    @Override
    public String toString() {
        return "" + racaGato;
    }
}

