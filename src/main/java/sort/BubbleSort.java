package sort;

public class BubbleSort<T extends Comparable<T>> implements Sort<T>{
//    public T[] sort(T[] array) {
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if(array[i].compareTo(array[j]) > 0){
//                    swap(j,i, array);
//                }
//            }
//        }
//        return array;
//    }

    public T[] sort(T[] array) {
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i].compareTo(array[i+1]) > 0){
                    swap(i, i+1, array);
                    sorted = false;
                }
            }
        }
        return array;
    }

    public void swap(int i, int j , T[] array){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
