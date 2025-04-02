package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int PEEKABOO_ERROR_RETURN_VALUE = -1;
    private static final int COUNT_OUT_ERROR_RETURN_VALUE = -1;
    private static final int IF_FULL = 11;
    private static final int DEFAULT_ERROR = -1;
    private final int[] numbers = new int[CAPACITY];

    private int totalNum = -1;

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
}
