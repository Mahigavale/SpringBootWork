package jdbc;

import java.util.Scanner;

public class throwskeyword {

	public static void main (String args[])throws maheshgavaleexception
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=scan.nextInt();
		System.out.println("please the number of your state 1-for maharashtra, 2- for others");
		int state=scan.nextInt();
		 
		eligibilty ent= new eligibilty();
		try {
		ent.checkeligibilty(age, state);
		}
		finally 
		{
			System.out.println("the program executed sucessfully>");
		}
		}
		
		
		
}

  class eligibilty{
	
	public void checkeligibilty(int age,int state)throws maheshgavaleexception{
		if(age<18)
		{
			throw new maheshgavaleexception("eneligible to vote!");
		}
		else 
		{
			System.out.println("you are permitted to vote:");
		}
		if(state !=1)
		{
			throw new maheshgavaleexception("eneligible to vote here!");
		}
		
		
	}

}