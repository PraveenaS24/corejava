package com.chainsys.classandmethods;
/**
*This a class that contains employee related data
*The person has id ,name,city and salary properties
/**
 * @author prav3109
 *
 */
public class Employee {
	private final int empID;
	private String name;
	private long salary;
	private String city;
	//construct
	public Employee(int id)
	{
		//assigning value to read-only field
		this.empID=id;
		
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getEmpID() {
	return empID;
}
public String getCity()
{
	return city;
}
public void setCity(String city)
{
	this.city=city;
}
public long getSalary()
{
	return salary;
}
public void setSalary(long salary)
{
	this.salary=salary;
}

}



