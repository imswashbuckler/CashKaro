package AProgramsPorblems;

public class _RectOverlap {

	// Returns true if two rectangles (l1, r1) and (l2, r2) overlap
	public static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
		// If one rectangle is on left side of other
		if (l1.x > r2.x || l2.x > r1.x)
			return false;

		// If one rectangle is above other
		if (l1.y < r2.y || l2.y < r1.y)
			return false;

		return true;
	}

	public static int solution(Point l1, Point r1, Point l2, Point r2) {
		int left = Math.max(l1.x, r2.x);
		int right = Math.min(l1.y, r2.y);
		;
		int bottom = Math.max(l2.x, r1.x);
		int top = Math.min(l2.y, r1.y);

		if (left < right && bottom < top) {
			int interSection = (right - left) * (top - bottom);
			int unionArea = ((l1.x - r2.x) * (l1.y - r2.y))
					+ ((l2.x - r1.x) * (l2.y - r1.y)) - interSection;
			return unionArea;
		}
		return 0;
	}

	public static int solution(int K, int L, int M, int N, int P, int Q, int R,
			int S) {
		int width = M - K;
		int height = N - L;
		int area1 = width * height;
		width = R - P;
		height = S - Q;
		int area2 = width * height;

		int intersectWidth = M - P;
		int intersectHeight = S - L;
		int intersectArea = intersectWidth * intersectHeight;

		int sum = -1;

		if (intersectArea <= 0) {
			sum = area1 + area2;
		} else {

			sum = (area1 + area2) - intersectArea;
		}

		return sum;
	}

	public static void main(String[] args) {

		{
			Point l1 = new Point(0, 10);
			Point r1 = new Point(10, 0);
			Point l2 = new Point(5, 5);
			Point r2 = new Point(15, 0);

			int p = solution(l1, r1, l2, r2);
			System.out.println(p);

			if (doOverlap(l1, r1, l2, r2) == true)
				System.out.println("Rectangles Overlap");
			else
				System.out.println("Rectangles Don't Overlap");

		}

	}

}

class Point {
	int x;
	int y;

	Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

}
