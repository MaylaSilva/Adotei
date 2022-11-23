package br.com.ada.adotei.modelo.pessoa;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;

public class PFBuilder {
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String cpf;
    private EscolhaSouN casaProtegida;


    public PFBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PFBuilder endereco (Endereco endereco) {
        this.endereco = endereco;
        return this;
    }
    public PFBuilder telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public PFBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PFBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PFBuilder casaProtegida(EscolhaSouN casaProtegida) {
        this.casaProtegida = casaProtegida;
        return this;
    }
    public Adotante build (){
        Adotante adotanteCriado = new Adotante(nome, cpf, endereco, telefone, email, casaProtegida);
        return adotanteCriado;
    }
}
