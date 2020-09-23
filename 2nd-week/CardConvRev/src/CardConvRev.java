import java.util.Scanner;

public class CardConvRev {

    // 배열 앞쪽에 윗자리를 넣는 메서드(기수변환)
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (x == 0) {
            d[digits++] = '0';
        }

        // Q7.
        System.out.printf("%2d|     %2d\n", r, x);
        System.out.println("  + ------");
        while (x != 0) {
            if (x / r != 0) {
                System.out.printf("%2d|     %2d   ...   %2d\n", r, x / r, x % r);
                System.out.println("  + ------");
            } else if (x / r == 0) {
                System.out.printf("        %2d   ...   %2d\n", x / r, x % r);
            }
            d[digits++] = dChar.charAt(x % r);
            x /= r;
        }

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];
        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1. 예/ 0. 아니오) : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
