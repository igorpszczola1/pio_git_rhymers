package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int array_size = 12;

    private final int[] numbers = new int[array_size];

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
            return -1;
        return numbers[totalNum];
    }
            
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[totalNum--];
    }
}
