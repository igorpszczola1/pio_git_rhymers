package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int PEEKABOO_ERROR_RETURN_VALUE = -1;
    public static final int COUNT_OUT_ERROR_RETURN_VALUE = -1;
    public static final int IF_FULL = 11;
    public static final int DEFAULT_ERROR = -1;
    private final int[] numbers = new int[CAPACITY];

    public int totalNum = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalNum] = in;
    }

    public boolean callCheck() {
            return totalNum == DEFAULT_ERROR;
        }

    public boolean isFull() {
                return totalNum == IF_FULL;
            }

    protected int peekaboo() {
        if (callCheck())
            return PEEKABOO_ERROR_RETURN_VALUE;
        return numbers[totalNum];
    }
            
    public int countOut() {
        if (callCheck())
            return COUNT_OUT_ERROR_RETURN_VALUE;
        return numbers[totalNum--];
    }
}
