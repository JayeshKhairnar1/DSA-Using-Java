package linked_list;

import java.util.Scanner;
public class CIRCULAR_LINKED_LIST {
	Node root, last;

	void create() {
		root = last = null;

	}

	void insert_left(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = last = n;
		} else {
			n.next = root;
			root = n;
		}
	}

	void insert_right(int data) {
		Node n = new Node(data);
		if (last == null) {
			root = last = n;
			last.next = root;
		} else {
			Node t = last;

			t.next = root;
			last = n;
		}
	}

	void delete_right() {
		if (root == null)
			System.out.println("List empty");
		else {
			Node t, t2;
			t = t2 = root;// 1
			while (t.next != null)// 2
			{
				t2 = t;// left behind
				t = t.next;// moves ahead
			}
			if (t == root)// only for single node
				root = last = null;// manual deletion of root
			else {
				last = t2;
				t2.next = root;
				System.out.println("Deleted:" + t.data);// 3 only to show response
			}
		}
	}

	void delete_left() {
		if (root == null)
			System.out.println("List empty");
		else {
			Node t1 = root; 
			root =root.next;	
			last.next= root;
			System.out.println("DELETE "+t1.data );
		}
	}
	
		void print() {
			if(root==null) {
				System.out.println("Empty");
			}
			else {
				Node t =root;
				do {
					System.out.print("|" + t.data + "|->");
					t = t.next;
				}
				while(t!= root);
			}
		}
		
		public static void main(String args[])
	    {
	        int ch,e;
	        Scanner in = new Scanner(System.in);
	        CIRCULAR_LINKED_LIST obj = new CIRCULAR_LINKED_LIST();
	        obj.create();//user given size :stack
	        do {
	            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n7.Delete On Data\n8.Insert at\n0.Exit\n:");
	            ch = in.nextInt();
	            switch (ch) {
	                case 1:
	                    System.out.println("Enter data:");
	                    e = in.nextInt();
	                    obj.insert_left(e);
	                    System.out.println("Data to inserted");
	                    break;
	                case 2:
	                    System.out.println("Enter data:");
	                    e = in.nextInt();
	                    obj.insert_right(e);
	                    System.out.println("Data to inserted");
	                    break;
	                case 3:
	                    obj.delete_left();
	                    break;
	                case 4:
	                    obj.delete_right();
	                    break;
	                case 5:
	                    obj.print();
	                    break;
	                
	                
	                case 0:
	                    System.out.println("Exiting.....");
	                    break;
	                default:
	                    System.out.println("Wrong option selected");
	                    break;
	            }
	        } while (ch != 0);
	        in.close();
	    }	
}
