import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a의 값: ");
        int aValue = scanner.nextInt();
        int bValue = aValue + 1;

        do {
            if (bValue <= aValue) System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b의 값: ");
            bValue = scanner.nextInt();
        } while (bValue <= aValue);

        System.out.println("b - a는 " + (bValue - aValue) + "입니다.");
    }
}
