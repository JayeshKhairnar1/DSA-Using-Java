package stack;

import java.util.Scanner;

public class DoubleStack {

	int MaxSize;
	static int tos1;
	static int tos2;
	int MyStack[];

	void create_Stack(int size) {
		MaxSize = size;
		tos1 = -1;
		tos2 = MaxSize;
		MyStack = new int[MaxSize];
	}

	void push1(int e1) {
		tos1++;
		MyStack[tos1] = e1;
	}

	void push2(int e2) {
		tos2--;
		MyStack[tos2] = e2;
	}

	int pop1() {
		int temp = MyStack[tos1];
		tos1--;
		return (temp);
	}

	int pop2() {
		int temp = MyStack[tos2];
		tos2++;
		return (temp);
	}

	int peek1() {
		return MyStack[tos1];
	}

	int peek2() {
		return MyStack[tos2];
	}

	void print1() {
		for (int i = tos1; i >=0; i--) {
			System.out.println(MyStack[i]);
		}
	}

	void print2() {
		for (int i = tos2 ; i < MaxSize; i++) {
			System.out.println(MyStack[i]);
		}
	}

	boolean isEmpty1() {
		if (tos1 == -1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isEmpty2() {
		if (tos2 == MaxSize) {
			return true;
		} else {
			return false;
		}
	}

	boolean isFull_1() {
		if (tos1 == MaxSize - 1 || (tos1 + 1 == tos2)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isFull_2() {
		if (tos2 == -1 || (tos2 - 1 == tos1)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size for Array:");
		int size = sc.nextInt();
		DoubleStack obj = new DoubleStack();
		obj.create_Stack(size);

		int userChoice;
		do {
			System.out.println("+------------------------------------------------------------+");
			System.out.println("|                  --Jayesh Khairnar--                       |");
			System.out.println("|        1: pop-1  2: pop-2  3: push-1  4: push-2            |");
			System.out.println("|        5: peek-2 6: peek-2 7: print-1 8: print-2           |");
			System.out.println("+------------------------------------------------------------+");


			userChoice = sc.nextInt();
			switch (userChoice) {
			case 1: {
				if (obj.isEmpty1() != true)
					System.out.println(obj.pop1());
				else {
					System.out.println("Stack is Empty!!");
				}
				break;
			}
			case 2: {
				if (obj.isEmpty2() != true)
					System.out.println(obj.pop2());
				else {
					System.out.println("Stack is Empty!!");
				}
				break;
			}
			case 3: {
				if (obj.isFull_1() != true) {
					System.out.println("Enter element");
					int e1 = sc.nextInt();
					obj.push1(e1);
				} else {
					System.out.println("Stack is full!!!");
				}
				break;
			}
			case 4: {
				if (obj.isFull_2()!= true) {
					System.out.println("Enter element");
					int e2 = sc.nextInt();
					obj.push2(e2);
				} else {
					System.out.println("Stack is full!!!");
				}
				break;
			}
			case 5:
				if(obj.isEmpty1()!=true)
			    System.out.println(obj.MyStack[tos1]);
				else 
				System.out.println("Stack is Empty");	
				break;
			case 6:
				if(obj.isEmpty2()!=true)
			    System.out.println(obj.MyStack[tos2]);
				else 
				System.out.println("Stack is Empty");	
				break;	
					
					
			case 7: {
				if(obj.isEmpty1()!=true) {
					obj.print1();
				}
				else {
					System.out.println("Stack is Empty!!");
				}
				break;
			}
			case 8: {
				if(obj.isEmpty2()!=true) {
					obj.print2();
				}
				else {
					System.out.println("Stack is Empty!!");
				}
				break;
			}
			default:
				System.out.println("Code Written By Jayesh Khairnar");
			}
		} while (userChoice != 0);
		sc.close();

	}

}
