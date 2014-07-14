import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RacingCar {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			StringBuilder[] inputMat = new StringBuilder[50];
			int row=0;
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			
			while((line = br.readLine()) != null)
			{
				inputMat[row] = new StringBuilder(line);
				row++;
			}
			int sindex=0;
			while(inputMat[0].charAt(sindex) == '#')
				sindex++;
			
			inputMat[0].setCharAt(sindex, '|');
			for(int i=1; i<10; i++)
			{
				if(inputMat[i].charAt(sindex) == 'C')
				{
					inputMat[i].setCharAt(sindex, '|');
				}
				
				else if(inputMat[i].charAt(sindex-1) == 'C' && sindex != 0)
				{
					inputMat[i].setCharAt(sindex-1, '/');
					sindex--;
				}
				else if(inputMat[i].charAt(sindex+1) == 'C' && sindex != 11)
				{
					inputMat[i].setCharAt(sindex+1, '\\') ;
					sindex++;
				}
				else if(inputMat[i].charAt(sindex) == '_')
				{
					inputMat[i].setCharAt(sindex, '|');
				}
				else if(inputMat[i].charAt(sindex-1) == '_' &&  sindex != 0)
				{
					inputMat[i].setCharAt(sindex-1, '/');
					sindex--;
				}
				else if(inputMat[i].charAt(sindex+1) == '_' && sindex != 11)
				{
					inputMat[i].setCharAt(sindex+1, '\\');
					sindex++;
				}
						
			}
			
			for(int i=0;i<10; i++)
				System.out.println(inputMat[i]);
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
