package AProgramsPorblems;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

//input

/*
3 2
1 2 1
2 1 2
1 2 3
2 1 1 3 3 G
4
2 1 1 3 3 R
1 
 */


public class GameOfColor {

	public static void main(String args[] ) throws Exception {
		
	/*	Scanner scn = new Scanner(System.in);
		int N=scn.nextInt();
		int Q=scn.nextInt();
		 int[][] frequency = new int[N][N];
		 for(int i = 0; i < N; i++) 
	        {
			 for(int j = 0; i < N; i++) 
		        { 
				 frequency[i][j] = scn.nextInt();
		        }
	           
	        }*/
	
		// File fl = new File("D:\\Projects\\GameOfColer.txt");
		InputStreamReader ins=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ins);
      
        
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);
        int[][] Gird = new int[N][N];
        for(int i = 0; i < N; i++) 
        {
             input = br.readLine().split(" ");
            for(int j=0;j<N;j++)
            {
            	Gird[i][j] = Integer.parseInt(input[j]);
            }
      
        }
            
        
        String colors[] = {"R","G","B"};
        String[] query;
        int temp=0;
        int T,x1,y1,x2,y2,i=0,val=0;
        char c;
        while(i < Q) 
        {
            query = br.readLine().split(" ");
            temp=0;
            T = Integer.parseInt(query[0]);
            x1= Integer.parseInt(query[1]);
            y1= Integer.parseInt(query[2]);
            x2= Integer.parseInt(query[3]);
            y2= Integer.parseInt(query[4]);
            c= query[5].charAt(0);
            val =0;
            if(c =='G')
            {
                val=1;
            }
            else if(c =='B')
            {
                val=2;
            }
            
             for(int k =x1-1; k <= x2-1; k++) 
            {
                for(int j=y1-1;j<=y2-1;j++)
                 {
                     int f = Gird[k][j];
                     int newVal = (T/f)%3;
                   
                    
                     if( val == newVal )
                     {
                         temp++;
                     }
                     
                 }
               
            }
          
            System.out.println(temp);
            i++;
        }
 
    }
}
