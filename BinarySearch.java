import java.util.Arrays; //import a java library
public class BinarySearch{// file name must be BinarySearch.java
	private BinarySearch() { }
	public static int indexOf(int[] a, int key) { //indexOf method having two paramenters array a, key of int datatype
        int lo = 0; //declare and initialize variable with 0
        int hi = a.length - 1; //declare and initialize variable with (last index of array-1)
        while (lo <= hi) { //execute loop untill condition met
            int mid = lo + (hi - lo) / 2; //declare and calculate mid variable
            if      (key < a[mid]) //check key variable acc to if condition
             hi = mid - 1; // set hi variable if condition met
            else if (key > a[mid]) //check key variable acc to else if condition
            lo = mid + 1; //set lo variable if condition met
            else return mid; // else statement
        }
        return -1; // return statement
    }
    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }
    public static void main(String[] args) { // system call main method
    	In in = new In(args[0]); //to access In class declare its variable
        int[] allowlist = in.readAllInts(); //call method of In class and store in array
        Arrays.sort(allowlist); // call a method in java library
        while (!StdIn.isEmpty()) { // call a method in our standard library
            int key = StdIn.readInt(); //call a method in our standard library
            if (BinarySearch.indexOf(allowlist, key) == -1) // call local method
                StdOut.println(key); // print statement
        }
    }
}