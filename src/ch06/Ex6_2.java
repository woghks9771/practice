package ch06;

public class Ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();	// Tv t1; t1 = new Tv(); �� �ѹ������� ����
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		
		t1.channel = 7;		// channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
//		t2 = t1;	// ���ֺ��� t1�� ���� t2�� ����
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		
	}

}