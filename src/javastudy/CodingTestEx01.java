package javastudy;

import java.util.Random;

public class CodingTestEx01 {

	static int cal(int random, int num[]) {
		int result = 0;
		result = random % num[0];
		result = result % num[4];
		for (int i = 1; i < num.length-1; i++) {
			
			result = result + num[i];
		}
		return result;
	}
	
	// 1,2,3,4,5 �迭�� ����
	// � ���� �������� ��Ģ������ ���ؼ� 10�� �����.
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		int random = 0; // ���� ��
		int result = 0; // ��Ģ������ ���
		
		Random r = new Random();
		random = r.nextInt(100)+1;
		
		System.out.println("random���� "+random);
		result = cal(random, num);

		System.out.println("result ����� "+result);
	}

}
