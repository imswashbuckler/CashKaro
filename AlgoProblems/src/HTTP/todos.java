package HTTP;

import java.util.ArrayList;

public class todos {
	
	ArrayList<TodoClass> todos1 = new ArrayList<TodoClass>();

	public ArrayList<TodoClass> gettodos() {
		return todos1;
	}

	public void settodos(ArrayList<TodoClass> todos) {
		this.todos1 = todos;
	}
	

}
