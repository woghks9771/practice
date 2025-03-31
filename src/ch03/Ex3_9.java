package ch03;

public class Ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000;	// 1,000,000 1�鸸  10�� 6����
		int b = 2_000_000;	// 2,000,000 2�鸸  10�� 6����
		
		// 10�� 12����.
		
		long c = (long)a * b;	// a * b = 2,000,000,000,000 ?
		
		System.out.println(c);
	}

}
