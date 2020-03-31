package search;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindSubstringsTest {


    @Test
    public void test1(){
        FindSubstrings fs = new FindSubstrings();
        String[] actual = fs.getAllSubstrings("dog");
        String[] expected = {"dog","do","og","d","o","g"};
        Arrays.sort(actual);
        Arrays.sort(expected);
        Assert.assertArrayEquals( actual, expected);
    }
}
