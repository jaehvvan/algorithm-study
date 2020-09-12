import java.util.Scanner;

public class TriangleLB {
    // Q15
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        do {
            System.out.print("몇 단 삼각형입니까?: ");
            length = scanner.nextInt();
        } while (length <= 0);

        triangleLB(length);

        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
        do {
            System.out.print("몇 단 삼각형입니까?: ");
            length = scanner.nextInt();
        } while (length <= 0);

        triangleLU(length);

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
        do {
            System.out.print("몇 단 삼각형입니까?: ");
            length = scanner.nextInt();
        } while (length <= 0);

        triangleRU(length);

        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        do {
            System.out.print("몇 단 삼각형입니까?: ");
            length = scanner.nextInt();
        } while (length <= 0);

        triangleRB(length);

    }

    // 왼쪽 아래가 직각인 이등변 삼각형을 출력
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 왼쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i -1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 아래가 직각인 이등변 삼각형을 출력
    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
