public class P36_Exponentiation {

    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n>0) {
            if((n&1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    /* Iterative Function to calculate (x^y)%p in O(log y) */

	public static int modExpo(int a, int n, int b){
		int ans = 1;
		while (n>0) {
			if ((n&1) != 0){
                ans = ans * a;
            }
			// y must be even now
			a = a * a;
            n = n >> 1;
		}
		return ans % b;
	}
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));
		System.out.print(modExpo(2, 3, 5));
        //2^3 % 5 = 8 % 5 = 3
    }
}
