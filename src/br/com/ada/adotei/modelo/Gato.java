package br.com.ada.adotei.modelo;

import br.com.ada.adotei.businessobject.EscolhaSouN;
import br.com.ada.adotei.businessobject.EscolheRacaGato;

public class Gato extends Animal{
    private EscolhaSouN usaCaixa;
    private EscolheRacaGato raca;

    public Gato(String nome, EscolheRacaGato raca, Integer idade, String caracteristicas, EscolhaSouN estaSaudavel,
                EscolhaSouN castrado, EscolhaSouN usaCaixa) {
        super(nome, idade, caracteristicas, estaSaudavel, castrado);
        this.usaCaixa = usaCaixa;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Raça: " + raca + '\n' +
                "O gatinho usa caixa? " + usaCaixa + '\n';
    }
}
