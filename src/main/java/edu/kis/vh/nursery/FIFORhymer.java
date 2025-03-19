package edu.kis.vh.nursery;

public class FIFORhymer extends CountingOutRhymer {

    public CountingOutRhymer temp = new CountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countInTest(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countInTest(temp.countOut());

        return ret;
    }
}
