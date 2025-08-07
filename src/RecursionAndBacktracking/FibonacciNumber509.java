package RecursionAndBacktracking;

import java.util.HashMap;

public class FibonacciNumber509 {
    public int fib(int n) {
        if(n==0)
            return 0;
        int a=0;
        int b=1;
        for(int i=2;i<n;i++){
            b=a+b;
            a=b-a;
        }
        return a+b;
    }
}
/*
    HashMap<Integer, Integer> fibMapper = new HashMap<>();
    public int fib(int n) {
        if(fibMapper.containsKey(n))
            return fibMapper.get(n);
        if(n==0) {
            fibMapper.put(0,0);
            return 0;
        }
        if(n==1) {
            fibMapper.put(1,1);
            return 1;
        }
        fibMapper.put(n,fib(n-1)+fib(n-2));
        return fibMapper.get(n);
    }

     */