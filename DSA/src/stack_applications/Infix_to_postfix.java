package stack_applications;
import java.util.Scanner;

public class Infix_to_postfix {
	int MaxSize, tos;
	char MyStack[];
	static char postfix[];
	int postfixIndex;

	void create_Stack(int size) {
		MaxSize = size;
		tos = -1;
		MyStack = new char[MaxSize];
		postfix = new char[MaxSize];
		postfixIndex = 0;
	}

	void push(char e) {
		MyStack[++tos] = e;
	}

	boolean isFull() {
		return tos == MaxSize - 1;
	}

	char pop() {
		return MyStack[tos--];
	}

	char peek() {
		return MyStack[tos];
	}

	boolean isEmpty() {
		return tos == -1;
	}

	void print_Stack() {
		for (int i = tos; i > -1; i--) {
			System.out.println(MyStack[i]);
		}
	}

	int priority(char c) {
		switch (c) {
		case '^':
			return 3;
		case '*', '%', '/':
			return 2;
		case '+', '-':
			return 1;
		case '(', ')':
			return 0;
		default:
			return -1;
		}
	}

	void actualConversion(String exp) {
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			if (Character.isLetterOrDigit(c)) {
				postfix[postfixIndex++] = c;
			} else if (c == '(') {
				push(c);
			} else if (c == ')') {
				while (!isEmpty() && peek() != '(') {
					postfix[postfixIndex++] = pop();
				}
				if (!isEmpty() && peek() != '(') {
					System.out.println("Invalid Expression"); 					return;
				} else {
					pop();
				}
			} else {
				while (!isEmpty() && priority(c) <= priority(peek())) {
					postfix[postfixIndex++] = pop();
				}
				push(c);
			}
		}

		while (!isEmpty()) {
			postfix[postfixIndex++] = pop();
		}

		System.out.print("Postfix expression: ");
		for (int i = 0; i < postfixIndex; i++) {
			System.out.print(postfix[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter infix expression:");
		String line = in.next();
		 Infix_to_postfix obj = new Infix_to_postfix();
		 obj.create_Stack(line.length());
		 obj.actualConversion(line);
		 in.close();
	}
}
