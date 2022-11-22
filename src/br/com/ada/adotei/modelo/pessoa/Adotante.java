package br.com.ada.adotei.modelo.pessoa;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;

public class Adotante extends Pessoa{
    private String cpf;
    private EscolhaSouN casaProtegida;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EscolhaSouN getCasaProtegida() {
        return casaProtegida;
    }

    public void setCasaProtegida(EscolhaSouN casaProtegida) {
        this.casaProtegida = casaProtegida;
    }

    public Adotante(String nome, String cpf, Endereco endereco, String telefone, String email, EscolhaSouN casaProtegida) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.casaProtegida = casaProtegida;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "CPF: " + cpf + '\n' +
                "Sua Casa está pronta para receber seu novo pet? " + casaProtegida;
    }
}
