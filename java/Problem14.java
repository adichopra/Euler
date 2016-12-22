public class Problem14 {

    public static void main(String[] args) {
	System.out.println(P14(1000000));
    }
    public static int P14(int n) {
	int highest = 0;
	int highest_i = 0;
	for (int i = 1; i < n; i++) {
	    int chain_size = collatz(i);
	    if (chain_size > highest) {
		highest = chain_size;
		highest_i = i;
	    }
	}
	return highest_i;
    }
    public static int collatz(long i) {
	int length = 1;
	while (i != 1) {
	    i = i % 2 == 0 ? i / 2: 3 * i + 1;
	    length++;
	}
	return length;
    }
}
