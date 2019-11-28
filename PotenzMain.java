
public class PotenzMain {
	public static void main(String[] args) {
		System.out.println(pot_iteratv(2,4));
		System.out.println(pot_rek(2,4));
	}

	private static int pot_rek(int i, int j) {
		if (j==1) {
			return i;
		}
		return pot_rek(i,j-1)*i;
	}

	public static int pot_iteratv(int i, int j) {
		int potenzI=1;
		for (int k = 1; k <= j; k++) {
			potenzI=potenzI*i;
		}
		return potenzI;
	}
}
