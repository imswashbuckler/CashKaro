package AQuestionAaaddddoooobe;

public class MonkeyJumpProblem {
	// k intial
	public static int monkeyJumoProbs(int intialposition,int jumpUp,int down,int floors)
	{  int count=0;
		while(intialposition<floors)
		{
			intialposition=intialposition+jumpUp;
			if(intialposition==floors)
			{
				count=count+1;
				return count;
				
			}
			
			intialposition=intialposition-down;
			count++;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int c=monkeyJumoProbs(0,3,2,4);
		System.out.println(c);
		
	}

}
