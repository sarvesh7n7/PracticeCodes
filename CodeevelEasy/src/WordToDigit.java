import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class WordToDigit {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			HashMap<String, Integer> wordToDigit = new HashMap<String, Integer>();
			wordToDigit.put("zero",0);
			wordToDigit.put("one",1);
			wordToDigit.put("two",2);
			wordToDigit.put("three",3);
			wordToDigit.put("four",4);
			wordToDigit.put("five",5);
			wordToDigit.put("six",6);
			wordToDigit.put("seven",7);
			wordToDigit.put("eight",8);
			wordToDigit.put("nine",9);
			
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts= line.split(";");
				for(int i=0; i<parts.length;i++)
				{
					System.out.print(wordToDigit.get(parts[i]));
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
