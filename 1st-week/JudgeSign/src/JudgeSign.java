import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = stdIn.nextInt();

        if (n == 1)
            System.out.println("이 수는 1입니다.");
        else if (n == 2)
            System.out.println("이 수는 2입니다.");
        else if (n == 3)
            System.out.println("이 수는 3입니다.");
    }
    // 문제 설명이 잘못된 것은 아닌지..? 1,2,3이 아닌 숫자를 넣으면 아무것도 출력되지 않는다.
}
