package stack;

import java.util.Scanner;

public class Stack_Basic
{
    int MaxSize,tos,stack[];
    void create_Stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new int[MaxSize];
    }

    void push(int e)
    {
        tos++;
        stack[tos]=e;
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

    public static void main(String args[])
    {
        int size,element,choice;
        Stack_Basic obj=new Stack_Basic();
        System.out.println("Enter size of stack:");
        Scanner in=new Scanner(System.in);
        size=in.nextInt();
        obj.create_Stack(size);
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
    }
}