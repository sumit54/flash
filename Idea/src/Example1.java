
class Example1 {
    public int solution(int[] A) {
    	
    	float temp=1;
    	int flag=0;
    	for (int i : A) {
			
    		
    		temp=temp*i;
    		
		}
    	
    	if(temp>0) 
    	{
    		flag=1;
    	}
    	else if(temp<0)
    	{
    		flag=-1;
    	}
    	else
    	{
    		flag=0;
    	}
    	
    	System.out.println(temp);
    	return flag;
       
    }
    
    
    public static void main(String[] args) {
		
    	int[] A= {1,-2,-3,5};
    	
    	Example1 e=new Example1();
    	e.solution(A);
    	
	}
}