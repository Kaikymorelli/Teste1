package com.teste.calculos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName ("Teste 5 + 5 = 10")
	void testsum() {
	//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		Assertions.assertEquals(esperado, resultado, "5 + 5 nao gerou o valor 10");
	}
	
	@Test
	@DisplayName ("Teste 10 - 5 = 5")
	void testsub() {
	//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 10D;
		double valor2 = 5D;
		double esperado = 5D;
		
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		Assertions.assertEquals(esperado, resultado, "10 - 5 nao gerou o valor 5");
	}
	
	@Test
	@DisplayName ("Teste 10 * 5 = 50")
	void testmult() {
	//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 10D;
		double valor2 = 5D;
		double esperado = 50D;
		
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		Assertions.assertEquals(esperado, resultado, "10 * 5 nao gerou o valor 50");
	}
	
	@Test
	@DisplayName ("Teste 50 / 5 = 10")
	void testdiv() {
	//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 50D;
		double valor2 = 5D;
		double esperado = 10D;
		
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		Assertions.assertEquals(esperado, resultado, "50 / 5 nao gerou o valor 10");
	}

}
