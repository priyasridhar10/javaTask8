package javaintrotask;

import java.util.Scanner;

public class CheckSeniorCitizen {
	
	public static void main( String[] args)
	{
		
		// Get  the name and Age of the person a
		System.out.println(" Enter the name of person ");
		Scanner person1 =new Scanner(System.in);
		String name = person1.next();
		System.out.println(" Enter the age of person ");
		Scanner person =new Scanner(System.in);
		int age = person.nextInt();
		if (age>=60 )
		{
			System.out.println("Name :" +name +": The person is Senior citizen");
		}
		else
		{
			System.out.println("Name :" +name +": The person is not Senior citizen");
		}
			
	}

}
