package com.chainsys.InterfaceCalculator;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int output = cal.add(10, 5);
		System.out.println(output);
		output = cal.multiply(10, 5);
		System.out.println(output);
		output = cal.divide(10, 5);
		System.out.println(output);

	}
}

//public static void testA()
//{
//	public static void testMarket()
//	{
//		CalculatorB firstCalculator=new CalculatorB();
//		if(firstCalculator instanceof ICalculator)
//		{
//			ICalculator constract=firstCalculator;
//			int output=0;
//			output=constract.multiply(10,5);
//			System.out.println(output);
//			output=constract.add(10,5);
//			System.out.println(output);
//			output=constract.divide(10,5);
//			System.out.println(output);
//		}
//		else
//			System.out.println(firstCalculator.getClass().getName() +
//					"does not Implement ICalculator");
//	}
//}
	