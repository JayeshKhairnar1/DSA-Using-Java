package other_ds_using_linkedlist;

import java.util.Scanner;
public class STACK_USING_LL {
	Node tos;

	void create_stack() {
		tos = null;// indicates list is not created till now
	}

	void push(int data) {
		Node n = new Node(data);
		if (tos == null)// root is assigned not created
			tos = n;
		else {
			n.next = tos;// 1
			tos = n;// 2
		}
	}

	void pop() {
		if (tos == null)
			System.out.println("List empty");
		else {
			Node t = tos;// 1
			tos = tos.next;// 2
			System.out.println("Deleted:" + t.data);// 3 only to show response
		}
	}
   void peek() {
	   if (tos == null)
			System.out.println("List empty");
	   else {
		
		System.out.println("Peek is: "+ tos.data);
	}
   }
	

	void print_stack() {
		if (tos == null)
			System.out.println("List is empty!!");
		else {
			Node t = tos;
			while (t != null) {
				if(t==tos) {System.out.print("TOS:");}
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}    

	public static void main(String[] args) {
		int choice;
		STACK_USING_LL obj = new STACK_USING_LL();

		Scanner in = new Scanner(System.in);

		obj.create_stack();

		do {
			System.out.println("\n1.PUSH \n2. POP \n3.peek\n4. print\n0.Exit\n:");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter num");
				int e = in.nextInt();
				obj.push(e);
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.peek();
				break;
			case 4:
				obj.print_stack();
				break;
			

			case 0:
				System.out.println("Thanks for using the code...");
				break;
			default:
				System.out.println("Wrong option selected..");
				break;
			}

		} while (choice != 0);
		in.close();
	}

}
