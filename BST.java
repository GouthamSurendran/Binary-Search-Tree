
public class BST {
	
	protected Node root;
	
	public void insert(int key) {
		
		if(root==null)
			root = new Node(key);
		else root = root.insert(key);
	}
	
	 public void inorder() {
	        if (root == null)
	            return;
	        else
	            root.inorder();
	    }
	 public void preorder() {
	        if (root == null)
	            return;
	        else
	            root.preorder();
	    }
	 
	 public void postorder() {
	        if (root == null)
	            return;
	        else
	            root.postorder();
	    }
	 
	 public boolean search(int key) {
		 
		 if(this.root==null)
			 return false;
		 else return root.search(key);
	 }
	 
	 public int find_Max() {
		 
		 if(this.root==null)
			 return 0;
		 else return root.find_Max();
	 }
	 
 public int find_Min() {
		 
		 if(this.root==null)
			 return 0;
		 else return root.find_Min();
	 }
 
 public int successor() {
	
	 if(root==null)
		 return 0;
	 else 
		 return root.successor();
	 
 }
 
	public int height() {
		if (root == null)
			return 0;
		else
			return root.height();
}
	
	
	int minValue(Node root) 
    { 
        int minv = root.data; 
        while (root.lchild != null) 
        { 
            minv = root.lchild.data; 
            root = root.lchild; 
        } 
        return minv; 
    } 
	
	   void deleteKey(int key) 
	    { 
	        root = deleteRec(root, key); 
	    } 
	  
	    /* A recursive function to insert a new key in BST */
	    Node deleteRec(Node root, int key) 
	    { 
	        /* Base Case: If the tree is empty */
	        if (root == null)  return root; 
	  
	        /* Otherwise, recur down the tree */
	        if (key < root.data) 
	            root.lchild = deleteRec(root.lchild, key); 
	        else if (key > root.data) 
	            root.rchild = deleteRec(root.rchild, key); 
	  
	        // if key is same as root's key, then This is the node 
	        // to be deleted 
	        else
	        { 
	            // node with only one child or no child 
	            if (root.lchild == null) 
	                return root.rchild; 
	            else if (root.rchild == null) 
	                return root.lchild; 
	  
	            // node with two children: Get the inorder successor (smallest 
	            // in the right subtree) 
	            root.data = minValue(root.rchild); 
	  
	            // Delete the inorder successor 
	            root.rchild = deleteRec(root.rchild, root.data); 
	        } 
	  
	        return root; 
	    } 
}
