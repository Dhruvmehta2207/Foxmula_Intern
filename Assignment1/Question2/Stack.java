/*Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and checkEmpty ()
operations on the stack. Create two stacks and write a menu-driven program to perform operations on
the two stacks. Whenever the number of elements in the two stacks becomes equal, a message should
automatically be generated displaying the number of elements in each stack*/

package Assignment1.Question2;
import java.util.Scanner;

public class Stack {
	private int stack[],top,max=100;
	
	Stack(){
		top=-1;
		stack=new int[max];
	}
	
	//Adding elements
	void push(int data) {
		if(top>=max)
			System.out.println("Stack Overflow!!");
		else
			stack[++top]=data;
	}
	
	//To check if the stack is empty
	boolean checkEmpty() {
		
		if(top==-1)
			return true;
		else
			return false;
	}
	
	//Deleting the elements
	int pop() {
		if(checkEmpty())
			return -1;
			
		else
			return stack[top--];
	}
	
	//to check for the length of both the stacks
	void CountCheck(Stack s2) {
		if(this.top==s2.top && s2.top>-1)
			System.out.println("The number of elements in both the stacks = "+(s2.top+1));
	}
	
	//display the elements of the stack
	void display() {
		if(checkEmpty()) 
			System.out.println("Stack Underflow!!");
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]+"\t");
	}
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Stack s1=new Stack();
		Stack s2=new Stack();
		int ch,temp;
		do {
			System.out.println("1. Push Element in stack 1 ");
			System.out.println("2. Pop Element in stack 1 ");
			System.out.println("3. Push Element in stack 2 ");
			System.out.println("4. Pop Element in stack 2 ");
			System.out.println("Enter your choice? ");
			ch=sc.nextInt();
			s1.CountCheck(s2);
			switch(ch){
			case 1:
				System.out.println("Enter the data you want to add to stack 1");
				s1.push(sc.nextInt());
				break;
			
			case 2:
				temp=s1.pop();
				if(temp==-1) 
					System.out.println("Stack Underflow!!");
				else	
					System.out.println("The popped element is:"+temp);
				s1.display();
				break;
			
			case 3:
				System.out.println("Enter the data you want to add to stack 2");
				s2.push(sc.nextInt());
				break;
				
			case 4:
				temp=s2.pop();
				if(temp==-1) 
					System.out.println("Stack Underflow!!");
				else	
					System.out.println("The popped element is:"+temp);
				s2.display();
				break;
				
			}
			System.out.println("\n\nDo you want to continue.....(1.Yes/2.No)");
			ch=sc.nextInt();
		}while(ch==1);
	}
}
