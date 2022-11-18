package br.com.ada.adotei.Modelo;

import java.util.Date;

public class Ong {
    private String nome;
    private String CNPJ;
    private String endereco;
    private Integer dataAbertura;
    private String telefone;
    private String email;
    private String site;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Integer dataAbertura) {
        this.dataAbertura = dataAbertura;
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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Ong(String nome, String CNPJ, String endereco, Integer dataAbertura, String telefone, String email, String site) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.dataAbertura = dataAbertura;
        this.telefone = telefone;
        this.email = email;
        this.site = site;
    }

    @Override
    public String toString() {
        return "Ong: " +
                "Nome:  " + nome + '\'' +
                "CNPJ: " + CNPJ + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataAbertura=" + dataAbertura +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
