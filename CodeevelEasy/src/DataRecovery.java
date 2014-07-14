import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DataRecovery {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts= line.split(";");
				String[] words = parts[0].split("\\s");
				String[] positions = parts[1].split("\\s");
				int[] intposition = new int[positions.length+1];
				boolean[] isknown = new boolean[positions.length+1];
				for(int i=0; i<positions.length;i++)
				{
					intposition[i] = Integer.parseInt(positions[i])-1;
					isknown[Integer.parseInt(positions[i])-1] = true;
				}
				
				for(int i=0; i<=positions.length;i++)
				{
					if(!isknown[i])
					{
						intposition[positions.length] = i;
					}
				}
				String[] newwords = new String[words.length];
				for(int i=0; i<=positions.length;i++)
				{
					newwords[intposition[i]] = words[i];
					
				}
				for(int i=0; i<=positions.length;i++)
				{
					System.out.print(" "+newwords[i]);
					
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
