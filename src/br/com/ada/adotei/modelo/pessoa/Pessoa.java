package br.com.ada.adotei.modelo.pessoa;

import br.com.ada.adotei.modelo.Identificavel;

public class Pessoa implements Identificavel {

    private int id;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa(String nome, Endereco endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "--------------------------------------------" + '\n' +
                "Id: " + id + " - " +
                "Nome: " + nome + '\n' +
                "Endereco: " + endereco + '\n' +
                "Telefone: " + telefone + '\n' +
                "Email: " + email ;
    }
}
