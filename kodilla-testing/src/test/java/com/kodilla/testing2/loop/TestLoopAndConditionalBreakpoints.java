package com.kodilla.testing2.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLoopAndConditionalBreakpoints {
    @Test
    public void testLoop() {
        //given
        long sum = 0;
        //When
        for (int n = 0; n <1000; n++) {
            sum+=n;
            System.out.println("{" + n + "} Sum equals: "+sum );
        }
        //then
        assertEquals(499500, sum);
    }

}
