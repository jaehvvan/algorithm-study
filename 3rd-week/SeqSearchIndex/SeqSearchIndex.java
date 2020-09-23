import java.util.Scanner;
// Q2.

class SeqSearchIndex {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
    static int seqSearchIndex(int[] a, int n, int key) {
        int i;

        a[n] = key;					// 보초를 추가
        System.out.print("  | ");
        for (int j = 0; j < n; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("--+");
        for (int j = 0; j < n; j++) {
            System.out.print("--");
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            if (i != 0) {
                System.out.println("  |");
            }
            System.out.print("  |");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
            System.out.print(" " + i + "|");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + a[j]);
            }
            System.out.println();
            if (a[i] == key) {
                break;
            }
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];				// 요솟수 num + 1

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값：");			// 키값을 입력
        int ky = stdIn.nextInt();

        int idx = seqSearchIndex(x, num, ky);		// 배열x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}