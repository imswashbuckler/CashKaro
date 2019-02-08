package concepts;

public class SOLID_DIPNOTFOLLOWING {

	Worker worker;



	public void setWorker(Worker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}


class Worker {

	public void work() {

		// ....working

	}

}


class SuperWorker {
	public void work() {
		//.... working much more
	}
}
	