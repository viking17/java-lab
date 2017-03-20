/* Write a Java Program that does the following related to Inheritance:
a. Create an abstract class called Vehicle which contains the ‘year_of_manufacture’
data member and two abstract methods ‘getData()’ and ‘putData()’ with a
constructor.
b. Create two derived classes “TwoWheeler” and “FourWheeler” and implement the
abstract methods. Make “FourWheeler” as final class.
c. Create class ‘MyTwoWheeler’ which is a sub-class of “TwoWheeler” and
demonstrate the use of super keyword to initialize data members of
“MyTwoWheeler”. */

import java.util.*;
import java.io.*;

abstract class vehicle{
	int year;

	vehicle(int y)
	{
		this.year = y;
	}

	abstract public void getData();
	abstract public void puData();
}

class twoWheeler extends vehicle{
	String name_vehicle = "";
	String color = "";
	Scanner in = new Scanner(System.in);

	

	twoWheeler(int year)
	{
		super(year);
	}



	public void getData()
	{
		System.out.println("enter manufacturer name and color.");
		name_vehicle = in.next();
		color = in.next();
	}

	public void puData()
	{
		System.out.println("year of manufacture : "+super.year);
	}
}

class myTwoWheeler extends twoWheeler{
	
	String model = "";

	myTwoWheeler(int s,String m)
	{
		super(s);
		model = m;
	}

	Scanner x = new Scanner(System.in);
	String name  = x.next();


	public void disp()
	{
		System.out.println("name : "+name);
		System.out.println("vehicle name : "+super.name_vehicle);
		System.out.println("color : "+super.color);
		System.out.println("model : "+model);
	}
}

public class myVehicle{
	public static void main(String[] args)
	{
		myTwoWheeler m = new myTwoWheeler(1994,"ninja");
		m.getData();
		m.disp();
		m.puData();
	}
}