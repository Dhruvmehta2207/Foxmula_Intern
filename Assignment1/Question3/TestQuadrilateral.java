/*Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral should be
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object's area (except Quadrilateral)*/

package Assignment1.Question3;

import java.util.Scanner;

public class TestQuadrilateral {
	void input(int xy[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four coordinates (x,y)");
		for(int i=0;i<4;i++)
			for(int j=0;j<2;j++)
				xy[i][j]=sc.nextInt();
	}
	public static void main(String[] args) {
		int xy[][]=new int[4][2];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("******SQUARE******");
		new TestQuadrilateral().input(xy);
		Square sq=new Square(xy);
		System.out.println("Area Of The Square is " + sq.area());
		
		System.out.println("\n******RECTANGLE******");
		new TestQuadrilateral().input(xy);
		Rectangle rec=new Rectangle(xy);
		System.out.println("Area Of The Rectangle is " + rec.area());
		
		System.out.println("\n******PARALLELOGRAM******");
		new TestQuadrilateral().input(xy);
		System.out.println("ENTER HEIGHT: ");
		Parallelogram p=new Parallelogram(xy,sc.nextInt());
		System.out.println("Area Of The Parallelogram is " + p.area());
		
		System.out.println("\n******TRAPEZOID******");
		new TestQuadrilateral().input(xy);
		System.out.println("ENTER HEIGHT: ");
		Trapezoid t=new Trapezoid(xy,sc.nextInt());
		System.out.println("Area Of The Trapezoid is " + t.area());

	}
}
