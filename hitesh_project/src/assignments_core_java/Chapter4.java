package assignments_core_java;



class Students {
	// Chapter 4
	// Question number 1: Show an example of object as aggregation/composition
	// Question number 2: Implementation of finalize method
	int id;// Composition
	String name;// Composition
	String hobbies;// Aggregation

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

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("that was the object:"+ this);
	}

}

public class Chapter4 {
	public static void main(String[] args) {
		Students students = new Students();
		students.setHobbies("Coding");
		students.setName("Hit");
		students.setId(01);
		System.out.println(students.getId() + " " + students.getName() + " " + students.getHobbies());
		students=null;
		System.gc();
	}
}
