public class Problem1 {
    public static void main(String[] args) {
	System.out.println(P1(1000));
    }
    public static int P1(int n) {
	int sum = 0;
	for (int i = 1; i < n; i++) {
	    if (i % 5 == 0 || i % 3 == 0) sum += i;
	}
	return sum;
    }
}
