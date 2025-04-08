package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int PEEKABOO_ERROR_RETURN_VALUE = -1;
    private static final int COUNT_OUT_ERROR_RETURN_VALUE = -1;
    private static final int IF_FULL = 11;
    private static final int DEFAULT_ERROR = -1;
    private final int[] numbers = new int[CAPACITY];

    private int totalNum = -1;

    public static int getDefaultError() {
        return DEFAULT_ERROR;
    }

    public static int getIfFull() {
        return IF_FULL;
    }

    public static int getCountOutErrorReturnValue() {
        return COUNT_OUT_ERROR_RETURN_VALUE;
    }

    public static int getPeekabooErrorReturnValue() {
        return PEEKABOO_ERROR_RETURN_VALUE;
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public int getTotalNum() {
        return totalNum;
    }

    protected void countIn(int in) {
        if (!isFull())
            numbers[++totalNum] = in;
    }

    protected boolean callCheck() {
            return totalNum == DEFAULT_ERROR;
        }

    protected boolean isFull() {
                return totalNum == IF_FULL;
            }

    protected int peekaboo() {
        if (callCheck())
            return PEEKABOO_ERROR_RETURN_VALUE;
        return numbers[totalNum];
    }
            
    protected int countOut() {
        if (callCheck())
            return COUNT_OUT_ERROR_RETURN_VALUE;
        return numbers[totalNum--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
