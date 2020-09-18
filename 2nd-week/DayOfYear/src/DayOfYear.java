import java.util.Scanner;

public class DayOfYear {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},   //평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}    // 윤년
    };

    static int isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {      // 나 왜 이게 이해가 안되냐
            return 1;
        } else {
            return 0;
        }
    }

    static int leftDayOfYear(int y, int m, int d) {
        if (isLeap(y) == 0) {
            return 365 - dayOfYear(y, m, d);
        } else {
            return 366 - dayOfYear(y, m, d);
        }
    }

    static int dayOfYear(int y, int m, int d) {
        while (m - 2 >= 0) {
            d += mdays[isLeap(y)][m - 2];
            m--;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int year = sc.nextInt();
            System.out.print("월 : ");
            int month = sc.nextInt();
            System.out.print("일 : ");
            int day = sc.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1. 예/ 0. 아니오) :");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
