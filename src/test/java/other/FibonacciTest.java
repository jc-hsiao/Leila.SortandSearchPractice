package other;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void test1(){
        Fibonacci f = new Fibonacci();
        int[] actual = f.printFibonacci(3);
        int[] expected = {1,1,2};
        Assert.assertArrayEquals( actual, expected);
    }

    @Test
    public void test2(){
        Fibonacci f = new Fibonacci();
        int[] actual = f.printFibonacci(6);
        int[] expected = {1,1,2,3,5,8};
        Assert.assertArrayEquals( actual, expected);
    }
}
