import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetIntersection {
	public static void main(String args[]){
		BufferedReader br = null;
	
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] sets = line.split(";");
				String[] set1 = sets[0].split(",");
				String[] set2 = sets[1].split(",");
				
				SortedSet<String> Set1 = new TreeSet<String>(Arrays.asList(set1));
				Set<String> Set2 = new TreeSet<String>(Arrays.asList(set2));
								
				Set1.retainAll(Set2);
						
				String toPrint = Set1.toString();
				toPrint = toPrint.substring(1, toPrint.length()-1);
				
				System.out.println(toPrint.replaceAll("\\s+",""));
				/*
				int i=0,j=0;
				firstFound = false;
				
				while(i<set1.length && j<set2.length)
				{
					if(Integer.valueOf(set1[i]) == Integer.valueOf(set2[j]))
					{
						if(firstFound)
							System.out.print(",");
						System.out.print(set1[i]);
						i++;
						j++;
						firstFound = true;
					}
					else if(Integer.valueOf(set1[i]) < Integer.valueOf(set2[j]))
						i++;
					else if(Integer.valueOf(set1[i]) > Integer.valueOf(set2[j]))
						j++;
						
				}
			//	System.out.print("\b");
				System.out.println();
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
