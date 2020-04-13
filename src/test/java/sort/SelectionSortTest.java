package sort;

import org.junit.Test;

public class SelectionSortTest {
    Sort<Integer> selectionSort_int = new SelectionSort<>();
    Sort<String> selectionSort_string = new SelectionSort<>();

    @Test
    public void selectionSort1(){
        SortTestUtil.intTest1(selectionSort_int);
    }
    @Test
    public void selectionSort2(){
        SortTestUtil.intTest2(selectionSort_int);
    }
    @Test
    public void selectionSort3(){
        SortTestUtil.intTest3(selectionSort_int);
    }
    @Test
    public void selectionSort4(){
        SortTestUtil.intTest4(selectionSort_int);
    }

    @Test
    public void selectionSort5(){
        SortTestUtil.stringTest1(selectionSort_string);
    }
    @Test
    public void selectionSort6(){
        SortTestUtil.stringTest2(selectionSort_string);
    }
}
