package sort;

public class SelectionSort<T extends Comparable<T>> implements Sort<T>{
    public int[] sort(int[] array){
        int min = 0;
        for (int i = 0; i < array.length-1 ; i++) {
            min = i;

            for (int g = i+1; g < array.length; g++) {
                if(array[min] > array[g])
                    min = g;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public T[] sort(T[] array) {
        int min = 0;
        for (int i = 0; i < array.length-1 ; i++) {
            min = i;
            for (int g = i+1; g < array.length; g++) {
                if(array[min].compareTo(array[g]) > 0)
                    min = g;
            }
            swap(min,i, array);
        }
        return array;
    }

    public void swap(int a, int b, T[] array){
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
