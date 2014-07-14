import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;


public class MajorElement {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{	HashMap<String,Integer> myMap = new HashMap<String,Integer>();
				
				String[] numbers = line.split(",");
				for(int i=1; i<numbers.length; i++)
				{
					Integer fromMap = myMap.get(numbers[i]);
					if(fromMap == null)
						myMap.put(numbers[i],1);
					else
						myMap.put(numbers[i], fromMap+1);
				}
				
				String maxKey = null;
				int maxValue = 0;
				for (Entry<String, Integer> entry : myMap.entrySet()) {
				    String key = entry.getKey();
				    int value = entry.getValue();
				    if(maxValue<value)
				    {
				    	maxValue = value;
				    	maxKey=key;
				    }
				  
				}
				if(maxValue >= numbers.length/2)
					System.out.println(maxKey);
				
				else
					System.out.println("None");
					
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
