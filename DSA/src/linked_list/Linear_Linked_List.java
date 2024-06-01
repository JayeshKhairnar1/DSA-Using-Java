package linked_list;

import java.util.Scanner;

public class Linear_Linked_List {
	Node root;

	void create_list() {
		root = null;// indicates list is not created till now
	}

	void insert_left(int data) {
		Node n = new Node(data);
		if (root == null)// root is assigned not created
			root = n;
		else {
			n.next = root;// 1
			root = n;// 2
		}
	}

	void delete_left() {
		if (root == null)
			System.out.println("List empty");
		else {
			Node t = root;// 1
			root = root.next;// 2
			System.out.println("Deleted:" + t.data);// 3 only to show response
		}
	}

	void insert_right(int data) {
		Node n = new Node(data);
		if (root == null)// root is assigned not created
			root = n;
		else {
			Node t = root;// 1
			while (t.next != null)// 2
			{
				t = t.next;//
			}
			t.next = n;// 3
		}
	}

	void insert_at(int data, int pos) {
		if (pos == 0)// before the root
		{
			Node n = new Node(data);
			n.next = root;
			root = n;
		} else {
			Node t = root;
			Node t2 = root;
			while (pos > 0 && t != null) {
				pos--;
				t2 = t;
				t = t.next;
			}
			if (t == null)
				System.out.println("Position out of range");
			else {
				Node n = new Node(data);
				t2.next = n;
				n.next = t;
				System.out.println("inserted...");
			}
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
				root = null;// manual deletion of root
			else
				t2.next = null;// 3
			System.out.println("Deleted:" + t.data);// 3 only to show response
		}
	}

	void print_list() {
		if (root == null)// root is assigned not created
			System.out.println("Empty List");
		else {
			Node t = root;// 1
			while (t != null)// 2
			{
				System.out.print("|" + t.data + "|->");
				t = t.next;//
			}
		}
	}

	void delete_at(int pos) {
		if (root == null) { // check if the list is empty
			System.out.println("Empty list");
			return;
		}
		if (pos < 0) { // check if the position is invalid
			System.out.println("Invalid position");
			return;
		}
		if (pos == 0) { // delete the root node
			root = root.next;
			System.out.println("Deleted...");
		} else {
			Node t = root;
			Node t2 = null;
			while (pos > 0 && t != null) {
				pos--;
				t2 = t;
				t = t.next;
			}
			if (t == null) {
				System.out.println("Position out of range");
			} else {
				t2.next = t.next;
				System.out.println("Deleted...");
			}
		}
	}

	void search(int key) {
		if (root == null)// root is assigned not created
			System.out.println("Empty List");
		else {
			Node t = root;// 1
			while (t != null && t.data != key)// 2
				t = t.next;
			if (t == null)// not found
				System.out.println(key + " not found in list");
			else
				System.out.println(key + " found in list");
		}
	}

	void delete(int key) {
		if (root == null)// root is assigned not created
			System.out.println("Empty List");
		else {
			Node t = root;// 1
			Node t2 = root;// 1
			while (t != null && t.data != key)// 2
			{
				t2 = t;
				t = t.next;
			}
			if (t == null)// not found
				System.out.println(key + " not found in list");
			else // found
			{
				System.out.println(key + " found in list");
				if (t == root)// case 1:
					root = root.next;
				else if (t.next == null)// case 2
					t2.next = null;
				else// case 3
					t2.next = t.next;
				System.out.println("Deleted:" + t.data);
			}
		}
	}

	public static void main(String args[]) {
		int ch, e;
		Scanner in = new Scanner(System.in);
		Linear_Linked_List obj = new Linear_Linked_List();
		obj.create_list();// user given size :stack
		do {
			System.out.println(
					"\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n7.Delete On Data\n8.Insert at\n0.Exit\n:");
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
				obj.print_list();
				break;
			case 6:
				System.out.println("Enter data:");
				e = in.nextInt();
				obj.search(e);
				break;
			case 7:
				System.out.println("Enter data:");
				e = in.nextInt();
				obj.delete(e);
				break;
			case 8:
				System.out.println("Enter data:");
				e = in.nextInt();
				System.out.println("Enter position:");
				int pos = in.nextInt();
				obj.insert_at(e, pos);
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
