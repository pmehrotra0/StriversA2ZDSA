public class GetFibonacci {
    public static int[] Fibonacci(int l1, int l2, int n, int index, int res[]){
        if(n == index) return res;
        res[index] = l1+l2;
        l1 = l2;
        l2 = res[index];
        return Fibonacci(l1, l2, n, index+1, res);
    }
    public static int[] generateFibonacciNumbers(int n) {
        if(n == 1) return new int[]{0};
        if(n == 0) return new int[]{};
        int res[] = new int[n];
        res[0] = 0;
        res[1] = 1;
        return Fibonacci(0, 1, n, 2, res);
    }
    public static void main(String[] args) {
        int res[] = generateFibonacciNumbers(10);
        System.out.println(java.util.Arrays.toString(res));
    }
}
