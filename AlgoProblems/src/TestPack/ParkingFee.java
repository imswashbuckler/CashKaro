package TestPack;

public class ParkingFee {

	    public int solution(String E, String L) {
	        // write your code in Java SE 8
	        
	        int entryFee = 2;
	        int firsthr=3;
	        int cost=0;
	        
	        String[] e=E.split(":");
	        String[] l=L.split(":");
	        int e01=Integer.parseInt(e[0]);
	        int l01=Integer.parseInt(l[0]);
	        int e02=Integer.parseInt(e[1]);
	        int l02=Integer.parseInt(l[1]);
	        
	        if(l01>e01 &&  l02>e02)
	        {

	        	cost=entryFee+firsthr+4*(l01-e01);
	        	
	        	
	        }
	        else if(l01>e01 &&  l02<e02)
	    	    
	        {
	        	
	        	cost=entryFee+firsthr+4*(l01-e01-1);
	        	
	        	
	        }
	        else 
	        {
	        	
	        	cost=entryFee+firsthr;
	        	
	        	
	        }
	        
	        
	        
	        
	        
	        return cost;
	        
	    }
	    public static void main(String[] args)
	    {
	    	ParkingFee pobj=new ParkingFee();
	    	int Fee=pobj.solution("00:00","00:12");
	       	System.out.println(Fee);
			
		}
	}

