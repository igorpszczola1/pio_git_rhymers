package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numbers = new int[12];

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
