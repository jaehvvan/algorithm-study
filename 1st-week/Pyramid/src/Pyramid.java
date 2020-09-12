import java.util.Scanner;

public class Pyramid {
    // Q16, Q17
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 단의 피라미드(*)를 출력하시겠습니까? : ");
        int height = scanner.nextInt();

        spira(height);

        System.out.print("몇 단의 피라미드(숫자)를 출력하시겠습니까? : ");
        height = scanner.nextInt();

        npira(height);
    }

    // n 단의 피라미드(*)를 출력
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // n 단의 피라미드(숫자)를 출력
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i % 10);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
