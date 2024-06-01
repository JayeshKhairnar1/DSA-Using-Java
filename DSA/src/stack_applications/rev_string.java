package stack_applications;

import java.util.Scanner;

public class rev_string {

	int MaxSize;
	int tos;
	char stack[];

	/*
	 * create_stack: ------------- a)create stack, b)init tos=-1 , c)prepare stack
	 * for use
	 */
	void create_Stack(int size) {
		MaxSize = size;
		tos = -1;
		stack = new char[MaxSize];

	}

	void push(char e) {
		tos++;
		stack[tos] = e;
	}

	boolean isFull() {
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}
	char pop() { //remove and return top element
		char temp= stack[tos];
		tos--;
		return (temp);
	}
	boolean isEmpty() {
		if(tos==-1) 
			return true;
		else
			return false;
	}
	
	//from tos to zero :LIFO
	void print_Stack() {
		for(int i=tos; i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	public static void main(String args[])
    {
        
        
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        int len = str.length();
        rev_string obj=new rev_string();
        obj.create_Stack(len);
        for(int i=0; i< len; i++) {
        	obj.push(str.charAt(i));
        }
        String rev="";
        while(obj.isEmpty()!=true) {
        	rev= rev+obj.pop();
        }
        System.out.print(rev);
        sc.close();
    }
}



