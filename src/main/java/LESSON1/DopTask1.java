package LESSON1;

import java.util.HashMap;
import java.util.Map;

public class DopTask1 {
    public static void main(String[] args) {
        int n = 10;
        int n0 = 0;
        int n1 = 1;

        System.out.println("Fibonachi with using memory for " + n + " numbers");

        for (int i = 1; i <= n; ++i) {
            System.out.print(n0 + " ");
            int sum = n0 + n1;
            n0 = n1;
            n1 = sum;
        }

        n0 = 0;
        n1 = 1;
        System.out.println();
        System.out.println("Fibonacci Series of " + n + " numbers:");

        int i = 1;
        while (i <= n) {
            System.out.print(n0 + " ");
            int sum = n0 + n1;
            n0 = n1;
            n1 = sum;
            i++;
        }

        System.out.println("\n Recursion ");
        for(int j = 0; j < n; j++){
            System.out.print(func(j) +" ");
        }

        System.out.println("\nFib map");
        Map<Integer,Integer> m =  F.f(n);
        m.entrySet().stream().forEach(System.out::println);
    }

private static int func(int n){
    if(n == 0){
        return 0;
    }
    if(n == 1 || n == 2){
        return 1;
    }
    return func(n-2) + func(n-1);
}



}

class F{
    private static Map<Integer,Integer> map = new HashMap<>();
    static int n0=0;
    static int n1=1;
    public static Map<Integer,Integer> f(int n){
        for(int i = 0; i < n; i++){
            map.put(i,n0);
            int sum = n0 + n1;
            n0 = n1;
            n1 = sum;
        }
    return  map;
    }

}
