package com.jgodoy;

public class VeiculoUtilitario implements Veiculo{
    String modelo;
    String placa;
    String marca;
    double valor;
    int capCargaTon;
    int nroEixos;
    int ano;

    
    public VeiculoUtilitario(String modelo, String placa, String marca, double valor, int capCargaTon, int nroEixos, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
        this.capCargaTon = capCargaTon;
        this.nroEixos = nroEixos;
        this.ano = ano;
    }

    public int getCapCargaTon() {
        return capCargaTon;
    }

    public void setCapCargaTon(int capCargaTon) {
        this.capCargaTon = capCargaTon;
    }

    public int getNroEixos() {
        return nroEixos;
    }

    public void setNroEixos(int nroEixos) {
        this.nroEixos = nroEixos;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setAno(int ano) {
       this.ano = ano;
        
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;   
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void setValor(double valor) {
       this.valor=valor;
        
    }  

    public String getTipo(){
		return "Utilitario";
	}
}

