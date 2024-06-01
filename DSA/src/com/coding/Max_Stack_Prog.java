package com.coding;

import java.util.Scanner;
public class Max_Stack_Prog {
	int MaxSize,tos,stack[], max_stack[], max_tos;
    void create_Stack(int size)
    {
        MaxSize=size;
        tos=-1;
        max_tos=-1;
        stack=new int[MaxSize];
        max_stack= new int [MaxSize];
    }

    void push(int e)
    {
    	
        tos++;
        stack[tos]=e;
        if(e > max_peek()) 
        {
        	max_stack[tos]=e;
        }
        
        
        
        
    }
    void max_push(int e)
    {
    	
        max_tos++;
        stack[max_tos]=e;
           
    }

    boolean isFull()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
    }

    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
    }

    int peek()
    {
        return(stack[tos]);
    }

    int max_peek()
    {
        return(max_stack[max_tos]);
    }

    boolean isEmpty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }
    void print_Stack()
    {
        for(int i=tos;i>-1;i--)
        {
            System.out.println(stack[i]);
        }
    }
	public static void main(String[] args) {
		 int size,element,choice;
	        Max_Stack_Prog normal=new  Max_Stack_Prog();
	        Max_Stack_Prog max_stack=new  Max_Stack_Prog();
	       
	        Scanner in=new Scanner(System.in);
	 /*       
	        
		do
        {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print Stack\n0.Exit\n:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    if(obj.isFull()!=true)
                    {
                        System.out.println("Enter an element:");
                        element=in.nextInt();
                        obj.push(element);
                    }
                    else
                        System.out.println("Stack is full..");
                    break;
                case 2:
                    if(obj.isEmpty()!=true)
                        System.out.println("Element Poped:"+obj.pop());
                    else
                        System.out.println("Stack is Empty..");
                    break;
                case 3:
                    if(obj.isEmpty()!=true)
                        System.out.println("Element @ Peek:"+obj.peek());
                    else
                        System.out.println("Stack is Empty..");
                    break;
                case 4:
                    if(obj.isEmpty()!=true) {
                        System.out.println("Element in stack are");
                        obj.print_Stack();
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

	

*/
	}}
