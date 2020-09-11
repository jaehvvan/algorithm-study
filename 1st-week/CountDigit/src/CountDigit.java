import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num; // 왜 do while 문에 들어가기 전에 변수 선언이 필요한 것인가?

        do {
            System.out.print("양의 정수를 입력해주세요: ");
            num = scanner.nextInt();
        } while (num <= 0);

        int divisor = 1;
        int countDigit = 0;

        do {
            divisor *= 10;
            countDigit++;
        } while (num / divisor != 0);

        System.out.println("그 수는 " + countDigit + "자리입니다.");
    }
}
