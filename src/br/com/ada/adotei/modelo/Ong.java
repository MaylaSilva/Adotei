package br.com.ada.adotei.modelo;

public class Ong extends Pessoa{

    private String CNPJ;
    private Integer dataAbertura;
    private String site;

     public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

     public Integer getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Integer dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

     public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Ong(String nome, String CNPJ, Endereco endereco, Integer dataAbertura, String telefone, String email, String site) {
        super(nome,endereco, telefone, email);
        this.CNPJ = CNPJ;
        this.dataAbertura = dataAbertura;
        this.site = site;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "CNPJ: " + CNPJ + '\n' +
                "Data de abertura: " + dataAbertura + '\n' +
                "Site: " + site + '\n' +
                "--------------------------------------------";
    }
}
