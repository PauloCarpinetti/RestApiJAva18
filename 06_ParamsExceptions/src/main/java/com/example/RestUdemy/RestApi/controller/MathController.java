package com.example.RestUdemy.RestApi.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestUdemy.RestApi.converter.NumberConverter;
import com.example.RestUdemy.RestApi.converter.SimpleMath;
import com.example.RestUdemy.RestApi.exception.UnsupportedMathOperationException;

@RestController
public class MathController {
	
		
	private SimpleMath math = new SimpleMath(); 
	
	
	@RequestMapping(value = "/soma/{numeroUm}/{numeroDois}",
			method=RequestMethod.GET)
	public double soma(
			@PathVariable(value = "numeroUm") String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois
		) throws Exception {	
		
		if (!NumberConverter.isNumeric(numeroUm) || !NumberConverter.isNumeric(numeroDois)) {
			throw new UnsupportedMathOperationException("Digite apenas números!");
		}
		return math.soma(NumberConverter.convertToDouble(numeroUm),  NumberConverter.convertToDouble(numeroDois));
	}
	
	@RequestMapping(value = "/sub/{numeroUm}/{numeroDois}",
			method=RequestMethod.GET)
	public double sub(
			@PathVariable(value = "numeroUm") String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois
		) throws Exception {	
		
		if (!NumberConverter.isNumeric(numeroUm) || !NumberConverter.isNumeric(numeroDois)) {
			throw new UnsupportedMathOperationException("Digite apenas números!");
		}
		return math.sub(NumberConverter.convertToDouble(numeroUm),  NumberConverter.convertToDouble(numeroDois));
	}
	
	@RequestMapping(value = "/div/{numeroUm}/{numeroDois}",
			method=RequestMethod.GET)
	public double div(
			@PathVariable(value = "numeroUm") String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois
		) throws Exception {	
		
		if (!NumberConverter.isNumeric(numeroUm) || !NumberConverter.isNumeric(numeroDois)) {
			throw new UnsupportedMathOperationException("Digite apenas números!");
		}
		return math.div(NumberConverter.convertToDouble(numeroUm),  NumberConverter.convertToDouble(numeroDois));
	}
	
	@RequestMapping(value = "/mult/{numeroUm}/{numeroDois}",
			method=RequestMethod.GET)
	public double mult(
			@PathVariable(value = "numeroUm") String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois
		) throws Exception {	
		
		if (!NumberConverter.isNumeric(numeroUm) || !NumberConverter.isNumeric(numeroDois)) {
			throw new UnsupportedMathOperationException("Digite apenas números!");
		}
		return math.mult(NumberConverter.convertToDouble(numeroUm),  NumberConverter.convertToDouble(numeroDois));
	}
	
	@RequestMapping(value = "/raiz/{numeroUm}",
			method=RequestMethod.GET)
	public double raiz(
			@PathVariable(value = "numeroUm") String numeroUm
			
		) throws Exception {	
		
		if (!NumberConverter.isNumeric(numeroUm) ) {
			throw new UnsupportedMathOperationException("Digite apenas números!");
		}
		 
		return math.raiz(NumberConverter.convertToDouble(numeroUm));
	}
	
	@RequestMapping(value = "/quadrado/{numeroUm}",
			method=RequestMethod.GET)
	public double quadrado(
			@PathVariable(value = "numeroUm") String numeroUm
			
		) throws Exception {	
		
		if (!NumberConverter.isNumeric(numeroUm) ) {
			throw new UnsupportedMathOperationException("Digite apenas números!");
		}
		 
		return math.quadrado(NumberConverter.convertToDouble(numeroUm));
	}
	
	@RequestMapping(value = "/media/{numeroUm}/{numeroDois}",
			method=RequestMethod.GET)
	public double media(
			@PathVariable(value = "numeroUm") String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois
		) throws Exception {	
		
		if (!NumberConverter.isNumeric(numeroUm) || !NumberConverter.isNumeric(numeroDois)) {
			throw new UnsupportedMathOperationException("Digite apenas números!");
		}
		 
		return math.media(NumberConverter.convertToDouble(numeroUm),  NumberConverter.convertToDouble(numeroDois));
	}
	
}
