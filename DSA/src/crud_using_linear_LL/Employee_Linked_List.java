package crud_using_linear_LL;

import java.util.Scanner;

public class Employee_Linked_List {
	Emp_Node root;
    static Scanner sc = new Scanner(System.in);

    void create_Emp_list() {
        root = null;
    }

  
    void insert_Emp_right(int employee_ID, String name, char gender, double salary ) {
        Emp_Node n = new Emp_Node( employee_ID,name, gender, salary);
        if (root == null)
            root = n;
        else {
            Emp_Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void search(int key) {
        if (root == null)
            System.out.println("Empty List");
        else {
            Emp_Node t = root;
            while (t != null && t.employee_ID != key)
                t = t.next;
            if (t == null)
                System.out.println(key + " not found in list");
            else {
                System.out.println("+------------------------------------------------------------+");
                System.out.printf("| %-12d | %-20s | %-10s | %-10.2f |%n", t.employee_ID, t.name, t.gender, t.salary);
                System.out.println("+------------------------------------------------------------+");
            }
        }
    }

    void delete(int key) {
        if (root == null)
            System.out.println("Empty List");
        else {
            Emp_Node t = root;
            Emp_Node t2 = root;
            while (t != null && t.employee_ID != key) {
                t2 = t;
                t = t.next;
            }
            if (t == null)
                System.out.println("Employee with ID: " + key + " not found in list");
            else {
                System.out.println(" Employee found in list");
                if (t == root)
                    root = root.next;
                else if (t.next == null)
                    t2.next = null;
                else
                    t2.next = t.next;
                System.out.println("Employee with Id:" + key + "Name: " + t.name + " Deleted:");
            }
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("List is empty!!");
        else {
            Emp_Node t = root;
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|                      Employee Details                      |");
            System.out.println("+------------------------------------------------------------+");
            System.out.printf("| %-12s | %-20s | %-10s | %-10s |%n", "Employee ID", "Name", "Gender", "Salary");
            while (t != null) {
                System.out.println("+------------------------------------------------------------+");
                System.out.printf(" %-12d | %-20s | %-8s | %-10.2f %n", t.employee_ID, t.name, t.gender, t.salary);
                t = t.next;
            }
            System.out.println("+------------------------------------------------------------+");
        }
    }

    public static void main(String[] args) {
        int choice;
        Employee_Linked_List obj = new Employee_Linked_List();

        obj.create_Emp_list();

        do {
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|                  --Jayesh Khairnar--                       |");
            System.out.println("|    1: ADD Employee           2: Delete Employee            |");
            System.out.println("|    3: Search Employee        4:Print     0: Exit           |");
            System.out.println("+------------------------------------------------------------+");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("+------------------------------------------------------------+");
                    System.out.println("|       Enter: Employee ID, Name Gender [M/F/O], Salary       |");
                    System.out.println("+------------------------------------------------------------+");
                    int t_id = sc.nextInt();
                    String t_name = sc.next();
                    char t_gender = sc.next().charAt(0);
                    double t_salary = sc.nextDouble();
                    if (obj.is_id_unique(t_id))
                        obj.insert_Emp_right(t_id,t_name, t_gender, t_salary);
                    else
                        System.out.println("Employee ID already exists. Please enter a unique ID.");
                    	
                    break;

                case 2:
                    System.out.print("Enter ID to Delete here => ");
                    int del_id = sc.nextInt();
                    obj.delete(del_id);
                    break;
                case 3:
                    System.out.print("Enter ID to search here => ");
                    int t_search = sc.nextInt();
                    obj.search(t_search);
                    break;
                case 4:
                    obj.print_list();
                    break;
                case 0:
                    System.out.println("Code by Jayesh Khairnar...");
                    break;
                default:
                    System.out.println("Wrong option selected..");
                    break;
            }

        } while (choice != 0);
    }

    boolean is_id_unique(int id) {
        Emp_Node temp = root;
        while (temp != null) {
            if (temp.employee_ID == id)
            { return false;}
            temp = temp.next;
        }
        return true;
    }
}