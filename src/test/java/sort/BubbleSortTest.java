package sort;

import org.junit.Test;

public class BubbleSortTest {
    Sort<Integer> bubbleSort_int = new BubbleSort<>();
    Sort<String> bubbleSort_string = new BubbleSort<>();

    @Test
    public void bubbleSort1(){
        SortTestUtil.intTest1(bubbleSort_int);
    }
    @Test
    public void bubbleSort2(){
        SortTestUtil.intTest2(bubbleSort_int);
    }
    @Test
    public void bubbleSort3(){
        SortTestUtil.intTest3(bubbleSort_int);
    }
    @Test
    public void bubbleSort4(){
        SortTestUtil.intTest4(bubbleSort_int);
    }

    @Test
    public void bubbleSort5(){
        SortTestUtil.stringTest1(bubbleSort_string);
    }
    @Test
    public void bubbleSort6(){
        SortTestUtil.stringTest2(bubbleSort_string);
    }

}
