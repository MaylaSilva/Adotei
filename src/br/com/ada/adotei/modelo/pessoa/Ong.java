package br.com.ada.adotei.modelo.pessoa;

import java.time.LocalDate;

public class Ong extends Pessoa {

    private String cnpj;
    private LocalDate dataAbertura;
    private String site;

     public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

     public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
         this.dataAbertura = dataAbertura;
    }

     public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Ong(String nome, String cnpj, Endereco endereco, LocalDate dataAbertura, String telefone, String email, String site) {
        super(nome,endereco, telefone, email);
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
        this.site = site;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "CNPJ: " + cnpj + '\n' +
                "Data de abertura: " + dataAbertura + '\n' +
                "Site: " + site + '\n' +
                "--------------------------------------------";
    }
}
