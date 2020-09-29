public class binSearchX {
    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
        System.out.println(binSearchX(intArr, 7));
    }

    static int binSearchX(int[] arr, int val) {
        int bfrIdx = 0;
        int afrIdx = arr.length -1;

        while (bfrIdx <= afrIdx) {
            int midIdx = (bfrIdx + afrIdx) / 2;
            if (val == arr[midIdx]) {
                for (int i = midIdx; val == arr[i]; i--) {
                    midIdx = i;
                }
                return midIdx;                                  // 찾는 값의 index 리턴
            } else if (val < arr[midIdx]) {
                afrIdx = midIdx - 1;
            } else if (val > arr[midIdx]) {
                bfrIdx = midIdx + 1;
            }
        }
        return -1;                                              // 찾는 값 없음
    }
}
