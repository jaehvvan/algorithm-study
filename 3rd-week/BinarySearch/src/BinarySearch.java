public class BinarySearch {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 5, 6, 8, 9};
        binSearch(intArr, 2);
    }

    static void binSearch(int[] arr, int val) {
        System.out.print("   |");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("---+");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("----");
        }
        System.out.println();
        int bfrIdx = -1;
        int afrIdx = arr.length;


        while (bfrIdx + 1 != afrIdx) {
            int idx = (bfrIdx + afrIdx) / 2;
            int interval = ((bfrIdx + afrIdx) / 2 - (bfrIdx + 1)) * 4;
            System.out.printf(String.format("   |%%%ds%%%ds%%%ds\n", (bfrIdx + 2) * 4, interval, interval), "<-", "+", "->");
            System.out.printf("%3d|", idx);
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%4d", arr[i]);
            }
            System.out.println();
            System.out.println("   |");
            if (val == arr[idx]) {
                System.out.printf("%d는 x[%d]에 있습니다.", val, idx);
                break;
            } else if (val > arr[idx]) {
                bfrIdx = idx;
            } else if (val < arr[idx]) {
                afrIdx = idx;
            }
        }
        if (bfrIdx + 1 == afrIdx) {
            System.out.println("찾는 값이 없습니다.");
        }
    }
}
