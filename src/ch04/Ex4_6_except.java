package ch04;

import java.util.Scanner;

public class Ex4_6_except {
        public static void main(String[] args) {
            System.out.print("현재 월을 입력하세요.>");

            Scanner scanner = new Scanner(System.in);
            int month = scanner.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장

            if (3 <= month && month <= 5) {
                System.out.println("현재의 계절은 봄입니다.");
            } else if (6 <=month && month <= 8 ) {
                System.out.println("현재의 계절은 여름입니다.");
            } else if (9 <=month && month <= 11 ) {
                System.out.println("현재의 계절은 가을입니다.");
            } else { System.out.println("현재의 계절은 겨울입니다.");
            }
        } // main의 끝
    }

