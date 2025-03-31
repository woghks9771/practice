package ch06;

    class Data_1 {
        int value;
    }

    class Data_2 {
        int value;
        Data_2() {}     //기본생성자 직접적으로 추가해주어야 한다
                        //클래스 안에 생성자가 1개 있을때는 컴파일러가 자동적으로 추가x

        Data_2(int x) {   // 매개변수가 있는 생성자.
            value = x;
        }
    }

    class Ex6_11 {
        public static void main(String[] args) {
            Data_1 d1 = new Data_1();
            Data_2 d2 = new Data_2(); // compile error발생
        }
    }

