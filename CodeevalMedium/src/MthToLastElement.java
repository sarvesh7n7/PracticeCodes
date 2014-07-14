/*
 *Write a program to determine the Mth to last element of a list. 
 **/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MthToLastElement {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				//get the elements in the list. 
				String[] elements = line.split("\\s");
				
				//last element in the list: M
				int M = Integer.parseInt(elements[elements.length-1]);
				
				int offset = elements.length-1-M;
				if(offset>=0)
					System.out.println(elements[offset]);
				else 
					System.out.println();
				//Print the appropriate element	
				
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
