package concepts;

public class AnonymosClass {
	public static void main(String[] args) {

		TasteOfDish obj = new TasteOfDish() {
			public void taste() {
				System.out.println("sweet");
				String str=null;
				String str1=null;
				System.out.println(str+null);

			}
		};

		obj.taste();
		TasteOfDish obj1 = new TasteOfDish();
		obj1.taste();
	
	}

}

class TasteOfDish {
	public void taste() {
		System.out.println("salty");
	}
}
