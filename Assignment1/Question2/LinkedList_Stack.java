/*Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and checkEmpty ()
operations on the stack. Create two stacks and write a menu-driven program to perform operations on
the two stacks. Whenever the number of elements in the two stacks becomes equal, a message should
automatically be generated displaying the number of elements in each stack*/

package Assignment1.Question2;
import java.util.Scanner;

public class LinkedList_Stack {
	
	//creating a node (data,address to next element)
	private class Node {
	     int data; 
	     Node next; // reference variable for the node
	}

	Node top;  //root pointing to the first node
	
	LinkedList_Stack()
     {
	     this.top = null; //Points to null as the stack is empty no address is there in top
	 }
	
	boolean checkEmpty()
    {
        return (top == null);
    }

	//We are inserting the last element at the starting of the list
	//If we insert at the end every time we will need to traverse till the end as stack works on LIFO principle
	void push(int data)  
	    {
	        Node temp = new Node();	//temporary node to store data 
	        temp.data = data;	        
	        temp.next = top;     
	        top = temp;
	    }
	
	void pop() 
	    {
	        if(checkEmpty())
	            System.out.println("\nStack Underflow");
	          
	        else {
	        	System.out.println("The popped element is:"+top.data);
	        	top = top.next;
	        }
	        
	}
	
	void Count(LinkedList_Stack stack)
	    {
	        Node temp1 = this.top;
	        Node temp2 = stack.top;
	        int count = 0;
	        while (temp1 != null && temp2 != null)
	        {
	            count++;
	            temp1 = temp1.next;
	            temp2 = temp2.next;
	        }
	       if(count != 0 && temp1==null && temp2==null)
	    	   System.out.println("The number of elements in both the stack are equal i.e.= "+count);
	    	   
	    }
	
	void display()
	    {
	        if (checkEmpty())
	            System.out.println("\nStack Underflow");
	        
	        else {
	            Node temp = top;
	            while (temp != null) {           
	                System.out.print("\t "+temp.data);
	                temp = temp.next;
	            }
	        }
	    }
	
	 public static void main(String[] args)
	    {
		    System.out.println("\n\n**********IMPLEMENTING STACK USING LINKEDLIST *************\n\n");
	    	LinkedList_Stack stack1 = new LinkedList_Stack();
	        LinkedList_Stack stack2 = new LinkedList_Stack();
	        Scanner sc=new Scanner(System.in);   
	        int ch;
			do {
				System.out.println("1. Push Element in stack 1 ");
				System.out.println("2. Pop Element in stack 1 ");
				System.out.println("3. Push Element in stack 2 ");
				System.out.println("4. Pop Element in stack 2 ");
				System.out.println("Enter your choice? ");
				ch=sc.nextInt();
	            
				switch(ch){
				case 1:
					System.out.println("Enter the data you want to add to stack 1");
					stack1.push(sc.nextInt());
	                break;
				case 2:
					stack1.pop();
					stack1.display();
					break;
				case 3:
					System.out.println("Enter the data you want to add to stack 2");
					stack2.push(sc.nextInt());

					break;
				case 4:
					stack2.pop();
					stack2.display();                    
					break;		
				default:
					System.out.println("Please enter a valid choice!!");
				}
				stack1.Count(stack2);
				System.out.println("\nDo you want to continue.....(1.Yes/2.No)");
				ch=sc.nextInt();
			}while(ch==1);         

	    }
}
