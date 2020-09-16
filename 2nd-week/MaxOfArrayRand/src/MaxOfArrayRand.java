import java.util.Random;
import java.util.Scanner;

// Q1.
public class MaxOfArrayRand {
    // 배열 a의 최댓값 반환
    static int maxOf(int[] a) {
        int max = a[0];

        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.printf("height[%d] : %d\n", i, height[i]);
        }
        System.out.printf("최댓값은 %d 입니다.", maxOf(height));

    }
}
