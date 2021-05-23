



public class Exam4 {

	public static void main(String[] args) {
	
		Exam4 e=new Exam4();
		int[] A= {-1,1,-2,2};
		e.solution(A);

	}
	
	
	int solution(int[] A)
	{
		
		int ans=0;
		for(int i=0;i<A.length;i++)
		{
			if(ans>A[i])
			{
				ans=A[i];
			}
		}
		System.out.println(ans);
		return ans;
	}

}
