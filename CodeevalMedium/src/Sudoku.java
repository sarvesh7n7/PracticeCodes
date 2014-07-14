import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Sudoku {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
			//	System.out.println(line);
				String[] parts = line.split(";");
				String[] strnumbers = parts[1].split(",");
				int gridLength = Integer.parseInt(parts[0]);
				System.out.println(strnumbers.length);
				int[][] sudokuMat = new int[gridLength][gridLength];
				
				int k=0;
				for(int i=0;i<gridLength;i++)
				{
					for(int j=0;j<gridLength;j++)
					{
						sudokuMat[i][j] = Integer.parseInt(strnumbers[k++]);
					}
				}
				
				if(isValidSodoku(sudokuMat,gridLength))
					System.out.println("True");
				else 
					System.out.println("False");
				// logic to check columns
				
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
	
	public static boolean isValidSodoku(int[][] sudokuMat, int gridLength)
	{
		if(!isRowValid(sudokuMat,gridLength))			
			return false;
		if(!isColumnValid(sudokuMat,gridLength))			
			return false;
		int smallGridLength = (int)Math.sqrt(gridLength);
		for(int i=0; i<gridLength; i+=smallGridLength)
		{
			for(int j=0; j<gridLength; j+=smallGridLength)
			{
				if(!isMatValid(sudokuMat,gridLength,smallGridLength,i,j))
					return false;
			}
		}
			
		return true;
	}
	
	
	public static boolean isRowValid(int[][] sudokuMat, int gridLength)
	{
		
		for(int i=0; i<gridLength; i++)
		{
			boolean isOccured[] = new boolean[gridLength+1];
			for(int j=0; j<gridLength; j++)
			{
				if(isOccured[sudokuMat[i][j]] == true)
					return false;
				isOccured[sudokuMat[i][j]] = true;
			}
		
		}
		return true;
	}
	
	public static boolean isColumnValid(int[][] sudokuMat, int gridLength)
	{
		
		for(int i=0; i<gridLength; i++)
		{
			boolean isOccured[] = new boolean[gridLength+1];
			for(int j=0; j<gridLength; j++)
			{
				if(isOccured[sudokuMat[j][i]] == true)
					return false;
				isOccured[sudokuMat[j][i]] = true;
			}
		
		}
		return true;
	}
	
	public static boolean isMatValid(int[][] sudokuMat, int gridLength, int smallGridLength, int startRow,int startColumn)
	{
		
		for(int i=startRow; i<startRow+smallGridLength;i++)
		{
			boolean isOccured[] = new boolean[gridLength+1];
			for(int j=startRow; j<startColumn+smallGridLength;j++)
			{
				if(isOccured[sudokuMat[i][j]] == true)
					return false;
				isOccured[sudokuMat[i][j]] = true;
			}
		}
		return true;
	}
}
