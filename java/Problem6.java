public class Problem6 {
    
    public static void main(String[] args) {
	System.out.println(P6(100));
    }
    public static int P6(int n) {
	int sum = 0;
	int sqsum = 0;
	for (int i = 1; i <= n; i++) {
	    sum += i;
	    sqsum += Math.pow(i,  2);
	}
	return (int) Math.pow(sum, 2) - sqsum;
    }
}
