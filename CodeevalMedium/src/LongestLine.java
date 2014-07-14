import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;


public class LongestLine {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			int numberOfLongLine = Integer.valueOf(br.readLine());

			TreeMap<Integer,String> myMap = new TreeMap<Integer,String>();
			
			while((line = br.readLine()) != null)
			{
				if(!line.isEmpty())
				{
					myMap.put(line.length(), line);
					if(myMap.size() > numberOfLongLine)
					{
						myMap.remove(myMap.firstKey());
					}
				}
			}
			List<String> list = new ArrayList<String>(myMap.values());
			ListIterator<String> myIterator = list.listIterator(numberOfLongLine);
			while(myIterator.hasPrevious())
				System.out.println(myIterator.previous());
			
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
