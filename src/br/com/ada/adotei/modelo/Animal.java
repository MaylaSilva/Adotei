package br.com.ada.adotei.modelo;

public class Animal {
    private int id;
    private String nome;
    private Integer idade;
    private EscolhaSouN estaSaudavel;
    private String caracteristicas;
    private EscolhaSouN castrado;

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
        this.idade = idade;
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
        return "Animal: " + '\n' +
                "Nome:" + nome +  '\n' +
                "Idade: " + idade + '\n' +
                "Está Saudável: " + estaSaudavel + '\n' +
                "Caracteristicas: " + caracteristicas +  '\n' +
                "Castrado: " + castrado + '\n';
    }
}
