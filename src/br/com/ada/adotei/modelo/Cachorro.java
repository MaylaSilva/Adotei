package br.com.ada.adotei.modelo;


import br.com.ada.adotei.businessobject.EnumPorte;
import br.com.ada.adotei.businessobject.EnumRacaCachorro;

public class Cachorro extends Animal {
    private EscolhePorteCachorro porte;
    private EscolheRacaCachorro raca;

    public Cachorro(String nome, EscolheRacaCachorro raca, EscolhePorteCachorro porte, Integer idade, String caracteristicas, EscolhaSouN estaSaudavel,
                EscolhaSouN castrado) {
        super(nome, idade, caracteristicas, estaSaudavel, castrado);
        this.raca = raca;
        this.porte = porte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Raça: " + raca + '\n' +
                "Porte do cãozinho: " + porte;
    }
}
