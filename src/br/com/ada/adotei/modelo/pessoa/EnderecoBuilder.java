package br.com.ada.adotei.modelo.pessoa;

public class EnderecoBuilder {
    String nomeDaRua;
    String cep;
    String cidade;
    String estado;

    public EnderecoBuilder nomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
        return this;
    }

    public EnderecoBuilder cep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public EnderecoBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }
    public Endereco build (){
        Endereco enderecoCriado = new Endereco(nomeDaRua,cep,cidade,estado);
        return enderecoCriado;
    }
}
