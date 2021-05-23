class Solution {
    
    
    public static void main(String[] args) {
		
	System.out.println("Hello");
	
	String s = "  Bob    Loves  Alice   ";
	
	Solution a=new Solution();
	a.reverseWords(s);
	
	
}
    
    public String reverseWords(String s) {
       String[] arr=s.trim().split(" ");
	StringBuffer sb=new StringBuffer();
	
	for(int i=arr.length-1;i>=0;i--)
	{
		
		if (arr[i].length()!=0)
			sb.append(arr[i]+ " ");
        
        
        
	}
	
	System.out.println(sb.toString().trim());
	
	return sb.toString().trim();
         
    }
}