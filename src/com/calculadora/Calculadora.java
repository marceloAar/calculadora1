//Marcelo Aceituno R
//Full Stack JAVA 0034
//Calculadora Parte 1
package com.calculadora;

public class Calculadora {
	
	private double operandOne;
	private String operation="";
	private double operandTwo;		
	
	public Calculadora() {
		
	}
		
	public double performOperation() {
		
		if (operation.equals("+")) {
			
			System.out.print("Sumando... ");					
			return this.operandOne + this.operandTwo;
		}
		else if (operation.equals("-")) {	
			
			System.out.print("Restando... ");
			return this.operandOne - this.operandTwo;
		}
		else {
			System.out.println("Operador no valido...");
			return 0;
		}		
	}
	
	public void getResult() {
		System.out.println( " = "+performOperation() );
		
	}
	
	//Get y Set
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

}
