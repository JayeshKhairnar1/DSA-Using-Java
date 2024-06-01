package com.coding;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
class Stack_Basic2 {
    int MaxSize, tos, stack[];

    //create_Stack:creates stack,init tos -1 and prepare stack for use
    void create_Stack(int size) {
        MaxSize = size;
        tos = -1;
        stack = new int[MaxSize];
    }

    //push(e):will insert element on top of stack
    //            tos+1
    void push(int e) {
        tos++;//1
        stack[tos] = e;//pushed---stack[++tos]=e
    }

    //isFull():returns true if full else false
    boolean isFull() {
        if (tos == MaxSize - 1)//as array
            return true;
        else
            return false;
    }

    //pop():e remove and return element from tos,tos-1
    int pop() {
        int temp = stack[tos];//1
        tos--;//2
        return (temp);//3
    }

    //peek():e only returns element from tos/on the top
    int peek() {
        return (stack[tos]);
    }

    //isEmpty():returns true if empty else false
    boolean isEmpty() {
        if (tos == -1)//as array
            return true;
        else
            return false;
    }

    //print_stack():prints data in LIFO manner,tos to 0
    void print_Stack() {
        for (int i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }
}

class Linear_Linked_List {
    Node root;

    void create_list() {
        root = null;//indicates list is not created till now
    }

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null)//root is assigned not created
            root = n;
        else {
            n.next = root;//1
            root = n;//2
        }
    }

    void print_list() {
        if (root == null)//root is assigned not created
            System.out.println("Empty List");
        else {
            Node t = root;//1
            while (t != null)//2
            {
                System.out.print("|" + t.data + "|->");
                t = t.next;//
            }
        }
    }

    void list_reversal() {
        if (root == null)//root is assigned not created
            System.out.println("Empty List");
        else {
            Node t = root;//1
            Stack_Basic2 s = new Stack_Basic2();
            s.create_Stack(10);
            while (t != null)//2
            {
                s.push(t.data);
                t = t.next;//
            }
            t = root;//1
            while (t != null)//2
            {
                t.data = s.pop();
                t = t.next;
            }
            System.out.println("List reversed..............");
        }
    }
}

    public class List_reverse {
        public static void main(String args[]) {
            Linear_Linked_List obj = new Linear_Linked_List();
            obj.create_list();
            obj.insert_left(100);
            obj.insert_left(90);
            obj.insert_left(80);
            obj.insert_left(70);
            obj.print_list();
            obj.list_reversal();
            obj.print_list();
        }
    }
