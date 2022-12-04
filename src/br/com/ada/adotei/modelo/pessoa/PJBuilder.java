package br.com.ada.adotei.modelo.pessoa;

import java.time.LocalDate;

public class PJBuilder {

    private String nome;
    private String cnpj;
    private Endereco endereco;
    private String telefone;
    private String email;
    private LocalDate dataAbertura;
    private String site;


    public PJBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PJBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public PJBuilder endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public PJBuilder telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public PJBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PJBuilder dataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
        return this;
    }

    public PJBuilder site(String site) {
        this.site = site;
        return this;
    }
     public Ong build(){
        Ong ongCriada = new Ong(nome,cnpj,endereco,dataAbertura,telefone,email,site);
                return ongCriada;
     }
}
