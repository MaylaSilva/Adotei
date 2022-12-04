package br.com.ada.adotei.modelo.pessoa;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import java.time.LocalDate;

public class Adotante extends Pessoa{
    private LocalDate dataDeNascimento;
    private String cpf;
    private EscolhaSouN casaProtegida;

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        if (dataDeNascimento.getYear() < 18){
            System.out.println("Infelizmente só podemos doar nossos animais para maiores de idade");
        } else {
            this.dataDeNascimento = dataDeNascimento;
        }
    }

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

    public Adotante(String nome, LocalDate dataDeNascimento, String cpf, Endereco endereco, String telefone, String email, EscolhaSouN casaProtegida) {
        super(nome, endereco, telefone, email);
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.casaProtegida = casaProtegida;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Data de Nascimento: " + dataDeNascimento + '\n' +
                "CPF: " + cpf + '\n' +
                "Sua Casa está pronta para receber seu novo pet? " + casaProtegida;
    }
}
