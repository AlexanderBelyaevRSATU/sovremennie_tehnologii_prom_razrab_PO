package ru.rsatu;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAbs()
    {
	double[] values = new double[]{1,3,5};
	DescriptiveStatistics ds = new DescriptiveStatistics();
	ds.addValue(values[0]);
	ds.addValue(values[1]);
	ds.addValue(values[2]);
	
        assertEquals(3, ds.getMean());
    }
}
