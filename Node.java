
public class Node {

	Node lchild;
	Node rchild;
	int data;
	
	Node(int d){
	
		data = d;
		lchild = null;
		rchild = null;
	}
	
	public Node insert(int key) {
		
		if(key<data) {
			if(lchild==null)
				lchild = new Node(key);
			else lchild.insert(key);
	}
		else {
			if(rchild==null)
			rchild = new Node(key);
		else rchild.insert(key);
		}
		return this;
	}
		
	 public void inorder() {
		 
	        if (lchild != null)  
	            lchild.inorder();
	        System.out.print(data + " ");
	        if (rchild != null)  
	            rchild.inorder();
	 }
	 public void postorder() {
		 
	        if (lchild != null)  
	            lchild.postorder();
	        if (rchild != null)  
	            rchild.postorder();
	        System.out.print(data + " ");
	 }
		
	 public void preorder() {
		
		 System.out.print(data + " ");
		 	if (lchild != null)  
	            lchild.preorder();
	        if (rchild != null)  
	            rchild.preorder();
	 }
	 
	 public boolean search(int key) {
		 
		 if(this.data == key)
			 return true;
		 else if(key < this.data && lchild!=null)
			 return lchild.search(key);
		 else if(key > this.data && rchild!=null )
			 return rchild.search(key);
		 else return false;
		 
	 }
	
	 public int find_Max() {
		 
		 if(this.rchild == null)
			 return this.data;
		 else return rchild.find_Max();
	 }
	 
 public int find_Min() {
		 
		 if(this.lchild == null)
			 return this.data;
		 else return lchild.find_Min();
 }
 
 public int successor() {
	 
	 if(rchild==null && lchild ==null)
		 return 0;
	 else if(rchild==null)
		 return 0;
	 else return rchild.find_Min();
 }
 
 
 public int height() {
	 
	 if(lchild == null && rchild == null)
		 return 0;
	 else if(lchild != null && rchild == null)
		 return lchild.height()+1;
	 else if(lchild == null && rchild != null)
		 return rchild.height()+1;
	 else return lchild.height()>rchild.height()? lchild.height()+1:rchild.height()+1;
		 
 }

 
 }
	

