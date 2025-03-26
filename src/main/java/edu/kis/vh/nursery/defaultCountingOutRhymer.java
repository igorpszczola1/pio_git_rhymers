package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int CAPACITY = 12;

    public static final int PEEKABOO_ERROR_RETURN_VALUE = -1;

    public static final int COUNT_OUT_ERROR_RETURN_VALUE = -1;

    private final int[] numbers = new int[CAPACITY];

    public int totalNum = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalNum] = in;
    }

    public boolean callCheck() {
            return totalNum == -1;
        }

    public boolean isFull() {
                return totalNum == 11;
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
