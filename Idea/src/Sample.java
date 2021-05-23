
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] a = {1,2,5,4,3,7,8} ;
		int[] temp=a;
		int val=0;
		
		for(int i=0;i<a.length;i++)
		{
			val=a[0];
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]<a[j])
				{
					temp[j]=a[i];
					temp[i]=a[j];
				}
				
			}
			
		}
		
		
		
		
		
	}

}
