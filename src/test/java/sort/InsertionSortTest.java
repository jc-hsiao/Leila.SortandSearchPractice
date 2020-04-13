package sort;

import org.junit.Test;

public class InsertionSortTest {
    Sort<Integer> insertionSort_int = new InsertionSort<>();
    Sort<String> insertionSort_string = new InsertionSort<>();

    @Test
    public void insertionSort1(){
        SortTestUtil.intTest1(insertionSort_int);
    }
    @Test
    public void insertionSort2(){
        SortTestUtil.intTest2(insertionSort_int);
    }
    @Test
    public void insertionSort3(){
        SortTestUtil.intTest3(insertionSort_int);
    }
    @Test
    public void insertionSort4(){
        SortTestUtil.intTest4(insertionSort_int);
    }

    @Test
    public void insertionSort5(){
        SortTestUtil.stringTest1(insertionSort_string);
    }
    @Test
    public void insertionSort6(){
        SortTestUtil.stringTest2(insertionSort_string);
    }
}
