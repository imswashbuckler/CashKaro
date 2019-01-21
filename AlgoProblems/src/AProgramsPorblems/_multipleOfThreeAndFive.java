package AProgramsPorblems;

public class _multipleOfThreeAndFive {

	public boolean checkDivisbility(int p, int q) {
		while (p > 0) {
			p = p - q;

		}
		if (p == 0) {

			return true;
		}

		return false;

	}

	public void multipleofThree(int n) {

		for (int i = 1; i < n; i++) {

			if (checkDivisbility(i, 3)  & checkDivisbility(i, 5)) {
				System.out.println("devide by 3 and 5");

			} else if (checkDivisbility(i, 3) == true) {

				System.out.println("devide by 3");

			}

			else if (checkDivisbility(i, 5) == true) {
				System.out.println("devide by 5");
			}
			else  {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {

		_multipleOfThreeAndFive a = new _multipleOfThreeAndFive();
		a.multipleofThree(20);

	}

}
