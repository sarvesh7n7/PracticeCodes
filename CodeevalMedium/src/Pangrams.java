import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Pangrams {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				boolean[] isAppeared = new boolean[26];
				
				for(int i=0; i<line.length(); i++)
				{
					char nextChar = line.charAt(i);
					if(nextChar >= 'a' && nextChar <='z')
						isAppeared[nextChar-'a'] = true;
					if(nextChar >= 'A' && nextChar <='Z')
						isAppeared[nextChar-'A'] = true;
				}
				
				boolean isPangram = true;
				for(int i=0; i<26; i++)
				{
					if(!isAppeared[i])
					{
						System.out.print((char)(i+'a'));
						isPangram = false;
					}
				}
				if(isPangram)
					System.out.print("NULL");
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
