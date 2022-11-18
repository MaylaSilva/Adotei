package br.com.ada.adotei.Modelo;

import br.com.ada.adotei.BusinessObject.EnumRacaGato;

public class Gato extends Animal{
    private Boolean usaCaixa;
    private EnumRacaGato raca;

    public Gato(String nome, Integer idade, String caracteristicas, Boolean estaSaudavel,
                Boolean filhote, Boolean castrado, Boolean usaCaixa, EnumRacaGato raca, Ong nomeOng) {
        super(nome, idade, caracteristicas, estaSaudavel, filhote, castrado, nomeOng);
        this.usaCaixa = usaCaixa;
        this.raca = raca;
    }

}
