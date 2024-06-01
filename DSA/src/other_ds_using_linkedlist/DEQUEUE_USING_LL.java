package other_ds_using_linkedlist;

import java.util.Scanner;



public class DEQUEUE_USING_LL {
	Node front;
	Node rear;

	void create_dequeu() {
		front = rear = null;
	}

	void enqueue(int data) {
		Node n = new Node(data);
		if (rear == null)
			rear = front = n;
		else {
			rear.next = n;
			rear = n;
		}
	}
	
	void dequeue() {
		if (front == null)
			System.out.println(" empty");
		else {
			
			Node t = front;
			if(front==rear)
			 front= rear = null;
			else
			 front= front.next;	
			System.out.println("Deleted:" + t.data);
			}
	}
	void print_deque() {
		if (front == null)
			System.out.println("Queue is empty!!");
		else {
			Node t = front;
			while (t != null) {
				if(t==front) System.err.print(" FRONT ");
				System.out.print("|" + t.data + "|->");
				if(t==rear) System.err.print(" REAR ");
				t = t.next;
			}
		}
	}    

	public static void main(String[] args) {
		int choice;
		DEQUEUE_USING_LL obj = new DEQUEUE_USING_LL();

		Scanner in = new Scanner(System.in);

		obj.create_dequeu();

		do {
			System.out.println("\n1.ENQUE\n2.DEQUE\n3.PRINT\n0.Exit\n:");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter num");
				int e = in.nextInt();
				obj.enqueue(e);;
				break;
			case 2:
				obj.dequeue();
				break;
			case 3:
				obj.print_deque();
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
