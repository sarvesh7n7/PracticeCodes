/* Author: Pranav Bhole
 * Student of  Student of MS in Computer Science (Fall 2012 - Spring 2014)
 * The University of Texas at Dallas
 * http://www.utdallas.edu/~pranav.bhole
 * */
import java.util.ArrayList;

public class Combinations {
	public static int a[] = { 1, 2, 3, 4, 5 };

	static void combinations(ArrayList<Integer> temp, int start, int count,
			int r) {
		//System.out.println("combinations("+temp.toString()+","+start+", "+count+")");
		if (count == r) {
			for (int i = 0; i < temp.size(); i++)
				System.out.print(temp.get(i) + " ");
			System.out.println();
		} else {
			for (int i = start; i < a.length && temp.size() <= r; i++) {
				temp.add(count, new Integer(a[i]));
				combinations(temp, i+1, count + 1, r);
				temp.remove(count);
			}
		}

	}

	public static void main(String args[]) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		combinations(temp, 0, 0, 3);
	}
}
