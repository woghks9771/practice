package ch04;

public class Ex4_16_except {
        public static void main(String[] args) {
            int sum = 0;
            int i = 0;

            for(;;) { //무힌 반복문 == for(;ture;) {}
                if(sum > 100)
                    break; // 자신이 속한 하나의 반복문을 벗어난다.
                i++;
                sum += i;
            }

            System.out.println("i=" + i);
            System.out.println("sum=" + sum);
        }
}
