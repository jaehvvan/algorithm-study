import java.util.Scanner;

public class SumFor {
    // For 문을 이용하여 1 부터 n 까지의 합을 구하는 프로그램을 작성하라(Q7).
    public static void main(String[] args) {
        // Q7 실행
        sumFor();

        // Q8 실행
        sumGauss();

        // Q9 실행
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);

        System.out.println("두 정수 사이에 존재하는 정수들의 합을 구합니다.");
        System.out.print("a의 값: ");
        int inputA = scannerA.nextInt();
        System.out.print("b의 값: ");
        int inputB = scannerB.nextInt();

        System.out.println("두 정수 사이에 존재하는 정수들의 합은 " + sumof(inputA, inputB) + "입니다.");
    }

    // Q7 (기본)
    static void sumFor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println();
    }

    // Q8 (가우스 덧셈 방법 이용)
    static void sumGauss() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = scanner.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println();
    }

    // Q9
    static int sumof(int a, int b) {
        // a와 b은 정수이므로, 음수가 가능하다. 따라서 Q8과 같은 방식은 불가능하다.
        int sum = 0;
        int numCount;

        // a가 b보다 큰 경우
        if (a >= b) {
            numCount = a - b + 1;
            for (int i = 0 ; i < numCount; i++) {
                sum += b + i;
            }
        }

        // b가 a보다 큰 경우
        else {
            numCount = b - a + 1;
            for (int i = 0 ; i < numCount; i++) {
                sum += a + i;
            }
        }
        return sum;
    }
}
