import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class UniqueElements {
	public static void main(String args[]){
		BufferedReader br = null;
	
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				
				String[] numArr = line.split(",");
				int[] numArray = new int[numArr.length];
				for(int i=0; i<numArr.length;i++)
				{
					numArray[i] = Integer.valueOf(numArr[i]);
				}
		
				int currentNum = numArray[0];
				StringBuilder output = new StringBuilder(numArray[0]+"");
				for(int i =0; i<numArray.length;i++)
				{
					if(currentNum != numArray[i])
					{
						currentNum = numArray[i];
						output.append(","+numArray[i]);
				
					}
				}
				System.out.println(output);
				
			/*	Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(numArray)); 
				List<Integer> myList = new ArrayList<Integer>(mySet);
				Collections.sort(myList);
				String setString = myList.toString();
				setString = setString.substring(1,setString.length()-1);
				setString = setString.replaceAll("\\s", "");
				System.out.println(setString);
				*/
				
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
