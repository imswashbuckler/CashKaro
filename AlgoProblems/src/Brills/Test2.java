package Brills;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
	private int i;
	private int j;
	private int k;

	public int getI() {
		return i;
	}

	public void setI(int i) throws Exception {
		if (i == 0) {
			throw new Exception("Not allowed");
		}
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

}
