package br.com.ada.adotei.modelo.animal;

import br.com.ada.adotei.businessobject.escolhe.EscolhaSouN;
import br.com.ada.adotei.businessobject.escolhe.EscolheRacaGato;
public class GatoBuilder {
    private String nome;
    private Integer idade;
    private EscolhaSouN estaSaudavel;
    private String caracteristicas;
    private EscolhaSouN castrado;
    private EscolhaSouN usaCaixa;
    private EscolheRacaGato raca;

    public GatoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public GatoBuilder idade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public GatoBuilder estaSaudavel(EscolhaSouN estaSaudavel) {
        this.estaSaudavel = estaSaudavel;
        return this;
    }

    public GatoBuilder caracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
        return this;
    }

    public GatoBuilder castrado(EscolhaSouN castrado) {
        this.castrado = castrado;
        return this;
    }

    public GatoBuilder usaCaixa(EscolhaSouN usaCaixa) {
        this.usaCaixa = usaCaixa;
        return this;
    }

    public GatoBuilder raca(EscolheRacaGato raca) {
        this.raca = raca;
        return this;
    }
    public Gato build(){
        Gato gatoCriado = new Gato(nome,raca,idade,caracteristicas,estaSaudavel,castrado,usaCaixa);
                return gatoCriado;
    }
}
