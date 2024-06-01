package stack_applications;

import java.util.Scanner;

public class dec_to_binary {
	int MaxSize;
	int tos;
	int stack[];
	
	void create_Stack(int size) {
		MaxSize = size;
		tos = -1;
		stack = new int[MaxSize];
	}

	void push(int e) {
		tos++;
		stack[tos] = e;
	}

	
	boolean isEmpty() {
		if(tos==-1) 
			return true;
		else
			return false;
	}
	
	void print_Stack() {
		for(int i=tos; i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String args[])
    {
        int size=64;
      
        Scanner in=new Scanner(System.in);
        dec_to_binary obj= new dec_to_binary();
        obj.create_Stack(size);
        //read a number in DEC
        System.out.print("Enter no");
        int num= in.nextInt();
        
        //using loop break number/2 and push remainder to stack
        while(num>0) {
        int rem=(num%2);
        	obj.push(rem);
        	num=num/2;
        }
       obj.print_Stack();
       in.close();
    }
}















