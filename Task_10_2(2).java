package programs;

public class ConstructorEmployeeClass {

	public static void main(String[] args) {
		Employee obje1 = new Employee(8, "Varun", "Ray", 1500);
		System.out.println(obje1);
		obje1.setSalary(899);
		System.out.println(obje1);
		System.out.println("id is: " + obje1.getId());
		System.out.println("firstname is: " + obje1.getFirstName());
		System.out.println("lastname is: " + obje1.getLastName());
		System.out.println("salary is: " + obje1.getSalary());
		System.out.println("name is: " + obje1.getName());
		System.out.println("annual salary is: " + obje1.getAnnualSalary());
		System.out.println(obje1.raiseSalary());
		System.out.println(obje1);
	}
}
