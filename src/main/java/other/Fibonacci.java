package other;

public class Fibonacci {

    //Possible method layout
    // - Return an int array of Fibonacci sequence where all numbers are smaller than n
    // = Return an int array of Fibonacci sequence from range a to b
    public int[] printFibonacci(int numOfNum){
        if(numOfNum<1)
            return null;

        int[] arr = new int[numOfNum];
        arr[0] = 1;

        if(numOfNum > 1) {
            arr[1] = 1;
            for (int i = 2; i < numOfNum ; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr;
    }

}
