public class iff{
	public static int abs(int x)
	{
		if(x<0)
		return -x;
		else
		return x;
	}
	public static void main(String[] b)
	{
		int x=Integer.parseInt(b[0]);
		int y=abs(x);
		System.out.println("value of x is"+y);
	}
}