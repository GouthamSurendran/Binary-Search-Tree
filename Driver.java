
public class Driver {

	public static void main(String[]args) {
		
		BST b = new BST();
		b.insert(10);
		b.insert(20);
		b.insert(5);
		b.insert(35);
		b.insert(1);
		System.out.println("Inorder");
		b.inorder();
		System.out.println("preorder");
		b.preorder();
		System.out.println("");
		System.out.println(b.search(100)+"");
		System.out.println(b.search(5));
		
		System.out.println("The max element is " + b.find_Max());
		System.out.println("The min element is "+b.find_Min());
		
		System.out.println("The successor of the root node is "+b.successor());
		
		System.out.println("The height of the BST is  "+b.height());
		
		b.deleteKey(10);
		System.out.println("postorder");
		b.postorder();

	}
}
