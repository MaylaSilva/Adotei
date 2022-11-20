package br.com.ada.adotei.modelo;

public class Animal {
    private int id;
    private String nome;
    private Integer idade;
    private Character estaSaudavel;
    private String caracteristicas;
    private Character filhote;
    private Character castrado;

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

    public Character getEstaSaudavel() {
        return estaSaudavel;
    }

    public void setEstaSaudavel(Character estaSaudavel) {
        this.estaSaudavel = estaSaudavel;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Character getFilhote() {
        return filhote;
    }

    public void setFilhote(Character filhote) {
        this.filhote = filhote;
    }

    public Character getCastrado() {
        return castrado;
    }

    public void setCastrado(Character castrado) {
        this.castrado = castrado;
    }



    public Animal(String nome, Integer idade, String caracteristicas, Character estaSaudavel, Character filhote, Character castrado) {
        this.nome = nome;
        this.idade = idade;
        this.caracteristicas = caracteristicas;
        this.estaSaudavel = estaSaudavel;
        this.filhote = filhote;
        this.castrado = castrado;
    }

    @Override
    public String toString() {
        return "Animal: " + '\n' +
                "Nome:" + nome +  '\n' +
                "Idade: " + idade + '\n' +
                "Está Saudável: " + estaSaudavel + '\n' +
                "Caracteristicas: " + caracteristicas +  '\n' +
                "Filhote: " + filhote + '\n' +
                "Castrado: " + castrado + '\n';
    }
}
