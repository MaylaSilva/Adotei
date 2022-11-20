package br.com.ada.adotei.modelo;


import br.com.ada.adotei.businessobject.EnumPorte;
import br.com.ada.adotei.businessobject.EnumRacaCachorro;

public class Cachorro extends Animal {
    private EnumPorte porte;
    private EnumRacaCachorro raca;

    public Cachorro(String nome, Integer idade, String caracteristicas, Character estaSaudavel,
                Character filhote, Character castrado, EnumRacaCachorro raca, EnumPorte porte, Ong nomeOng) {
        super(nome, idade, caracteristicas, estaSaudavel, filhote, castrado);
        this.raca = raca;
        this.porte = porte;
    }
}
