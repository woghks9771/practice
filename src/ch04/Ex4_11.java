package ch04;

public class Ex4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������ڵ�
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();            // �ٹٲ�
		}
		
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
		
//		for(int i=1; i<=5; i++) {
//			System.out.println("**********");
//		}

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
