package edu.lessons.day60.oops.abstractclass;

public class TestAbsDemoB {
	public static void main(String [] args)
	{
		testDemoB();
	}
	public static void testDemoB() {
	// abstract class can not be instantiated
//	AbsDemoB objectDemob=new AbsDemoB();
	AbsDemoB objectDemob=new DemoBChild();
	objectDemob.echo();
}
}
