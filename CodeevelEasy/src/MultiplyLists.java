import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MultiplyLists {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
				
			while((line = br.readLine()) != null)
			{
				String[] parts= line.split("\\|");
				String[] list1 = parts[0].split("\\s");
				String[] list2 = parts[1].split("\\s");
		
				for(int i=0;i<list1.length;i++)
				{
					int num = Integer.parseInt(list1[i])*Integer.parseInt(list2[i+1]);
					System.out.print(num+" ");
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
