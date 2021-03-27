package com.jgodoy;

public class VeiculoPassageiros implements Veiculo{
	String placa;
	String marca;
	String modelo;
	int ano;
	double valor;
	int nroPass;

	public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nroPass){
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.nroPass = nroPass;
	}

	public String getPlaca(){
		return placa;
	}

	public String getMarca(){
		return marca;
	}

	public String getModelo(){
		return modelo;
	}

	public int getAno(){
		return ano;
	}

	public double getValor(){
		return valor;
	}

    public String getTipo(){
		return "Passageiro";
	}

	public void setPlaca(String placa){
		this.placa = placa;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public void setValor(double valor){
		this.valor = valor;
	}
}