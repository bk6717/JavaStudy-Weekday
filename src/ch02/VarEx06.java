package ch02;

class Person{
	String name="����ȣ";
	int age = 36;
	char gender = '��';
	String email = "ssarmango@nate.com";
	String phone = "01022227460";
}

public class VarEx06 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.email);
		System.out.println(p.phone);
		
	}
}
