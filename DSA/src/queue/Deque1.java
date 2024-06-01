package queue;

import java.util.Scanner;

public class Deque1 {
	
	int MaxSize;
	int [] Deque;
	int rear;
	int front;
	void createDeque( int size) {
		MaxSize=size;
		rear=-1;
		front=0;
		Deque= new int[MaxSize];
		
	}
	int deque() {
		int temp = Deque[front];
		front++;
		return temp;
	}
	void enqueue(int e) {
		rear++;
		Deque[rear]=e;
	}
	boolean isFull() {
		if(rear==MaxSize-1) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isEmpty() {
		if(front>rear)
			return true;
		else {
			return false;
			
		}
	}
	void printDeque() {
		for(int i=front;i<=rear;i++) {
			System.out.println(Deque[i]);
		}
	}

	public static void main(String[] args) {
		int size,element,choice;
        Deque1 obj=new Deque1();
        System.out.println("Enter size:");
        Scanner in=new Scanner(System.in);
        size=in.nextInt();
        obj.createDeque(size);
        do
        {
            System.out.println("\n1.enque\n2.deque\n3.print \n0.Exit\n:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    if(obj.isFull()!=true)
                    {
                        System.out.print("Enter an element:");
                        element=in.nextInt();
                        obj.enqueue(element);
                    }
                    else
                        System.out.println("Deque is full..");
                    break;
                case 2:
                    if(obj.isEmpty()!=true)
                        System.out.println("Element Poped:"+obj.deque());
                    else
                        System.out.println("Deque is Empty..");
                    break;
               
                case 3:
                    if(obj.isEmpty()!=true) {
                        System.out.println("Element in stack are");
                        obj.printDeque();
                    }
                    else
                        System.out.println("Stack is Empty..");
                    break;
                case 0:
                    System.out.println("Thanks for using the code...");
                    break;
                default:
                    System.out.println("Wrong option selected..");
                    break;
            }

        }while(choice!=0);
        in.close();
	}

}
