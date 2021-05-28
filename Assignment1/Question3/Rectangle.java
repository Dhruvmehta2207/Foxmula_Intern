package Assignment1.Question3;

public class Rectangle extends Quadrilateral{
	Rectangle(int xy[][]){
		setcoordinate(xy);
		}
	
		int area(){
			int ar1=(int)Math.sqrt((xy[0][0]-xy[1][0])*(xy[0][0]-xy[1][0])+(xy[0][1]-xy[1][1])*(xy[0][1]-xy[1][1]));
			int ar2=(int)Math.sqrt((xy[0][0]-xy[3][0])*(xy[0][0]-xy[3][0])+(xy[0][1]-xy[3][1])*(xy[0][1]-xy[3][1]));
			return ar1*ar2;
		}
		}