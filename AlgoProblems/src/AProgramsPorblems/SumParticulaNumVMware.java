package AProgramsPorblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SumParticulaNumVMware {

private static int findCount(int[] a,int k){
		
		int temp=0;
		Map<String,Integer> map=new HashMap<String,Integer>();

		for(int i=0;i<a.length;i++){
			for(int j=0;j< a.length;j++){
		    if(i!=j){
		    	if((a[i]+a[j])==k){
		    		if(map.containsKey(a[i]+"-"+a[j])){
		    			map.put(a[i]+"-"+a[j],1);
		    			//map.put(arr[i]+"-"+arr[j],map.get(arr[i]+"-"+arr[j]) +1);
		    		}else if(map.containsKey(a[j]+"-"+a[i])){
		    				//map.put(arr[j]+"-"+arr[i],map.get(arr[j]+"-"+arr[i]) +1);
		    				map.put(a[j]+"-"+a[i],1);
		    			
		    		}else{
		    			map.put(a[i]+"-"+a[j],1);
		    		}
		    		
		    	}
		    }	
		    }
		}
//		System.out.println(map);
		
		Set<String> set=map.keySet();
		for (String str : set) {
			if(map.get(str)!=null){
				temp++;
			}
		}
		
		return temp;
	}

public static void main(String[] args) {
	int[] arr={2,8,1,7,4,3,10};
	SumParticulaNumVMware m = new  SumParticulaNumVMware();
	int p=findCount(arr, 11);
	System.out.println(p);
	
}

}
