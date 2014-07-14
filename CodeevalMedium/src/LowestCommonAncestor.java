import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class LowestCommonAncestor {

	public static void main(String args[]){
		
		//creation of static tree
		TreeNode rootNode = new TreeNode(30);
		rootNode.left = new TreeNode(8);
		rootNode.right = new TreeNode(52);
		TreeNode temp = rootNode;
		temp = temp.left;
		temp.left = new TreeNode(3);
		temp.right = new TreeNode(20);
		temp = temp.right;
		temp.left = new TreeNode(10);
		temp.right = new TreeNode(29);
		
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split("\\s");
				
				int data1 = Integer.valueOf(parts[0]);
				int data2 = Integer.valueOf(parts[1]);
				int commonAnc = new LowestCommonAncestor().commonAncestor(rootNode, data1, data2);
				System.out.println(commonAnc);
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
	
	public int commonAncestor(TreeNode root,int node1, int node2)
	{
		if(root.data == node1 || root.data == node2)
			return root.data;
		else if((root.data > node1 && root.data < node2) || (root.data < node1 && root.data > node2))
			return root.data;
		
		else
		{
			if((root.data > node1 && root.data > node2))
				return  commonAncestor(root.left,node1,node2);
			if((root.data < node1 && root.data < node2))
				return  commonAncestor(root.right,node1,node2);
		}

		return 0;
	}
	
}
