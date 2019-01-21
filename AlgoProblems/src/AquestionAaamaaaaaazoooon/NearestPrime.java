package AquestionAaamaaaaaazoooon;

public class NearestPrime {

	public static void nearestPrm(int n) {
		int up = 1;
		int dn = 1;
		int n1 = n + up;
		int n2 = n - dn;
		while (IsPrm(n1) == false) {
			n1 = n1 + up;

		}
		System.out.println(n1);
		while (IsPrm(n2) == false) {
			n2 = n2 - dn;

		}
		System.out.println(n2);

		if ((n - n2) > (n1 - n)) {
			System.out.println("Nearest Prime No is:" + n1);
		} else {
			System.out.println("Nearest Prime No is:" + n2);
		}

	}

	public static boolean IsPrm(int n) {
		boolean b = true;
		if (n == 2) {
			b = false;

		} else
			for (int i = 2; i < n / 2; i++) {
				while (n % i == 0) {
					b = false;
					break;
				}

			}
		return b;

	}

	public static void main(String[] args) {
		// boolean b = IsPrm(17);
		// System.out.println(b);
		nearestPrm(124);

	}
}
