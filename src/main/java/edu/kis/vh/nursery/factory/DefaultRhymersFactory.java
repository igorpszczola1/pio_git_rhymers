package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public CountingOutRhymer GetStandardRhymer() {
        return new CountingOutRhymer();
    }

    @Override
    public CountingOutRhymer GetFalseRhymer() {
        return new CountingOutRhymer();
    }

    @Override
    public CountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public CountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
