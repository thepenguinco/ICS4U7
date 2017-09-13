package JavaReview1;
import java.util.*;
public class JavaReview1_5
{
	public static void main(String[] args)
	{
		//Code:									Memory:						Output:
		int myNum = 5;							//myNum = 5
		double yourNum = 4.5;					//yourNum = 4.5
		yourNum = myNum + 2.5;					//yourNum = 7.5
		yourNum = yourNum - 2;					//yourNum = 5.5
		System.out.println(myNum);				//							5
		System.out.println(yourNum * 2);		//							11.0
		myNum = 3 * 2;							//myNum = 6
		yourNum = myNum - yourNum;				//yourNum = 0.5
		System.out.println(myNum);				//							6
		System.out.println(yourNum);			//							0.5
	}
}
