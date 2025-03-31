package ch02;

import java.util.Scanner;

public class Ch2_practice {
    public static void main(String[] args) {
        final int a = 5;
        System.out.println(a);

        float f1 = .10f;   // 0.10, 1.0e-1
        float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;
        double f4 = 123.456789;
        String url = "www.codechobo.com";

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%e%n", d);
        System.out.printf("d=%f%n", f4);
        System.out.printf("d=%e%n", f4);
        System.out.printf("d=%g%n", f4);
        System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
        System.out.printf("[%.8s]%n", url);  // 왼쪽에서 8글자만 출력

        int x = 15;
        System.out.printf("%d%n", x);
        System.out.printf("%#o%n", x);
        System.out.printf("%#x%n", x);
        System.out.printf("%s%n", Integer.toBinaryString(x));

        System.out.println("3".charAt(0));

        System.out.println("두자리 정수를 입력해주세요.>");
        Scanner scanner = new Scanner(System.in);
        // String input = scanner.NextLine();
        // int num = Integer.parseInt(input);   이 두줄을 밑의 한 줄로 요약한 것
        int num = scanner.nextInt();
        System.out.println("입력내용 : " + num);

    }
}
