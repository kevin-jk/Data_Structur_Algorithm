package com.kun.practise.algrithm.list;

/**
 * @Author: jrjiakun
 * @Date: 2019/2/3 14:50
 */
public class VolatileFutureExample {

    private volatile long volatileValue = 0L;

    private long oridinalValue = 0L;


    public void incrementVolatileValue() {
        volatileValue++;
    }

    public long getVolatileValue() {
        return volatileValue;
    }

    public void setVolatileValue(long volatileValue) {
        this.volatileValue = volatileValue;
    }


    public synchronized long getOridinalValue() {
        return oridinalValue;
    }

    public synchronized void setOridinalValue(long oridinalValue) {
        this.oridinalValue = oridinalValue;
    }
    public void incrementOridinalValue() {
         long temp = getOridinalValue();
         temp++;
         setOridinalValue(temp);
    }

}
