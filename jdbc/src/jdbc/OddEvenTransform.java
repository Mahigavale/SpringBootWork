package jdbc;


public class OddEvenTransform {

	public static void main(String args[])
	{	data d=new data();
	String s1=null;
	

	
	 int[] arr1= new int[] {12,23,34};
	 d.func(arr1, 3);
	 for(int i=0;i<3;i++)
	 {
		 System.out.println(arr1[i]);
	 }	 
	 System.out.println("------------------------------------------");
	 System.out.println("number of times the array transformed:"+arr1.length);
	}
}
class data{
	public void func(int[]arr, int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)		
				{
				arr[i]=arr[i]-n;
				}
			else 
			{
				arr[i]=arr[i]+n;
			}
			}
	}
}