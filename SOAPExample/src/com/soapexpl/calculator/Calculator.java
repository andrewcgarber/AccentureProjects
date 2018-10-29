package com.soapexpl.calculator;

import javax.jws.*;

@WebService(serviceName="CalculatorProgram")
public class Calculator {
	
	@WebMethod
	public int func (int a, int b){
		int result = a + b;
		return result;
	}

}
