package tree;
public class DOUBLY_LINKED_LIST {
	Dnode root;

	void create_list() {
		root = null;
	}

	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null)// root is assigned not created
			root = n;
		else {
			n.left = root;
			root = n;// 2
		}
	}

	void delete_left() {
		if (root == null) {
			System.out.println("Empty");
		} else {
			Dnode t = root;
			root = root.right;
			if (root != null)
				root.left = null;
			System.out.println("Deleted " + t.data);

		}
	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;
		} else {
			Dnode t = root;
			while (t.right != null) {
				t.right = n;
				n.left = t;
			}
		}
	}
	
	void delete_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;
		} else {
			Dnode t = root;
			while (t.left != null) {
				t.right = n;
				n.left = t;
			}
		}
	}
	void delete_right() {
		if (root == null)
			System.out.println("List empty");
		else {
			Dnode t, t2;
			t = t2 = root;// 1
			while (t.right != null)// 2
			{
				
				t = t.right;
			}
			if (t == root)//only for single node
				root = null;
			else
			t2=t.left;
			t2.right= null;
			System.out.println("Deleted:" + t.data);// 3 only to show response
		}
	}
	void print() { //start to end
		if (root == null)
			System.out.println("List is empty!!");
		else {
			Dnode t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.right;
			}
		}
	}
	void rev_print() { //end to start
		if (root == null)
			System.out.println("List is empty!!");
		else {
			Dnode t = root;
			//moving pointer to last node with node.right=null;
			while(t.right!=null) {
				t= t.right;
			}
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.left;
			}
		}
	}

}
