public class Multi99Table {
    // Q12
    public static void main(String[] args) {
        String space;

        for (int i = 0; i < 11; i++) {
            // 두번째 줄은 구분 짓는 작업
            if (i == 1) {
                System.out.print("-+---------------------------");
                System.out.println();
                continue;
            }

            for (int j = 0; j < 10; j++) {
                // 간격 맞춰주기 작업
                if ((i - 1) * j < 10) {
                    space = "  ";
                } else {
                    space = " ";
                }

                if (i == 0 && j == 0) {
                    System.out.print(" |");
                } else if (i == 0) {
                    System.out.print(space + j);
                } else if (j == 0) {
                    System.out.print(i - 1 + "|");
                } else {
                    System.out.print(space + (i - 1)  * j);
                }
            }

            System.out.println();
        }
    }
}
