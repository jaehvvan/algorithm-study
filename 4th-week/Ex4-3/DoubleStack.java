public class DoubleStack {
    int max;
    int ptrA;
    int ptrB;
    int[] dbStk;

    public enum AorB {
        StackA, StackB
    }

    public static class EmptyDbStkException extends RuntimeException {
        public EmptyDbStkException() {}
    }

    public static class OverflowDbStkException extends RuntimeException {
        public OverflowDbStkException() {
        }
    }

    public DoubleStack(int capacity) {
        max = capacity;
        ptrA = 0;
        ptrB = capacity - 1;
        try {
            dbStk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(AorB sw, int x) throws OverflowDbStkException {
        if (ptrA >= ptrB + 1) {
            throw new OverflowDbStkException();
        } else {
            switch (sw) {
                case StackA:
                    dbStk[ptrA++] = x;
                    break;
                case StackB:
                    dbStk[ptrB--] = x;
                    break;
            }
        }
        return x;
    }

    public int pop(AorB sw) throws EmptyDbStkException {
        int x = 0;
        switch (sw) {
            case StackA:
                if (ptrA <= 0) {
                    throw new EmptyDbStkException();
                } else {
                    x = dbStk[--ptrA];
                }
                break;
            case StackB:
                if (ptrB >= max - 1) {
                    throw new EmptyDbStkException();
                } else {
                    x = dbStk[++ptrB];
                }
                break;
        }
        return x;
    }

    public int peek(AorB sw) throws EmptyDbStkException {
        int x = 0;
        switch (sw) {
            case StackA:
                if (ptrA <= 0) {
                    throw new EmptyDbStkException();
                } else {
                    x = dbStk[ptrA - 1];
                }
                break;
            case StackB:
                if (ptrB >= max - 1) {
                    throw new EmptyDbStkException();
                } else {
                    x = dbStk[ptrB + 1];
                }
                break;
        }
        return x;
    }

    public int indexOf(AorB sw, int x) {
        switch (sw) {
            case StackA:
                for (int i = ptrA - 1; i >= 0; i--) {
                    if (dbStk[i] == x) {
                        return i;
                    }
                }
                break;
            case StackB:
                for (int i = ptrB + 1; i <= max - 1; i++) {
                    if (dbStk[i] == x) {
                        return i;
                    }
                }
                break;
        }
        return -1;          // 검색실패
    }

    public void clear(AorB sw) {
        switch (sw) {
            case StackA:
                ptrA = 0;
                break;
            case StackB:
                ptrB = max - 1;
                break;
        }
    }

    public int capacity() {
        return max;
    }

    public int size(AorB sw) {
        switch (sw) {
            case StackA:
                return ptrA;
            case StackB:
                return max - ptrB - 1;
        }
        return 0;
    }

    public boolean isEmpty(AorB sw) {
        switch (sw) {
            case StackA:
                return ptrA <= 0;
            case StackB:
                return ptrB >= max - 1;
        }
        return true;
    }

    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }

    public void dump(AorB sw) {
        switch (sw) {
            case StackA:
                if (ptrA <= 0) System.out.println("스택이 비었습니다.");
                for (int i = 0; i < ptrA; i++) {
                    System.out.print(dbStk[i] + " ");
                }
                System.out.println();
                break;
            case StackB:
                if (ptrB >= max - 1) System.out.println("스택이 비었습니다.");
                for (int i = max - 1; i > ptrB; i--) {
                    System.out.print(dbStk[i] + " ");
                }
                System.out.println();
                break;
        }
    }
}
