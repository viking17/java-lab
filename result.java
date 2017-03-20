package resultPackage;

import studentPackage.*;
import java.util.*;
import java.io.*;

public class result extends RegisterStudent{
	RegisterStudent student = new RegisterStudent();
	Scanner in = new Scanner(System.in);
	
	public String[] marks = new String[5];
	public result()
	{
		student.getDetails();
	}
	
	//public HashMap<Integer,String> hmap = new HashMap<>();
	public int[] grades;
	public int[] g = new int[6];
	
	public void enterGrades()
	{
		for(int i = 0 ; i < student.sems;i++)
		{
			grades = new int[6];
			System.out.println("enter the grades of the 6 subjects");
			float total = 0;
			float t = 0;
			for(int j = 0 ; j < 6 ; j++)
			{
				grades[j] = in.nextInt();
			}
			
			System.out.println("i + "+i);
			int[] c = student.hmap.get(i);
			
			for(int j = 0 ; j < 6 ; j++)
			{
				total += (grades[j]*c[j]);
			}
			

			for(int k = 0; k < 6 ;k++)
			{
				 t += c[k];
			}
		
			try{
				
				
				if(total / t > 10)
				{
					throw new gradeException("grade exception");
				}
			}
			
			catch(gradeException e)
			{
					System.out.println("grade exception.");
					
			}
			System.out.println("SGPA : "+(total/t));
		}
		
		
		
	}
	
	public void display_grades(){
		for(int i = 0 ; i < 6 ; i++)
		{
			int j = grades[i];
			switch(j)
			{
				case 10:System.out.println("S");
						break;
				case 9:System.out.println("A");
						break;
				case 8:System.out.println("B");
						break;
				case 7:System.out.println("C");
						break;
				case 6:System.out.println("D");
						break;
				default:System.out.println("F");
			}
		}
	}
}

