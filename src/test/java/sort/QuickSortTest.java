package sort;

import org.junit.Test;

public class QuickSortTest {
    Sort<Integer> selectionSort_int = new QuickSort<>();
    Sort<String> selectionSort_string = new QuickSort<>();

    @Test
    public void quickSort1(){
        SortTestUtil.intTest1(selectionSort_int);
    }
    @Test
    public void quickSort2(){
        SortTestUtil.intTest2(selectionSort_int);
    }
    @Test
    public void quickSort3(){
        SortTestUtil.intTest3(selectionSort_int);
    }
    @Test
    public void quickSort4(){
        SortTestUtil.intTest4(selectionSort_int);
    }

    @Test
    public void quickSort5(){
        SortTestUtil.stringTest1(selectionSort_string);
    }
    @Test
    public void quickSort6(){
        SortTestUtil.stringTest2(selectionSort_string);
    }
}
