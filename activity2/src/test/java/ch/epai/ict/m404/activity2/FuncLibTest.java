package ch.epai.ict.m404.activity2;

import org.junit.*; 
import org.junit.Assert;

public class FuncLibTest {

    public FuncLibTest() {
    }
    
    @Test
    public void testMaxOfThreePos1() {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
    
        double expectedValue = 3.0;
        double actualValue = FuncLib.maxOfThree(a, b, c);
        double delta = 0;
    
        Assert.assertEquals(expectedValue, actualValue, delta);
    }
    
    @Test
    public void testMaxOfThreePos2() {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
    
        double expectedValue = 3.0;
        double actualValue = FuncLib.maxOfThree(c, a, b);
        double delta = 0;
    
        Assert.assertEquals(expectedValue, actualValue, delta);
    }
    
    @Test
    public void testMaxOfThreePos3() {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
    
        double expectedValue = 3.0;
        double actualValue = FuncLib.maxOfThree(b, c, a);
        double delta = 0;
    
        Assert.assertEquals(expectedValue, actualValue, delta);
    }
    
    @Test
    public void testMeanOfThree() {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
    
        double expectedValue = 2.0;
        double actualValue = FuncLib.meanOfThree(a, b, c);
        double delta = 0;
    
        Assert.assertEquals(expectedValue, actualValue, delta);
    
    }
    
    @Test
    public void testMinOfNPos1() {
    
        int[] values = { 1, 2, 3 , 4 };
    
        int expectedValue = 1;
        int actualValue = FuncLib.minOfN(values);
    
        Assert.assertEquals(expectedValue, actualValue);
    }
    
    @Test
    public void testMinOfNPosN() {
    
        int[] values = { 2, 3, 4, 1 };
    
        int expectedValue = 1;
        int actualValue = FuncLib.minOfN(values);
    
        Assert.assertEquals(expectedValue, actualValue);
    }
    
    
    @Test
    public void testMaxOfNPos1() {
    
        int[] values = { 1, 2, 3 , 4 };
    
        int expectedValue = 4;
        int actualValue = FuncLib.maxOfN(values);
    
        Assert.assertEquals(expectedValue, actualValue);
    }
    
    @Test
    public void testMaxOfNPosN() {
    
        int[] values = { 2, 3, 4, 1 };
    
        int expectedValue = 4;
        int actualValue = FuncLib.maxOfN(values);
    
        Assert.assertEquals(expectedValue, actualValue);
    }
    
    /*@Test
    public void testMeanOfN1() {
    
        int[] values = { 1 };
    
        double expectedValue = 1;
        double actualValue = FuncLib.meanOfN(values);
        double delta = 0;
    
        Assert.assertEquals(expectedValue, actualValue, delta);
    }
    
    @Test
    public void testMeanOfN2() {
    
        int[] values = { 1, 2, 3, 4 };
    
        double expectedValue = 2.5;
        double actualValue = FuncLib.meanOfN(values);
        double delta = 0;
    
        Assert.assertEquals(expectedValue, actualValue, delta);
    }
    
    @Test
    public void testMeanOfN3() {
    
        int[] values = {};
    
        double expectedValue = 0;
        double actualValue = FuncLib.meanOfN(values);
        double delta = 0;
    
        Assert.assertEquals("Si le tableau est vide la fonction doit renvoyer 0", expectedValue, actualValue, delta);
    }*/

}