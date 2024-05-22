package commandargs;

public class MySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=0;
		for(String x:args)
		{
			s=s+Double.parseDouble(x);
		}
     System.out.println("Sum is "+s);
	}

}
