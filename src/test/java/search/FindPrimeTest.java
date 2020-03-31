package search;

import org.junit.Assert;
import org.junit.Test;

public class FindPrimeTest {

    @Test
    public void test1() {
        FindPrime fp = new FindPrime();
        int[] actual = fp.getPrime(3,100);
        int[] expected = {3, 5, 7, 11 , 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FindPrime fp = new FindPrime();
        int[] actual = fp.getPrime(70,100);
        int[] expected = { 71, 73, 79, 83, 89, 97};
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        FindPrime fp = new FindPrime();
        int[] actual = fp.getPrime(0,11);
        int[] expected = { 3, 5, 7, 11 };
        Assert.assertArrayEquals(expected, actual);
    }


}
