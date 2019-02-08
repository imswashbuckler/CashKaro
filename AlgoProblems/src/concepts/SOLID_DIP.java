package concepts;

public class SOLID_DIP {
	IWorker worker;

	public void setWorker(IWorker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}

interface IWorker {
	public void work();
}

class Worker implements IWorker {
	public void work() {
		// ....working
	}
}

class SuperWorker implements IWorker {
	public void work() {
		// .... working much more
	}
}
