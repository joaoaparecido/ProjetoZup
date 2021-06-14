package com.ProjetoZup.ProjetoZup.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FipeResponseValor {
    private String Valor;
    private String Marca;
    private String Modelo;
    private int AnoModelo;
    private String Combustivel;
    private String CodigoFipe;
    private String MesReferencia;
    private int TipoVeiculo;
    private String SiglaCombustivel;
    
    @JsonProperty("Valor") 
    public String valor;
    @JsonProperty("Marca") 
    public String marca;
    @JsonProperty("Modelo") 
    public String modelo;
    @JsonProperty("AnoModelo") 
    public int anoModelo;
    @JsonProperty("Combustivel") 
    public String combustivel;
    @JsonProperty("CodigoFipe") 
    public String codigoFipe;
    @JsonProperty("MesReferencia") 
    public String mesReferencia;
    @JsonProperty("TipoVeiculo") 
    public int tipoVeiculo;
    @JsonProperty("SiglaCombustivel") 
    public String siglaCombustivel;


    // Getter Methods

    public String getValor() {
        return Valor;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public float getAnoModelo() {
        return AnoModelo;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public String getCodigoFipe() {
        return CodigoFipe;
    }

    public String getMesReferencia() {
        return MesReferencia;
    }

    public float getTipoVeiculo() {
        return TipoVeiculo;
    }

    public String getSiglaCombustivel() {
        return SiglaCombustivel;
    }

    // Setter Methods

    public void setValor( String Valor ) {
        this.Valor = Valor;
    }

    public void setMarca( String Marca ) {
        this.Marca = Marca;
    }

    public void setModelo( String Modelo ) {
        this.Modelo = Modelo;
    }

    public void setAnoModelo( float AnoModelo ) {
        this.AnoModelo = (int) AnoModelo;
    }

    public void setCombustivel( String Combustivel ) {
        this.Combustivel = Combustivel;
    }

    public void setCodigoFipe( String CodigoFipe ) {
        this.CodigoFipe = CodigoFipe;
    }

    public void setMesReferencia( String MesReferencia ) {
        this.MesReferencia = MesReferencia;
    }

    public void setTipoVeiculo( float TipoVeiculo ) {
        this.TipoVeiculo = (int) TipoVeiculo;
    }

    public void setSiglaCombustivel( String SiglaCombustivel ) {
        this.SiglaCombustivel = SiglaCombustivel;
    }
}


