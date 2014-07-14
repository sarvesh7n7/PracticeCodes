import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class LetterPercentRatio {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				float lowerCount = 0;
				float upperCount = 0;
				
				for(int i =0; i< line.length();i++)
				{
					char ch = line.charAt(i);
					if(ch >= 65 && ch <= 90)
						upperCount++;
					else if(ch >= 97 && ch <= 122)
						lowerCount++;					
				}
			
				double lowerPercent = lowerCount/(lowerCount+upperCount)*100;
				double upperPercent = upperCount/(lowerCount+upperCount)*100;
				
				System.out.printf("lowercase: %.2f uppercase: %.2f",lowerPercent,upperPercent);
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
