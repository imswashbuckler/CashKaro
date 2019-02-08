package concepts;

public class _AA {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void display() {
		System.out.println("Y:" + y + "X: " + x);
	}

	_AA(int x, int y) {
		this.x = x;
		this.y = y;

	}

}
