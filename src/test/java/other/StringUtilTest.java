package other;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class StringUtilTest {
    @Test
    public void getAllSubstrings_test1(){
        StringUtil su = new StringUtil();
        String[] actual = su.getAllSubstrings("dog");
        String[] expected = {"dog","do","og","d","o","g"};
        Arrays.sort(actual);
        Arrays.sort(expected);
        Assert.assertArrayEquals( actual, expected);
    }
}
