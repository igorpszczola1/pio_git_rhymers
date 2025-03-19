package edu.kis.vh.nursery;

public class HanoiRhymer extends CountingOutRhymer {

    int totalRejected = 0;

    public int ReportRejectedTest() {
        return totalRejected;
    }

    public void countInTest(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countInTest(in);
    }
}
