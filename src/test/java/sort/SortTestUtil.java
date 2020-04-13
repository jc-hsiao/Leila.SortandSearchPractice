package sort;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class SortTestUtil {

    public static void intTest1(Sort<Integer> sort) {
        Integer[] unsorted = {3,5,4,2,1,7,6};
        Integer[] expected= {1,2,3,4,5,6,7};
        test(expected, sort.sort(unsorted));
    }
    public static void intTest2(Sort<Integer> sort) {
        Integer[] unsorted = {2,3,5,4,2,1,7,6,2,2};
        Integer[] expected= {1,2,2,2,2,3,4,5,6,7};
        test(expected, sort.sort(unsorted));
    }
    public static void intTest3(Sort<Integer> sort) {
        Integer[] unsorted = {4,3};
        Integer[] expected= {3,4};
        test(expected, sort.sort(unsorted));
    }
    public static void intTest4(Sort<Integer> sort) {
        Integer[] unsorted = {1};
        Integer[] expected= {1};
        test(expected, sort.sort(unsorted));
    }

    public static void stringTest1(Sort<String> sort) {
        String[] unsorted = {"Banana","Apple","Orange"};
        String[] expected= {"Apple","Banana","Orange"};
        testString(expected, sort.sort(unsorted));
    }

    public static void stringTest2(Sort<String> sort) {
        String[] unsorted = {"aa","ab","ac","aa","aa"};
        String[] expected= {"aa","aa","aa","ab","ac",};
        testString(expected, sort.sort(unsorted));
    }

    public static void test(Integer[] array1, Integer[] array2) {
        List<Integer> intList1 = Arrays.asList(array1);
        List<Integer> intList2 = Arrays.asList(array2);
        for (int i = 0; i < array1.length; i++)
            Assert.assertEquals(intList1.get(i),intList2.get(i));
    }

    public static void testString(String[] array1, String[] array2) {
        List<String> intList1 = Arrays.asList(array1);
        List<String> intList2 = Arrays.asList(array2);
        for (int i = 0; i < array1.length; i++)
            Assert.assertEquals(intList1.get(i),intList2.get(i));
    }

}
