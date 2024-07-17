package constructors;

public class Copy {

	public static void main(String[] args) {

		
		Employee e=new Employee();
		e.setId(34);
		e.setName("Mahesh");
		
		Employee e2=new Employee(e);
		
	}
}


class Employee{
	
	private int id;
	private String name;
	
	public Employee()
	{
		
	}
	
	public Employee(Employee E)
	{
		this.id=E.id;
		this.name=E.name;
		
		System.out.println("this id is:"+id);
		System.out.println("this name is:"+name);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}