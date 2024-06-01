package queue;

import java.util.Scanner;

public class Priority_Queue {
//Linear
	int MaxSize;
	int[] MyQueue;
	int rear;
	int front;
	void createMyQueue( int size) {
		MaxSize=size;
		rear=-1;
		front=0;
		MyQueue= new int[MaxSize];
		
	}
	int MyQueue() {
		int temp = MyQueue[front];
		front++;
		return temp;
	}
	void enqueue(int e) {
		
		rear++;
		//Ascending
		for(int i=front ;i<rear;i++) {
			for(int j=front; j<rear ;j++) {
				if(MyQueue[j]>MyQueue[j+1]) {
					int temp= MyQueue[j];
					MyQueue[j]= MyQueue[j+1];
					MyQueue[j+1]=temp;
				}
			}
		}
		MyQueue[rear]=e;
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
	void printMyQueue() {
		for(int i=front;i<=rear;i++) {
			System.out.println(MyQueue[i]);
		}
	}

	public static void main(String[] args) {
		int size,element,choice;
        Priority_Queue obj=new Priority_Queue();
        System.out.println("Enter size:");
        Scanner in=new Scanner(System.in);
        size=in.nextInt();
        obj.createMyQueue(size);
        do
        {
            System.out.println("\n1.enque\n2.MyQueue\n3.print \n0.Exit\n:");
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
                        System.out.println("MyQueue is full..");
                    break;
                case 2:
                    if(obj.isEmpty()!=true)
                        System.out.println("Element Poped:"+obj.MyQueue());
                    else
                        System.out.println("MyQueue is Empty..");
                    break;
               
                case 3:
                    if(obj.isEmpty()!=true) {
                        System.out.println("Element in stack are");
                        obj.printMyQueue();
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
