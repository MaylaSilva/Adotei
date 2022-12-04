package br.com.ada.adotei.modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculaIdade {
    public static int addDate() {
        int idade = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a data de nascimento aproximada do animal (Formato dd/mm/aaaa): ");
            String dataDeNascimento = sc.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate formatado = LocalDate.parse(dataDeNascimento, dtf);
            idade = Period.between(formatado, LocalDate.now()).getYears();
            if (idade > 30) {
                System.err.println("Não podem colocar para adoção um animal com idade superior a 30 anos");
                addDate();
            }
        } catch (DateTimeParseException d){
            System.out.println("A data colocada está diferente do formato, digite novamente");
            addDate();
        }
        return idade;
    }
}

