package ch03;

// �޼���(�Լ�)�� Ŭ�����ȿ� �ۼ��� �� �ִ�.
// �޼���(�Լ�)�� �޼���(�Լ�)�ȿ� �ۼ��� �� ����.
public class MethodEx01 {
	
	public static void main(String[] args) {
		int num = Cal.add(5, 3);
		System.out.println("���ϱ� : "+num);
		
		int num2 = Cal.minus(5, 3);
		System.out.println("���� : "+num2);
		
		int num3 = Cal.multi(5, 3);
		System.out.println("���ϱ� : "+num3);
		
		int num4 = Cal.divide(5, 3);
		System.out.println("������ : "+num4);
	}

	
}
