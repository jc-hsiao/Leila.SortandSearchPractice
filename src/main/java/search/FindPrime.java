package search;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {

    //Possible method layout
    // - Returning all prime that’s small than n
    // - Return n primes, ascending, starting from 2
    // - Check if n is prime... etc

    public int[] getPrime(int from, int to){
        List<Integer> a = new ArrayList<>();
        for (int i = from; i <= to ; i++) {
            if(isPrime(i))
                a.add(i);
        }
        return a.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public boolean isPrime(int num){
        if(num<=2) return false;
        for (int i = 2; i < num ; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
