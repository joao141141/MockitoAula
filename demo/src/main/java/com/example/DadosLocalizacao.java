package com.example;

public class DadosLocalizacao {
    private final String uf;
    private final String cidade;
    private final String rua;
    private final String complemento;
    private String bairro;


    public DadosLocalizacao(final String uf, final String cidade, final String rua, final String complemento){
        this.uf = uf;
        this.cidade = cidade;
        this.rua = rua;
        this.complemento = complemento;
    }

    public String getUf(){
        return uf;
    }
    public String getCidade(){
        return cidade;
    }
    public String getRua(){
        return rua;
    }
    public String getBairro(){
        return bairro;
    }
    public String getComplemento(){
        return complemento;
    }

}
