package whatnot;

public class NthFibonacciSeries {

    public static void main(String[] args) {
        int n = 9;
        NthFibonacciSeries nthFibonacciSeries = new NthFibonacciSeries();
       System.out.println(nthFibonacciSeries.findNthNumber(n));
    }

    private int findNthNumber(int n) {
        int fib[]=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

   /* private int findNthNumber(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return findNthNumber(n - 1) + findNthNumber(n - 2);

    }*/
}
