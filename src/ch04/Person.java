package ch04;

// ���¿� �ൿ
public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;
	
	// ����Ʈ ������(�Ű������� ���� ����) = �ʱ�ȭ
	public Person() {
	
	}
	
	// �����ε�
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}

	public Person(String name, char gender, String bloodType) {
		this.name = name;
		this.gender = gender;
		this.bloodType = bloodType;
	}
	
	
	
}
