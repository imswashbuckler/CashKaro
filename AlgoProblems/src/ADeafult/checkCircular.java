package ADeafult;

// TreeboQuestion
public class checkCircular {

	// Method1
	public static void checkCircularTree(String str1, String str2) {
		String str3 = str1 + str1;
		if (str3.contains(str2)) {
			System.out.println("Circular");
		} else {
			System.out.println("Not Circular");

		}

	}
    static boolean areRotations(String str1, String str2) 
    { 
        // There lengths must be same and str2 must be  
        // a substring of str1 concatenated with str1.   
        return (str1.length() == str2.length()) && 
               ((str1 + str1).indexOf(str2) != -1); 
    } 

	public static void main(String[] args) {
		
		String str1 = "AACD"; 
        String str2 = "ACDA"; 
  
        if (areRotations(str1, str2)) 
            System.out.println("Strings are rotations of each other"); 
        else
            System.out.printf("Strings are not rotations of each other"); 
//Treebo_bo_eerT
		int d = 1234;
		String str4 = Integer.toString(d);
		System.out.println(str4+1);
		String str11 = "Treebo_"; 
		String str12 = "bo_Tree";
		checkCircularTree(str11, str12);

		// Method1

		int k = str1.length();
		String subStr = "";
		String LsubStr = "";
		int i;
		int j;
		int p;
		int q = 0;
		boolean b = false;
		if (str1.length() == str2.length()) {
			for (i = 0; i < str2.length(); i++) {

				for (j = i + 1; j < str2.length(); j++) {

					subStr = str2.substring(i, j);

					if (str1.contains(subStr)) {
						if (subStr.length() > LsubStr.length()) {
							LsubStr = subStr;
							q = j;
						}

					}
				}

			} // _TreeboTreeb

			String sub2str = str2.substring(q, str2.length());
			if (str1.contains(sub2str)) {
				b = true;

			} else {
				System.out.println("its not rotateted string");
			}
			if (b == true) {
				System.out.println("String is rotated");

			}

		}

		else {
			System.out.println("lengths are not same");

		}
	}

}
