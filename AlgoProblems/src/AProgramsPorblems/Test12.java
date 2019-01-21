package AProgramsPorblems;

interface Test12 {
	public void wish();
	}

class Main  
{  
    public static void main(String[] args)  
    {  
        Test12 t=new Test12()  
        {  
            public void wish()  
            {  
                System.out.println("output: hello how r u");  
            }  
        };  
    t.wish();  
    }  
}    