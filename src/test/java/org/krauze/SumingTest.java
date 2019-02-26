package org.krauze;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SumingTest {
    
    Suming sum;

    @Before
    public void init() {
       sum = new Suming();
    }

    @Test
    public void sumingClassExistsCheck() {
        assertNotNull(sum);
    }

    @Test
    public void summaryCheck() {
        
        Double sums= sum.summary(2,2);
        assertEquals(4.0, sums ,0.001);
    }
    @Test
    public void loopingCheck(){
        Double result = sum.looping(0.1, 10);
        assertEquals(1.0, result,0.001);
    }
}