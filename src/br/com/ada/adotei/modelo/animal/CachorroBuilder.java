package br.com.ada.adotei.modelo.animal;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.businessobject.escolhe.EscolhePorteCachorro;
import br.com.ada.adotei.businessobject.escolhe.EscolheRacaCachorro;

public class CachorroBuilder {
    private String nome;
    private Integer idade;
    private EscolhaSouN estaSaudavel;
    private String caracteristicas;
    private EscolhaSouN castrado;
    private EscolhePorteCachorro porte;
    private EscolheRacaCachorro raca;

    public CachorroBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public CachorroBuilder idade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public CachorroBuilder estaSaudavel(EscolhaSouN estaSaudavel) {
        this.estaSaudavel = estaSaudavel;
        return this;
    }

    public CachorroBuilder caracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
        return this;
    }

    public CachorroBuilder castrado(EscolhaSouN castrado) {
        this.castrado = castrado;
        return this;
    }

    public CachorroBuilder porte(EscolhePorteCachorro porte) {
        this.porte = porte;
        return this;
    }

    public CachorroBuilder raca(EscolheRacaCachorro raca) {
        this.raca = raca;
        return this;
    }
    public Cachorro build(){
        Cachorro cachorroCadastrado = new Cachorro(nome,raca,porte,idade,caracteristicas,estaSaudavel,castrado);
        return cachorroCadastrado;
    }
}
