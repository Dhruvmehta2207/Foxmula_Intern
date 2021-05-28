package Assignment1.Question3;

public class Trapezoid extends Quadrilateral{
	private int height;
	Trapezoid(int xy[][],int height)
	{
		setcoordinate(xy);
		this.height=height;
	}
	
	int area()
	{
		int d1=(int)Math.sqrt((xy[0][0]-xy[1][0])*(xy[0][0]-xy[1][0])+(xy[0][1]-xy[1][1])*(xy[0][1]-xy[1][1]));
		int d2=(int)Math.sqrt((xy[2][0]-xy[3][0])*(xy[2][0]-xy[3][0])+(xy[2][1]-xy[3][1])*(xy[2][1]-xy[3][1]));
		return (int)((d1+d2)*height)/2;
	}

}