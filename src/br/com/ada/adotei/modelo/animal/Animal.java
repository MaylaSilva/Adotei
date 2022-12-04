package br.com.ada.adotei.modelo.animal;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.modelo.Identificavel;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Animal implements Identificavel {
    private int id;
    private String nome;
    private int idade;
    private EscolhaSouN estaSaudavel;
    private String caracteristicas;
    private EscolhaSouN castrado;


    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = sc.nextLine();
        LocalDate nascimento = LocalDate.parse(data,dtf);
        int idade1 = Period.between(nascimento, LocalDate.now()).getYears();
        idade = idade1;
        if (idade1 < 0){
            System.err.println("Animal não pode ter idade negativa");
        } else if (idade1 > 30) {
            System.err.println("Não podem colocar para adoção um animal com idade superior a 30 anos");
        } else {
            this.idade = idade;
        }
    }

    public EscolhaSouN getEstaSaudavel() {
        return estaSaudavel;
    }

    public void setEstaSaudavel(EscolhaSouN estaSaudavel) {
        this.estaSaudavel = estaSaudavel;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public EscolhaSouN getCastrado() {
        return castrado;
    }

    public void setCastrado(EscolhaSouN castrado) {
        this.castrado = castrado;
    }
    public Animal(String nome, int idade, String caracteristicas, EscolhaSouN estaSaudavel, EscolhaSouN castrado) {
        this.nome = nome;
        this.idade = idade;
        this.caracteristicas = caracteristicas;
        this.estaSaudavel = estaSaudavel;
        this.castrado = castrado;
    }

    @Override
    public String toString() {
        return '\n' + "Animal: " + '\n' +
                "Id: " + id + " - " +
                "Nome:" + nome +  '\n' +
                "Idade: " + idade + '\n' +
                "Está Saudável: " + estaSaudavel + '\n' +
                "Caracteristicas: " + caracteristicas +  '\n' +
                "Castrado: " + castrado + '\n';
    }
}
