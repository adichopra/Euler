public class Problem2 {
    public static void main(String[] args) {
	System.out.println(P2(4000000));
    }
    public static int P2(int n) {
	int sum = 0;
	for (int i = 0; i < n; i++) {
	    if (fib(i) > n) {
		n = i;
		break;
	    }
		}
	for (int i = 0; i < n; i++) {
	    if (fib(i) % 2 == 0) sum += fib(i);
	}
	return sum;
    }
    public static int fib(int n) {
	if (n < 0) return 0;
	if (n == 1) return 1;
	return fib(n - 2) + fib(n - 1);
    }
}
