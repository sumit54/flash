import java.util.Iterator;

class Abc {
	#test
	
	public void testname() throws Exception {
		System.out.println();
	}
    
    public static void main(String[] args)
    {
        Abc s =new Abc();
        char[] s1 = {'h','e','l','l','o'};
        s.reverseString1(s1);
    }
    
    
    public void reverseString(char[] s) {
        
    	char temp;
    	int counter=0;
    	char str;
    	
    	for(int i=0;i<=s.length;i++)
    	{
    		str=s[i];
    		
    		for(int j=0;j<s.length-1;j++)
    		{
    			s[j]=s[j+1];
    			s[j+1]=str;
    		}
    	}
    	System.out.println();

}
    
    public void reverseString1(char[] s) {  
        int lengthStr=s.length;  
        int endIndex=lengthStr/2;  
        int j=s.length-1;  
        for(int i=0;i<endIndex;i++)  
        {  

                char temp=s[i];  
                s[i]=s[j];  
                s[j--]=temp;  



        }  
    }
}
