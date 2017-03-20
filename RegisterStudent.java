package studentPackage;
import java.util.*;
import java.io.*;
/*
Write a Java Program that does the following related to Packages and Interfaces , Exception
Handling:
a. Create an interface Student which gets the name and branch of a student.
b. Create a package called ‘StudentPackage’ which has a user-defined class
RegisterStudent.
c. If a student registers above 30 credits for the semester, the method should throw a
user-defined exception called ‘CreditLimit’ and display an appropriate message.
d. Create another package called ‘ResultPackage’ which displays the grade for the
subject registered for particular semester and if the CGPA is in invalid format 
throw NumberFormatException also if CGPA is above 10 then throws an
InvalidCGPA user-defined exception.
e. Collect the marks of all the semesters and display the SGPA with minimum
calculation of 4 semesters.
*/
interface student{
	public void getDetails();
}
public class RegisterStudent implements student{
	
	public String name = new String();
	public String branch = new String();
	public int sems  = 0;
	public int total_credit = 0;
	public int[] credit;
	
	Scanner in = new Scanner(System.in);
	
	
	public HashMap<Integer,int[]> hmap = new HashMap<>();
	
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("enter name, branch and sem number.");
		name = in.next();
		branch = in.next();
		sems = in.nextInt();
	
		for(int i = 0 ;i<sems; i++)
		{
			credit = new int[6];
			int sum = 0;
			System.out.println("enter the credits of the 6 subjects.");
			for(int j = 0 ; j < 6 ;j++)
			{
				credit[j] = in.nextInt();
				sum += credit[i];
			}
			try{
				if(sum >30)
					throw new creditLimitException("credit limit");
				else
					hmap.put(i,credit);
				
			}
			catch(Exception e)
			{
				i--;
				System.out.println("credit limit.");
			}
			
			
		}
	}
}
