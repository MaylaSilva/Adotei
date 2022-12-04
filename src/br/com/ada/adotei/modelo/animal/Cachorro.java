package br.com.ada.adotei.modelo.animal;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.businessobject.escolhe.EscolhePorteCachorro;
import br.com.ada.adotei.businessobject.escolhe.EscolheRacaCachorro;

import java.time.LocalDate;

public class Cachorro extends Animal {
    private EscolhePorteCachorro porte;
    private EscolheRacaCachorro raca;

    public Cachorro(String nome, EscolheRacaCachorro raca, EscolhePorteCachorro porte, int idade, String caracteristicas, EscolhaSouN estaSaudavel,
                    EscolhaSouN castrado) {
        super(nome, idade, caracteristicas, estaSaudavel, castrado);
        this.raca = raca;
        this.porte = porte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Raça: " + raca  + '\n' +
                "" + porte + '\n';
    }
}
