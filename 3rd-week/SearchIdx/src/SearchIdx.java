public class SearchIdx {
    public static void main(String[] args) {
        int[] intArr = {1, 9, 2, 9, 4, 6, 7, 9};
        int[] idx = {1,2,3,4,5,6,7,8};

        System.out.println(searchIdx(intArr, 8, 9, idx));
        for (int i : idx) {
            System.out.print(i + " ");
        }
    }

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int match = 0;

        for (int i= 0; i < n; i++) {
            if (a[i] == key) {
                idx[match] = i;
                match++;                // 이 두 줄은 idx[match++] = i; 와 같다
            }
        }
        return match;
    }
}
