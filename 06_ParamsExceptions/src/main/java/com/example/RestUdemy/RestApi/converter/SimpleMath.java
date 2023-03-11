package com.example.RestUdemy.RestApi.converter;

public class SimpleMath {		
		
	public Double soma(Double numeroUm, Double numeroDois) { 	
		return numeroUm + numeroDois; 
	}
		
	public double sub(Double numeroUm, Double numeroDois) {
		return numeroUm - numeroDois;
	}
		
	public double div(Double numeroUm, Double numeroDois) {
		return numeroUm / numeroDois;
	}
		
	public double mult(Double numeroUm, Double numeroDois) {			
		return numeroUm * numeroDois;
	}
	
	public double raiz(Double numeroUm) {	
		return Math.sqrt(numeroUm);
	}	
	
	public double quadrado(Double numeroUm) {	
		return numeroUm * numeroUm;
	}	
	
	public double media(Double numeroUm, Double numeroDois) {
		return (numeroUm + numeroDois) / 2;
	}
	
}
