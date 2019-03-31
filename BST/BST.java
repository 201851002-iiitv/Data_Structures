package BST;

public class BST {
	BST_node root;
	
	BST()
	{
		root=null;
	}
	public void insert(Integer v)
	{
		BST_node ob=new BST_node(v);
		if(root == null)
		{
			root=ob;
		}
		else
		{
			BST_node hop=root;
			while(true)
			{
				if(ob.val<=hop.val)
				{	if(hop.left==null) {break;}
					hop=hop.left;	
				}
				else
				{
					if(hop.right==null) {break;}
					hop=hop.right;
				}
				
			}
			if(ob.val <= hop.val)
			{
				hop.left=ob;
			}
			else
			{
				hop.right=ob;
			}
		}
	}
	
	
	public BST_node search(Integer v)
	{
		BST_node hop = this.root;
		while(hop!=null)
		{
			if(v<hop.val)
			{
				hop=hop.left;
			}
			else if(v>hop.val)
			{
				hop=hop.right;
			}
			else
			{
				break;
			}
		}
		return hop;
	}
	
	public void traversal(Integer a)
	{
		System.out.println(a);
	}
	
	public void post(BST_node root1)    // postorder		pass=root (root1=root)
	{
		//System.out.println(root1.left.val);
		if(root1==null)
		{
			return;
		}
		post(root1.left);
		post(root1.right);
		traversal(root1.val);
	}
	
	public BST_node parent(BST_node ob)
	{
		BST_node hop=root,hop2=null;
		//System.out.println(root.val);
		while(hop.left!=null || hop.right!=null)
		{
			hop2=hop;
			if(ob.val<hop.val)	
			{
				hop=hop.left;
			}
			else if(ob.val>hop.val)
			{
				hop=hop.right;
			}
			if(hop.val==ob.val)
				
			{
				break;
			}
		}
		
		if(ob==root)
		{
			hop2=null;
		}
		//System.out.println(hop2.val);
		return hop2;
	}
	
	
	
	public int delete(Integer v)
	{
		BST_node ob=search(v);
		if (ob==null)
		{
			return -1;//System.out.println("element not found...");
		}
		
		else
		{
			//System.out.println(ob.val);
			deletion(ob);
			return 1;
		}
	}
	
	public void del0cn(BST_node ob,BST_node pob)
	{
		if(ob==pob.right)
		{
			pob.right=null;
		}
		else
		{
			pob.left=null;
		}
	}
	
	public void del1cn(BST_node ob,BST_node pob)
	{
		if(ob==pob.left)
		{
			if(ob.left!=null)
			{
				pob.left=ob.left;
			}
			else
			{
				pob.left=ob.right;
			}
		}
		else
		{
			if(ob.left!=null)
			{
				pob.right=ob.left;
			}
			else
			{
				pob.right=ob.right;
			}
		}
		
	}
	
	public BST_node  rmcolst(BST_node ob)//right most child of left subtree
	{
		BST_node v=ob.left;
		while(v.right!=null)
		{
			v=v.right;
		}
		return v;
	}
	
	public BST_node  lmcorst(BST_node ob)
	{
		BST_node v=ob.right;
		while(v.left!=null)
		{
			v=v.left;
		}
		return v;
	}
	
	
	
	public void del2cn(BST_node ob,BST_node pob)
	{
		BST_node a=lmcorst(ob);
		//System.out.println(ob.val);
		//System.out.println(root.val);
		
		deletion(a);
		ob.val=a.val;
	}
	
	public void deletion(BST_node ob)
	{
		BST_node pob=parent(ob);
		if(pob!=null)
		{System.out.println(pob.val);}
		if(ob.right==null && ob.left==null)
		{
			del0cn(ob,pob);
		}
		
		else if(ob.right!=null && ob.left!=null)
		{
			del2cn(ob,pob);
		}
		
		else
		{
			del1cn(ob,pob);
		}
	}
	
	public int max(int a,int b)
	{
		if(a>=b)
		{
			return a; 
		}
		else
		{
			return b;
		}
	}
	
	public int height(BST_node ob)
	{
		if(ob==null)
		{
			return -1;
		}
		else
		{
			return(max(height(ob.left),height(ob.right))+1);
		}
	}


}
