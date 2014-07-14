import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Tree {
	private int numberOfNodes = 0;
    private TreeNode rootNode;
	
    Tree()
	{
		this.rootNode = null;
	}
	Tree(int data)
	{
		numberOfNodes++;
		rootNode = new TreeNode(data);
	}
	
	public void addData(int data)
	{
		numberOfNodes++;
		//if the root node is null; there is no tree!
		if(rootNode == null)
		{
			
			rootNode = new TreeNode(data);
		}

		else
		{
			TreeNode traverseNode = null;
			TreeNode followNode = null;
			traverseNode = rootNode;
			
			while(traverseNode != null)
			{
				if(traverseNode.nodeData >= data)
				{
					followNode = traverseNode;
					traverseNode = traverseNode.leftNode;
				}

				else if(traverseNode.nodeData < data)
				{
					followNode = traverseNode;
					traverseNode = traverseNode.rightNode;
				}
			}

			if(followNode.nodeData >= data)
			{
				followNode.leftNode = new TreeNode(data);
			}

			else if(followNode.nodeData < data)
			{
				followNode.rightNode = new TreeNode(data);
			}	
		}
	}
	
	public void preOrderRecursive()
	{	
		preOrderRec(rootNode);
	}
	
	private void preOrderRec(TreeNode traverseNode)
	{
		if(traverseNode != null)
		{
			System.out.print(" "+traverseNode.nodeData);
			preOrderRec(traverseNode.leftNode);
			preOrderRec(traverseNode.rightNode);
		}
	}
	
	public void inOrderRecursive()
	{	
		inOrderRec(rootNode);
	}
	
	private void inOrderRec(TreeNode traverseNode)
	{
		if(traverseNode != null)
		{
			inOrderRec(traverseNode.leftNode);
			System.out.print(" "+traverseNode.nodeData);
			inOrderRec(traverseNode.rightNode);
		}
	}
	
	public void postOrderRecursive()
	{	
		postOrderRec(rootNode);
	}
	
	private void postOrderRec(TreeNode traverseNode)
	{
		if(traverseNode != null)
		{
			postOrderRec(traverseNode.leftNode);
			postOrderRec(traverseNode.rightNode);
			System.out.print(" "+traverseNode.nodeData);
		}
	}
	
	public void preOrderNonRecursive()
	{
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		//nodeStack.push(root);
		TreeNode temp = rootNode;	
		while(true)
		{	
			while(temp != null)
			{
				System.out.print(" "+temp.nodeData);				
				nodeStack.push(temp);
				temp = temp.leftNode;
			}
			if(nodeStack.empty())
				break;
			temp = nodeStack.pop();
			temp = temp.rightNode;
		}
	}
	
	public void preOrderNonRecursive1()
	{
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		TreeNode temp = rootNode;
		
		while(true)
		{
			while(temp != null)
			{
				System.out.print(" "+temp.nodeData);
				if(temp.rightNode != null)
					nodeStack.push(temp.rightNode);
				temp = temp.leftNode;
			}
			if(nodeStack.empty())
				break;
			temp = nodeStack.pop();
			
		}
	}
	
		public void inOrderNonRecursive()
	{
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		//nodeStack.push(root);
		TreeNode temp = rootNode;	
		while(true)
		{	
			while(temp != null)
			{				
				nodeStack.push(temp);
				temp = temp.leftNode;
			}
			if(nodeStack.empty())
				break;
			temp = nodeStack.pop();
			System.out.print(" "+temp.nodeData);
			temp = temp.rightNode;
		}
	}
	
	public void postOrderNonRecursive()
	{
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		
		
		TreeNode temp = rootNode;	
		while(true)
		{	
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(temp != null)
			{		
				nodeStack.push(temp);
				temp = temp.leftNode;
			}
			else
			{
				
				if(nodeStack.peek().rightNode == null)
				{
					temp = nodeStack.pop();
					System.out.print(" "+temp.nodeData);
					if(temp == nodeStack.peek().rightNode)
					{
						temp = nodeStack.pop();
						System.out.print(" "+temp.nodeData);
					}					
				}
				
				if(!nodeStack.empty())
				{
					if(temp == nodeStack.peek().rightNode)
					{	temp = nodeStack.pop();
						System.out.println(" "+temp.nodeData);
					}
					else
						temp = nodeStack.peek().rightNode;
						
				}
					
				else temp = null;			
				if(nodeStack.empty())
					break;
			}
			
		}
	}
	
	public void deleteNode(int data)
	{
		TreeNode parentNode = rootNode;
		TreeNode traverseNode = rootNode;
		boolean leftChild = false;
		while(true)
		{
			if(traverseNode.nodeData == data)
				break;
			
			else if(traverseNode.nodeData > data)
			{
				parentNode = traverseNode;
				traverseNode = traverseNode.leftNode;
				leftChild = true;
			}
				
			else if(traverseNode.nodeData < data)
			{
				parentNode = traverseNode;
				traverseNode = traverseNode.rightNode;
				leftChild = false;
			
			}
			
			if(traverseNode == null )
				break;
		}
		
		//check for the the conditions of the nodes here.
		//node to be deleted is node with 2childern
		if(traverseNode.leftNode != null && traverseNode.rightNode != null)
		{
			deleteTwoChildNode(parentNode, traverseNode, leftChild);
		}
		
		//node to be deleted has 0 or 1 childern 
		else
		{
			deleteNonTwoChildNode(parentNode, traverseNode, leftChild);
		}
		
	}
	
	private void deleteNonTwoChildNode(TreeNode parentNode, TreeNode traverseNode, boolean leftChild)
	{
		//if the node to be deleted is a leaf node 
		if(traverseNode.leftNode == null && traverseNode.rightNode == null)
		{
			if(leftChild == true)
				parentNode.leftNode = null;
			else
				parentNode.rightNode = null;
		}
		
		//if the node to be deleted is not a leaf node.
		//node with only left child
		if(traverseNode.leftNode != null && traverseNode.rightNode == null)
		{
			if(leftChild == true)
				parentNode.leftNode = traverseNode.leftNode;
			else
				parentNode.rightNode = traverseNode.leftNode;
		}
		
		//node with only right child
		if(traverseNode.leftNode == null && traverseNode.rightNode != null)
		{
			if(leftChild == true)
				parentNode.leftNode = traverseNode.rightNode;
			else
				parentNode.rightNode = traverseNode.rightNode;
		}
	}
	
	private void deleteTwoChildNode(TreeNode parentNode, TreeNode traverseNode, boolean leftChild)
	{
		TreeNode ancestorNode = null;
		if(leftChild == true)
		{
			ancestorNode = traverseNode;
			parentNode = traverseNode;
			traverseNode = traverseNode.rightNode;
			leftChild = false;
			
			while(traverseNode.leftNode != null)
			{
				parentNode = traverseNode;
				traverseNode = traverseNode.leftNode;
				leftChild = true;
				
			}
			//swap the nodes
			
			int temp = ancestorNode.nodeData;
			ancestorNode.nodeData = traverseNode.nodeData;
			traverseNode.nodeData = temp;
			
			deleteNonTwoChildNode(parentNode, traverseNode, leftChild);
						
		}
		
		else
		{
			ancestorNode = traverseNode;
			parentNode = traverseNode;
			traverseNode = traverseNode.leftNode;
			leftChild =  true;
			while(traverseNode.rightNode != null)
			{
				parentNode = traverseNode;
				traverseNode = traverseNode.rightNode;
				leftChild = false;
			}
			
			int temp = ancestorNode.nodeData;
			ancestorNode.nodeData = traverseNode.nodeData;
			traverseNode.nodeData = temp;
			
			deleteNonTwoChildNode(parentNode, traverseNode, leftChild);
		
		}
		
	}

	public int getNumberOfNodes()
	{
		return numberOfNodes;
	}
	public void levelOrderTraversal()
	{
		TreeNode traverseNode = rootNode;
		Queue<TreeNode>  nodeList= new LinkedList<TreeNode>();
		nodeList.add(traverseNode);
		while(!nodeList.isEmpty())
		{
			traverseNode = nodeList.remove();
			System.out.print(" "+traverseNode.nodeData);
			if(traverseNode.leftNode != null)
				nodeList.add(traverseNode.leftNode);
			if(traverseNode.rightNode != null)
				nodeList.add(traverseNode.rightNode);
		}
	}
	public int hightOfTree()
	{
		int height  = heightOfTreeRecursive(rootNode);
		return height;
	}
	
	private int heightOfTreeRecursive(TreeNode traverseNode)
	{
		if(traverseNode == null)
			return 0;
		else
		{
			return(1+max(heightOfTreeRecursive(traverseNode.leftNode),heightOfTreeRecursive(traverseNode.rightNode)));
		}
					
	}
	
	private int max(int data1,int data2)
	{
		return data1<=data2?data1:data2;
	}
// Level Order Traversal
// Finding the common ancester
// height of the tree
// Diameter of the tree 
	
	class TreeNode {
		
		int nodeData;
		TreeNode leftNode;
		TreeNode rightNode;


		TreeNode(int data)
		{
			nodeData = data;
			leftNode = null;
			rightNode = null;
		}
	}
}

