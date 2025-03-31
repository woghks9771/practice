package ch05;

public class Ex_stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDE";
		
		char ch = str.charAt(2);
		System.out.println(ch);
		
		String str2 = str.substring(1,3);
		String str3 = str.substring(1);
		System.out.println(str2);
		System.out.println(str3);
		
		int a = str.length();
		System.out.println(a);
		
		boolean b = str.equals("ABCDE");
		System.out.println(b);
		
		String str4 = "ABCDEF";
		char[] c = str4.toCharArray();
		System.out.println(c);
		System.out.println(c[5]);
	}

}
