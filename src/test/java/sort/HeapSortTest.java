package sort;

import org.junit.Test;

public class HeapSortTest {
    Sort<Integer> heapSort_int = new HeapSort<>();
    Sort<String> heapSort_string = new HeapSort<>();

    @Test
    public void heapSort1(){
        SortTestUtil.intTest1(heapSort_int);
    }
    @Test
    public void heapSort2(){
        SortTestUtil.intTest2(heapSort_int);
    }
    @Test
    public void heapSort3(){
        SortTestUtil.intTest3(heapSort_int);
    }
    @Test
    public void heapSort4(){
        SortTestUtil.intTest4(heapSort_int);
    }

    @Test
    public void heapSort5(){
        SortTestUtil.stringTest1(heapSort_string);
    }
    @Test
    public void heapSort6(){
        SortTestUtil.stringTest2(heapSort_string);
    }
}
