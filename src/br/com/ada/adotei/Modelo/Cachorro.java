package br.com.ada.adotei.Modelo;


import br.com.ada.adotei.BusinessObject.EnumPorte;
import br.com.ada.adotei.BusinessObject.EnumRacaCachorro;

public class Cachorro extends Animal {
    private EnumPorte porte;
    private EnumRacaCachorro raca;

    public Cachorro(String nome, Integer idade, String caracteristicas, Boolean estaSaudavel,
                Boolean filhote, Boolean castrado, EnumRacaCachorro raca, EnumPorte porte, Ong nomeOng) {
        super(nome, idade, caracteristicas, estaSaudavel, filhote, castrado, nomeOng);
        this.raca = raca;
        this.porte = porte;
    }
}
