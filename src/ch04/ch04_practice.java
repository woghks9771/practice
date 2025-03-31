package ch04;

public class ch04_practice {
    public static void main(String[] args) {

        //1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2 -------------------------
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println();

        //3 -------------------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; 1 <= j; j--) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //4 -------------------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i + j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //5 -------------------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //6 -------------------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; 1 <= j; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //7 -------------------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i + 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //8 -------------------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; 1 <= j; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();


        //9 -------------------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || (i == 2 || i== 4) && (2 <= j && j <= 4) || i == 3 && j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //10 -------------------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || (i == 2 || i== 4) && (2 <= j && j <= 4) || i == 3 && j == 3) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }


        //------------------------
    }
}