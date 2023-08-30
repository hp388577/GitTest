package assignments_core_java;
//git hub key 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
class Employee {
	// Chapter 1
	// Question number 1: create class emp with its important Attributes like
						// name/id/sal/address. Display all the info. Display 
						// all the info with toString

	String name;
	int id;
	double salary;
	String address;

	public Employee(String name, int id, double salary, String address) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}

	public void displayInformation() {
		System.out.println("Employee Information \n\t" + "  Name=" + this.name + "\n\t  ID=" + this.id
				+ " \n\t  Salary=" + this.salary + "\n\t  Address=" + this.address);

	}
}

class Test {
	// Chapter 1
	// Question number 2: Create a class which contain static and non-static member.
						//Atleast with two variable & two member and access it.
	static int department_id;
	int id;
	static String department_name;
	String name;
	public static int getDepartment_id() {
		return department_id;
	}
	public static void setDepartment_id(int department_id) {
		Test.department_id = department_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getDepartment_name() {
		return department_name;
	}
	public static void setDepartment_name(String department_name) {
		Test.department_name = department_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}


public class Chapter1 {
	public static void main(String[] args) {
		Employee employee = new Employee("Hitesh", 01, 45000, "Vasai(West)");
		employee.displayInformation();
		System.out.println(employee);
		
		System.out.println("\n\n");
		
		Test test=new Test();
		test.setId(01);
		test.setName("Hitesh");
		Test.setDepartment_id(01);
		Test.setDepartment_name("IT");
		System.out.println("The Test id and name is :"+test.getId()+"\t"+test.getName());
		System.out.println("The Test static id and name is :"+Test.getDepartment_id()+"\t"+Test.getDepartment_name());

	}
}
