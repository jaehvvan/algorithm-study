public class ArrayEqual {
    // Q4.
    // 배열 b의 모든 요소를 배열 a에 복사하는 메서드
    static void copy(int[] a, int[] b) {
        int copyCount;

        if (a.length > b.length) {
            copyCount = b.length;
        } else {
            copyCount = a.length;
        }

        for (int i = 0; i < copyCount; i++) {
            a[i] = b[i];
        }
    }

    // Q5.
    // 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드
    static void rcopy(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("배열의 길이를 맞춰주세요.");
        } else {
            for (int i = 0; i < a.length; i++) {
                a[i] = b[a.length - i - 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray1 = new int[] {1,2,3,4,5};
        int[] intArray2 = new int[] {3,5,7,9,11};

        copy(intArray1, intArray2);
        for (int num : intArray1) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] intArray3 = new int[] {1,2,3,4,5};
        int[] intArray4 = new int[] {4,8,12,16,20};

        rcopy(intArray3, intArray4);
        for (int num : intArray3) {
            System.out.print(num + " ");
        }
    }
}
