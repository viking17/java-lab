package ResultsPackage;

import java.util.*;
import java.io.*;
import ResultsPackage.StudentPackage.RegisterStudent;

public class Results
{
	public ArrayList<Float> grades = new ArrayList<Float>();
	RegisterStudent student1 = new RegisterStudent();

	public Results()
	{
		student1.getDetails();
	}

	public void enterGrades()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < student1.sems; i++)
		{
			try
			{
				System.out.println("Enter grades for sem " + (i+1) + ": ");
				float grade1 = sc.nextFloat();
				if(grade1 > 10 || grade1 < 0)
				{
					i--;
					throw new GradeException("Grade exception!");
				}
				else
					grades.add(grade1);
			}
			catch(NumberFormatException n)
			{
				System.out.println(n.getMessage());
			}
			catch(GradeException g)
			{
				System.out.println(g.getMessage());
			}
		}
	}

	public void displayDetails()
	{
		System.out.println("\nName: " + student1.name + "\nBranch: " + student1.branch);
		System.out.println("Semester: ");
		for(int i = 0; i < student1.sems; i++)
		{
			System.out.println("Sem " + (i+1) + ": ");
			System.out.println("Credits: " +  student1.credits.get(i) + "\tSGPA: " + grades.get(i));
		}
		int totalCreds = 0;
		float CGPA, gradePoints = 0;
		for(int i = 0; i < student1.sems; i++)
		{
			totalCreds += student1.credits.get(i);
			gradePoints += student1.credits.get(i) * grades.get(i);
		}
		CGPA = gradePoints/totalCreds;
		System.out.println("CGPA: " + CGPA);
	}
}

class GradeException extends Exception
{
	GradeException(String S)
	{
		super(S);
	}
}