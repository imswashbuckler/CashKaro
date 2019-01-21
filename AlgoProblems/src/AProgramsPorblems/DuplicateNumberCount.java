package AProgramsPorblems;

public class DuplicateNumberCount


{
	public void numberCountinString()
	{				
				long strttime=System.currentTimeMillis();
				String str="aaaaddsddfhkahfkhakfhkaa";
				int count = 0;
				String sum = "";

				char[] strA = str.toCharArray();
				int i = 0;
				char ch = strA[0];
				while (i < strA.length) {
					
				

					if (ch == strA[i] && i < str.length() - 1) {
						count = count + 1;
						i++;

					} else if (ch == strA[i] && i == str.length() - 1) {
						count = count + 1;
						sum = sum + strA[i];
						
						sum=sum+count;
						i++;
						// System.out.println(sum);
						break;

					} else {
						sum = sum + strA[i - 1] + count;

						ch = strA[i];
						count = 0;
					//	System.out.println(sum);

					}

				}

				System.out.println(sum);
				System.out.println(str.length());
				long Endtime=System.currentTimeMillis();
				System.out.println(Endtime-strttime);

			}

		

		
		
	
	
	
	public void charseqnum(String str)
	{
		char[] ch=str.toCharArray();
		int i=0;
		int l=ch.length;
		while(i<l)
		{
			char co=ch[i];
			int count=0;
			
			do{
				count++;
				i++;
			}
				//while(ch[i]==co && l>i);
			while(i<l && ch[i]==co);
			
				System.out.print(co+""+count);
			}
		}		
	


	public static void main(String[] args) {

		String str = "aabbcdaaaSbbbbbbccckkww";
		DuplicateNumberCount obj = new DuplicateNumberCount();
		//obj.sequenceCount(str);
		//System.out.println();
		//obj.duplichars(str);
		// obj.charseqnum(str);
		obj.numberCountinString();
	}

}