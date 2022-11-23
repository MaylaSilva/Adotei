package br.com.ada.adotei.modelo.animal;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.modelo.Identificavel;

public class Animal implements Identificavel {
    private int id;
    private String nome;
    private Integer idade;
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade < 0){
            System.err.println("Animal não pode ter idade negativa");
        } else if (idade > 30) {
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
    public Animal(String nome, Integer idade, String caracteristicas, EscolhaSouN estaSaudavel, EscolhaSouN castrado) {
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
