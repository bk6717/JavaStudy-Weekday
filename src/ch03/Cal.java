package ch03;
  
public class Cal {
	static int add(int n1, int n2) {
		int result = n1 + n2;
		// System.out.println("result : "+result);
		return result; // return ���� ��������!!
	}

	// minus (�Ű������� int�� �ΰ�) (return�� int��)
	static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	// multi
	static int multi(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	// divide
	static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}