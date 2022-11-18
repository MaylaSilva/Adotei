package br.com.ada.adotei.Modelo;

public class Animal {
    private String nome;
    private Integer idade;
    private Boolean estaSaudavel;
    private String caracteristicas;
    private Boolean filhote;
    private Boolean castrado;
    private Ong nomeOng;

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

    public Boolean getEstaSaudavel() {
        return estaSaudavel;
    }

    public void setEstaSaudavel(Boolean estaSaudavel) {
        this.estaSaudavel = estaSaudavel;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Boolean getFilhote() {
        return filhote;
    }

    public void setFilhote(Boolean filhote) {
        this.filhote = filhote;
    }

    public Boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }

    public Ong getNomeOng() {
        return nomeOng;
    }

    public void setNomeOng(Ong nomeOng) {
        this.nomeOng = nomeOng;
    }

    public Animal(String nome, Integer idade, String caracteristicas, Boolean estaSaudavel, Boolean filhote, Boolean castrado, Ong nomeOng) {
        this.nome = nome;
        this.idade = idade;
        this.caracteristicas = caracteristicas;
        this.estaSaudavel = estaSaudavel;
        this.filhote = filhote;
        this.castrado = castrado;
        this.nomeOng = nomeOng;
    }

    @Override
    public String toString() {
        return "Animal: " + '\n' +
                "Nome:" + nome +  '\n' +
                "Idade: " + idade + '\n' +
                "Está Saudável: " + estaSaudavel + '\n' +
                "Caracteristicas: " + caracteristicas +  '\n' +
                "Filhote: " + filhote + '\n' +
                "Castrado: " + castrado + '\n' +
                "Nome da Ong:" + nomeOng;
    }
}
