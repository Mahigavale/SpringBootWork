package jdbc;
import java.util.Scanner;

public class throwkeyword {

	public static void main(String args[])
	{
		String opinion="yes";
		Scanner scan=new Scanner(System.in);
		while(opinion.equals("yes"))
		{
		System.out.println("please enter the age you want to check for the waiting....!");
		int age=scan.nextInt();
		try {
		if(age<21)
		{
			throw new maheshgavaleexception("bhava you are not eligible to vote...!");
		}
		else
		{
			System.out.println("you are eligible to vote...!");
		}
		}
		catch(maheshgavaleexception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		finally {
			System.out.println("the program is executed...!");
		}
		
		System.out.println("please enter the choose the state of residence : 1- for maharshtra, 2-for amy other");
		int check=scan.nextInt();
		try {
			if(check==1)
			{
				System.out.println("you are eligible to vote here...:");
			}
			else
			{
				throw new maheshgavaleexception2("you cannot vote outside the native state:");
			}
			
		}
		catch(maheshgavaleexception2 ex){
			System.out.println(ex.getLocalizedMessage());
			
		}
		System.out.println("what do you want to now?");
		System.out.println("please enter yes to continue to check youe eligibilty:");
		System.out.println("please enter no to exit the application:");
		opinion=scan.next();
	}
		System.out.println("the program is exited:");
		
}
}

