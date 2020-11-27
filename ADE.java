public class ADE{
	public static int ADE1(int x)
{
	x+=5;
return x;
}
public static void main(String[] a)
{
	int x=Integer.parseInt(a[0]);
int z=ADE1(x);
System.out.println("x is"+z);
}
}
