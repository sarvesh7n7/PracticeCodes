import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RoadTrip {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			TreeSet<Integer> mySet = new TreeSet<Integer>();	
			while((line = br.readLine()) != null)
			{
				Pattern p = Pattern.compile("\\d+");
				Matcher m = p.matcher(line); 
				while (m.find()) {
				   mySet.add(Integer.parseInt(m.group()));
				}
				int previousCity = 0;
				int newCity = 0;
				newCity = mySet.first();
				int distance = newCity-previousCity;
				mySet.remove(mySet.first());
				System.out.print(distance);
				previousCity = newCity;
				
				while(!mySet.isEmpty())
				{
					newCity = mySet.first();
					distance = newCity-previousCity;
					mySet.remove(mySet.first());
					System.out.print(","+distance);
					previousCity = newCity;
					
				}
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
