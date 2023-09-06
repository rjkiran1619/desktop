

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int prev = 0, current =1;
		System.out.println("the number is  " +prev +" " +current);
		for (int i = 2; i<a; i++)
		{
			int nxt = prev+current;
			System.out.println("Output "+nxt);
				prev = current;
				current = nxt;
			
		}
			
			

		

	}

}
