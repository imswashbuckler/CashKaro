package Abstract;

import PolyMor.class2;

public class class3 extends class2 {
	public static  void stat1(){
		System.out.println("abs class3 static");	
		}
	
public static void main(String[] args) {
	
	class2 o=new class3();
	((class3) o).stat1();
	
	
	
}	

}
