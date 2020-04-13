package search;

public class BinarySearch<T extends Comparable<T>>{

    //should return the index of the element found
    //return -1 if not found
    int search(T value, T[] array){
        return binarySearchGeneric(0,array.length,array,value);
    }

    public boolean binarySearch(int left, int right, int value, int[] array){
        int mid = (left+right)/2;

        if( left>=right )
            return false;
        else if( array[mid] < value )
            return binarySearch( mid+1, right, value, array );
        else if( array[mid] > value )
            return binarySearch( left, mid, value, array );
        else return array[mid] == value;
    }

    public int binarySearchGeneric(int left, int right, T[] arr, T val){
        int mid = (left+right)/2;
        if(left>=right){
            return -1;
        }else if(arr[mid].compareTo(val) > 0  ){
            return binarySearchGeneric(left+1, mid, arr, val);
        }else if(arr[mid].compareTo(val) < 0 ){
            return binarySearchGeneric(mid, right, arr, val);
        }else if(arr[mid].compareTo(val) == 0 )
            return mid;
        return -1;
    }

}
