import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SelfDescribingNumbers {
	public static void main(String args[]){
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				int[] numarr = new int[line.length()];
				for(int i=0;i<line.length();i++)
				{			
					numarr[i] = Integer.valueOf(""+line.charAt(i)+"");		
				}
			
				//the logic
				boolean flag = false;
				for(int i=0;i < line.length();i++)
				{
					int numcount=0;
					for(int j =0;j< line.length();j++)
					{
						if(numarr[j] == i)
						{
							numcount++;
							
						}
					}
				//	System.out.println(numcount+" "+numarr[i]);
					if(numcount == numarr[i])
						flag = true;	
					else
					{
						flag = false;
						break;
					}
				}	
				if(flag)
					System.out.println("1");
				else
					System.out.println("0");
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
