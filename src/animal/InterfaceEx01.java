package animal;

// 1. ���� : public static final ����
// 2. �Լ� : public abstract ����
// 3. ����� ���� - �������ε�
// 4. ������ �߻�޼��常 ���簡�� = �������ο�
// 5. new �� �� ����.
interface Cal {
	public static final int num = 10;
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		System.out.println(Cal.num);
	}

}