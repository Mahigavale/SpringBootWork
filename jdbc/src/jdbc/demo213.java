package jdbc;

class cdexception extends Exception{
	 public cdexception(String str)
	 {
		 super(str);
	 }
}

public class demo213 {

	public static void main(String[] args) throws cdexception  {
		
	
		
		int age=12;
	
	if(age<18)
	{
		throw new cdexception("nako re baba vote karu tu!");
	}
	else {
		System.out.println("yes you are eligible to vote....!");
	}
	

	}

}