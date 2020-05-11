package seguradora.cesusc;

import java.sql.Date;

public class TipoBemVeiculo extends Bem implements BemRastreavel {
	private String marca;
	private int ano;
	private String placa;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public int calculaRisco(Double valorBem) {
		int risco =0;
		if (ano < 2000) {
			risco = 10;
		} else if (ano <2010) {
			risco = 5;
		} else if (ano <2015) {
			risco = 3;
		} else risco = 1;
		
		return risco;
	}

	@Override
	public double calculaValorPromocional(Double valorBem) {
		// TODO Auto-generated method stub
		return valorBem * 0.9;
	}

	@Override
	public String getCoordenadas() {
		// TODO Auto-generated method stub
		return "(-43,76 ; -22,15)";
	}

	@Override
	public Date getDatahora() {
		// TODO Auto-generated method stub
		return new Date(2020,8,10);
	}

}
