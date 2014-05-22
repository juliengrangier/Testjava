
public class factorielle {
	
	private static int factoriel_v1 (int n) {
		int res = 1;
		if (n > 0) {
			for (int i = 1; i<=n;i++) {
				res = res * i;
			}
		}
		return res;
	}
	
	private static int factoriel_v2 (int n){
		if (n < 2) {
			return 1;
		} else {
			return (n*(factoriel_v2 (n-1)));
		}
	}
	
	
	
	public static void main(String[] args) {
		int n = factoriel_v2 (5);
		System.out.println(n);
	}

}
