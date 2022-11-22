package br.com.ada.adotei.modelo.pessoa;

public class Endereco {
    String nomeDaRua;
    String cep;
    String cidade;
    String estado;

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Endereco(String nomeDaRua, String cep, String cidade, String estado) {
        this.nomeDaRua = nomeDaRua;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nomeDaRua + " - " +
                "CEP " + cep + " / " +
                cidade + '/' +
                estado;
    }
}
