import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FirstNonRepetedChar {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				System.out.print(""+line+"=");
			//	boolean[] isVisisted = new boolean[26];
				Boolean[] isVisited = new Boolean[26];

		//		int[] isVisited = new int[26];
				line = line.trim();
				for(int i=0;i<line.length();i++)
				{
					char index = line.charAt(i);
					if(isVisited[index-'a'] == null)
					{
						isVisited[index-'a'] = false;
					}
					else if(isVisited[index-'a'] == false)
						isVisited[index-'a'] = true;;
				}
				
				for(int i=0; i< line.length(); i++)
				{	
					char index = line.charAt(i);
					if(isVisited[index-'a'] == false)
					{
						System.out.println(index);
						break;
					}
					
				}
				
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
