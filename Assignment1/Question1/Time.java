/*Create a class called Time, which has three private instance variables – hour, min and sec. It contains a
method called add ( ) which takes one Time object as parameter and print the added value of the calling
Time object and passes Time object. In the main method, declare two Time objects and assign values
using constructor and call the add ( ) method.
*/

package Assignment1.Question1;
import java.util.*; 

public class Time {

	private int hr,min,sec;
	Time(int hr,int min,int sec){
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
    
	Time(){
		hr=0;
		min=0;
		sec=0;
	}
    //Function to add the two times
	public Time add(Time time){
		Time t=new Time();
		t.sec=this.sec+time.sec;
		if(t.sec>=60)
			{
		
			t.min=(int)t.sec/60;
			t.sec=t.sec%60;
		}
		
		t.min+=this.min+time.min;
		if(t.min>=60){
			
			t.hr=(int)t.min/60;
			t.min=t.min%60;
		}
		
		t.hr+=this.hr+time.hr;
		if(t.hr>24)
			t.hr-=24;
		
		return t;
		
	}
	void display(String str) {
		System.out.println(str+""+hr+":"+min+":"+sec);
	}
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the time in (hour:minute:second) format");
		Time time1=new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter the time to add in (hour:minute:second) format");
		Time time2=new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		Time time3=time1.add(time2);
		
		time1.display("Time A:  ");
		time2.display("Time B:  ");
		time3.display("Time after addition:  ");
		}
}

