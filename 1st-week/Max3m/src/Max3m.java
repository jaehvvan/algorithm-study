public class Max3m {

    // 연습문제 1
    // Q1. 정수 4개를 받아 최댓값 구하기
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    // Q2. 정수 3개를 받아 최솟값 구하기
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    // Q3. 정수 4개를 받아 최솟값 구하기기
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    // Q4. 세 값의 대소 관계 13종류의 모든 조합에 대해 중간값 구하여 출력하기
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    // Q5. 다음과 같은 메서드의 문제점
    static int noMed3 (int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }
    /* 최악의 경우에도 3번의 조건 판단 이후에 결과가 도출되는 med3 함수와 달리,
    noMed3 함수는 8번에 걸친 조건 판단 끝에 결과가 나올 수도 있다.
    ex) true, false, true, false, true, false, true, false */

    public static void main(String[] args) {
        System.out.println(max4(4,6,1,9));
        System.out.println(min3(3,6,9));
        System.out.println(min4(3,6,9, 15));
        System.out.println(med3(1,5,9));
    }
}
