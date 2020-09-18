public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;                            // 나눗셈 횟수
        int ptr = 0;                                // 찾은 소수의 갯수
        int[] prime = new int[500];                 // 소수를 저장하는 배열

        prime[ptr++] = 2;                           // 2는 소수

        for (int n = 3; n <= 1000; n += 2) {        // 대상은 홀수만
            int i;                                  // 해당 for 문 밖에서도 i를 활용 가능
            for (i = 1; i < ptr; i++) {             // 이미 찾은 소수로 모두 나누어보기
                counter++;
                if (n % prime[i] == 0) {            // 나누어떨어지면 소수 아님
                    break;
                }
            }
            if (ptr == i) {
                prime[ptr++] = n;
            }
        }
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
