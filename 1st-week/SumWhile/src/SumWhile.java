import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 부터 n 까지의 합을 구합니다.");
        System.out.print("n의 값: ");

        // 입력받은 n 값을 저장
        int nValue = scanner.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= nValue) {
            sum += i;
            i++;
        }

        System.out.println("1부터 " + nValue + "까지의 합은 " + sum + "입니다.");
        System.out.println("while문이 종료될 때 변수 i의 값은 " + i + "입니다."); // while 문이 종료될때 변수 i의 값은 nValue + 1이 된다.
    }
}
