/**
 * 
 */
package com.chainsys.classandmethods;

/**
 * @author prav3109
 *
 /**
	 * @param args
	 */
public class Car {

   private final String RegNo;
   private int yearOfPurchase;
   private String color;
   private String fuel;
   
   public Car (String rno)
   {
	   this.RegNo=rno;
	}

public int getYearOfPurchase() {
	return yearOfPurchase;
}

public void setYearOfPurchase(int yearOfPurchase) {
	this.yearOfPurchase = yearOfPurchase;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getFuel() {
	return fuel;
}

public void setFuel(String fuel) {
	this.fuel = fuel;
}

public String getRegNo() {
	// TODO Auto-generated method stub
	return RegNo;
}


}


