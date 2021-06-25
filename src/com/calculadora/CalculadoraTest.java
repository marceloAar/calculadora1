//Marcelo Aceituno R
//Full Stack JAVA 0034
//Calculadora Parte 1
package com.calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		//Sumar
		calc.setOperandOne(10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2); 
		calc.performOperation(); 
		calc.getResult();
		
		//Restar
		calc.setOperandOne(10.5);
		calc.setOperation("-");
		calc.setOperandTwo(5.2); 
		calc.performOperation(); 
		calc.getResult(); 

	}
}
