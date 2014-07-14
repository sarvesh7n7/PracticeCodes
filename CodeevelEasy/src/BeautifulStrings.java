import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BeautifulStrings {
	public static void main(String args[]){
		BufferedReader br = null;
	
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				line = line.replaceAll("[^A-Za-z]+", "");
				line = line.toLowerCase();
				HashMap<Character,Integer> myMap = new HashMap<Character,Integer>();
				
				for(int i=0; i<line.length();i++)
				{
					Integer value = myMap.get(line.charAt(i));
					if(value ==null)
						myMap.put(line.charAt(i),1);
					else
						myMap.put(line.charAt(i),myMap.get(line.charAt(i))+1);
				}
				
				List<Integer> mapValues = new ArrayList<Integer>(myMap.values());
				Collections.sort(mapValues);
				int beauty = 0;
				int maxval = 26;
				for(int i=mapValues.size()-1;i>=0;i--)
				{
					beauty+=mapValues.get(i)*maxval--;
				}
				System.out.println(beauty);
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
