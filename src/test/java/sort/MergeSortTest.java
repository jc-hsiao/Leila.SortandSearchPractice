package sort;

import org.junit.Test;

public class MergeSortTest {
    Sort<Integer> mergeSort_int = new MergeSort<>();
    Sort<String> mergeSort_string = new MergeSort<>();

    @Test
    public void mergeSort1(){
        SortTestUtil.intTest1(mergeSort_int);
    }
    @Test
    public void mergeSort2(){
        SortTestUtil.intTest2(mergeSort_int);
    }
    @Test
    public void mergeSort3(){
        SortTestUtil.intTest3(mergeSort_int);
    }
    @Test
    public void mergeSort4(){
        SortTestUtil.intTest4(mergeSort_int);
    }

    @Test
    public void mergeSort5(){
        SortTestUtil.stringTest1(mergeSort_string);
    }
    @Test
    public void mergeSort6(){
        SortTestUtil.stringTest2(mergeSort_string);
    }
}
