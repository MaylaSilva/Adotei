package br.com.ada.adotei.modelo;

import br.com.ada.adotei.businessobject.EnumRacaGato;

public class Gato extends Animal{
    private Character usaCaixa;
    private EnumRacaGato raca;

    public Gato(String nome, EnumRacaGato raca, Integer idade, String caracteristicas, Character estaSaudavel,
                Character filhote, Character castrado, Character usaCaixa) {
        super(nome, idade, caracteristicas, estaSaudavel, filhote, castrado);
        this.usaCaixa = usaCaixa;
        this.raca = raca;
    }

}
