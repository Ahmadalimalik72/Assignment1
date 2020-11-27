public class Forr{
	public static double H(int N)
	 {     double sum = 0.0; 
	   for (int i = 1; i <= N; i++)   
	      sum += 1.0 / i;   
	  return sum;
	       }
	       public static void main(String[] c)
	       {
	       	int N=Integer.parseInt(c[0]);
	       	double d=H(N);
	       	System.out.println(d);
	       }


}