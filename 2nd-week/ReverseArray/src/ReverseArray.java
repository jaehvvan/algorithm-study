import java.util.Scanner;

public class ReverseArray {

    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i ++) {
            for (int compo : a) {
                System.out.print(compo + " ");
            }
            System.out.println();
            System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n", i, a.length - i - 1);
            swap(a, i, a.length - i - 1);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    // 배열 a의 요소 합계를 반환
    static int sumOf(int[] a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt(); // 요솟수

        int[] x = new int[num]; // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d] : ", i);
            x[i] = sc.nextInt();
        }

        reverse(x);
        System.out.println();
        System.out.printf("합계는 %d 입니다.", sumOf(x));
    }
}
